package uk.co.wowcher.cashback.persistence.dao.impl;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import uk.co.wowcher.cashback.domain.beans.Category;
import uk.co.wowcher.cashback.domain.beans.Merchant;
import uk.co.wowcher.cashback.domain.beans.MerchantSubCategoryAssoc;
import uk.co.wowcher.cashback.domain.beans.SubCategory;
import uk.co.wowcher.cashback.persistence.dao.CategoryDAO;



@Component

public class CategoryDAOImpl implements CategoryDAO{



@Autowired
SessionFactory sessionFactory;


/*---------------------------ADD CATEGORY--------------------------------*/
	@Override
	@Transactional
	public void addCategory(Category category) throws Exception {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(category);
		} catch (Exception exception) {
			exception.printStackTrace();
			throw exception;
		}
	}

	/*---------------------------ADD SUB CATEGORY--------------------------------*/
	
	@Override
	@Transactional
	public void addSubCategory(SubCategory subCategory) throws Exception {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(

			subCategory);
		} catch (Exception exception) {
			exception.printStackTrace();
			throw exception;
		}

	}
	
	
	/*---------------------------DELETE CATEGORY--------------------------------*/
	
	@Override
	@Transactional
	public boolean deleteCategory(int categoryId) throws Exception {
		try {
			System.out.println("inside dao");
			Category category = (Category) sessionFactory.getCurrentSession()
					.load(Category.class, categoryId);
			category.setBdeleteFlag(true);
			System.out.println("category " + category);
			sessionFactory.getCurrentSession().update(category);
			Query query = sessionFactory
					.getCurrentSession()
					.createQuery(
							"from SubCategory s where s.oParentCategory.iCategoryId=:id");
			query.setParameter("id", category.getiCategoryId());
			List<SubCategory> subcategoryList = query.list();
			Iterator<SubCategory> iterator = subcategoryList.iterator();
			while (iterator.hasNext()) {
				SubCategory subCategory = iterator.next();

				System.out.println("subcategory" + subCategory);
				System.out.println("id---------->"
						+ subCategory.getoParentCategory().getiCategoryId());

				System.out.println("inside if");
				subCategory.setBdeleteFlag(true);
				sessionFactory.getCurrentSession().update(subCategory);
				Query query2 = sessionFactory
						.getCurrentSession()
						.createQuery(
								"from MerchantSubCategoryAssoc assoc where assoc.oSubCategory.iSubCategoryId=:id");
				query2.setInteger("id", subCategory.getiSubCategoryId());
				List<MerchantSubCategoryAssoc> assocList = query2.list();
				Iterator<MerchantSubCategoryAssoc> iterator2 = assocList
						.iterator();
				while (iterator2.hasNext())

				{
					MerchantSubCategoryAssoc mercHantAssocObj = iterator2
							.next();
					mercHantAssocObj.setDeletedFlag(true);
					sessionFactory.getCurrentSession().update(mercHantAssocObj);
				}

			}
		} catch (Exception exception) {
			exception.printStackTrace();
			throw exception;
		}
		return true;
	}


	/*---------------------------DELETE SUB CATEGORY--------------------------------*/
	@Override
	@Transactional
	public boolean deleteSubCategory(int subCategoryId) throws Exception {

		try {
			SubCategory subCategory = (SubCategory) sessionFactory
					.getCurrentSession().load(SubCategory.class, subCategoryId);

			System.out.println("subcatgory" + subCategory);
			subCategory.setBdeleteFlag(true);
			sessionFactory.getCurrentSession().update(subCategory);
			Query query2 = sessionFactory
					.getCurrentSession()
					.createQuery(
							"from MerchantSubCategoryAssoc assoc where assoc.oSubCategory.iSubCategoryId=:id");
			query2.setInteger("id", subCategoryId);
			List<MerchantSubCategoryAssoc> assocList = query2.list();
			Iterator<MerchantSubCategoryAssoc> iterator2 = assocList.iterator();
			while (iterator2.hasNext())

			{
				MerchantSubCategoryAssoc mercHantAssocObj = iterator2.next();
				mercHantAssocObj.setDeletedFlag(true);
				sessionFactory.getCurrentSession().update(mercHantAssocObj);
			}

		} catch (Exception exception) {
			exception.printStackTrace();
			throw exception;
		}
		return true;
	}
	
 /*--------------------------------GET ALL CATEGORIES AND SUB CATEGORIES*-----------------------------------*/
	@Override
	@Transactional
	public List<Category> getCategories() throws Exception {

		List<Category> categoryList = null;
		try {
			System.out.println("insdie dao");
			Query objects = sessionFactory.getCurrentSession().createQuery(
					"from Category c where c.bdeleteFlag='N'");
			categoryList = objects.list();
			System.out.println(categoryList.size());
			System.out.println("size of list in dao" + categoryList.size());
		} catch (Exception exception) {
			exception.printStackTrace();
			throw exception;
		}
		return categoryList;
	}
	
	
	 /*--------------------------------GET ALL CATEGORIES AND SUB CATEGORIES and MERCHANT COUNT*-----------------------------------*/
		
	
	@Override
	@Transactional
	public List<Category> getMerchantCount() throws Exception {

		List<Category> finalList = new ArrayList<Category>();
		try {
			List<Category> categoriesList = getCategories();
			Iterator<Category> iterator = categoriesList.iterator();
			while (iterator.hasNext()) {
				Category category1 = iterator.next();
				System.out.println("inside dao...");
				System.out.println("category result" + category1);
				System.out.println(" cat idd----------"
						+ category1.getiCategoryId());

				String query = "select DISTINCT(assoc.oMerchant.iMerchantId) from MerchantSubCategoryAssoc assoc, SubCategory sb, Category cb where sb.iSubCategoryId=assoc.oSubCategory.iSubCategoryId and assoc.deletedFlag='N' and sb.oParentCategory.iCategoryId=:id";
				Query merchantCount = sessionFactory.getCurrentSession()
						.createQuery(query);
				merchantCount.setInteger("id", category1.getiCategoryId());
				List<Category> list = merchantCount.list();
				System.out.println("list size--------->" + list.size());
				category1.setiAssociatedMerchantCount(list.size());
				List<SubCategory> subMerchantList = new ArrayList<SubCategory>();
				Iterator<SubCategory> subIter = category1.getSubCategoryList()
						.iterator();
				while (subIter.hasNext()) {
					SubCategory subCategory = subIter.next();
					String query2 = "select DISTINCT(assoc.oMerchant.iMerchantId) from MerchantSubCategoryAssoc assoc where assoc.deletedFlag='N' and assoc.oSubCategory.iSubCategoryId=:id";
					Query subMerchantCount = sessionFactory.getCurrentSession()
							.createQuery(query2);
					System.out.println("sub id---------"
							+ subCategory.getiSubCategoryId());
					subMerchantCount.setParameter("id",
							subCategory.getiSubCategoryId());
					List<Integer> sMerchantCount = subMerchantCount.list();
					System.out.println("sub category merchant----"
							+ sMerchantCount.size());
					subCategory.setiAssociatedMerchantCount(sMerchantCount
							.size());
					subMerchantList.add(subCategory);

				}
				category1.setSubCategoryList(subMerchantList);
				finalList.add(category1);
			}
			System.out.println("final lIst size...." + finalList.size());
		} catch (Exception exception) {
			exception.printStackTrace();
			throw exception;
		}
		return finalList;
	}
	
/********************GET MERCHANT DETAILS****************************/	
	



@Override
@Transactional
	public List<Merchant> getMerchant(String id) throws Exception {

		List<Merchant> merchants = new ArrayList<Merchant>();
		try {
			System.out.println("id" + id);
			if (id.startsWith("C_")) {

				System.out.println("for category.....");
				String cId = id.replace("C_", "");
				System.out.println(cId);
				int categoryId = Integer.parseInt(cId);

				String query = "select DISTINCT(assoc.oMerchant.iMerchantId) from MerchantSubCategoryAssoc assoc, SubCategory sb, Category cb where sb.iSubCategoryId=assoc.oSubCategory.iSubCategoryId and assoc.deletedFlag='N' and sb.oParentCategory.iCategoryId=:id";
				Query merchantCount = sessionFactory.getCurrentSession()
						.createQuery(query);
				merchantCount.setParameter("id", categoryId);
				List<Integer> list = merchantCount.list();
				Iterator<Integer> iterator = list.iterator();
				while (iterator.hasNext()) {
					Integer merchantId = iterator.next();

					Merchant merchant = (Merchant) sessionFactory
							.getCurrentSession().load(Merchant.class,
									merchantId);
					System.out.println("merchant----->" + merchant);
					merchants.add(merchant);
				}
			} else {

				System.out.println("for sub Category");
				String cId = id.replace("S_", "");
				System.out.println(cId);
				String query2 = "select DISTINCT(assoc.oMerchant.iMerchantId) from MerchantSubCategoryAssoc assoc where assoc.deletedFlag='N' and assoc.oSubCategory.iSubCategoryId=:id";
				Query subMerchantCount = sessionFactory.getCurrentSession()
						.createQuery(query2);
				System.out.println("sub id---------" + cId);
				subMerchantCount.setString("id", cId);
				List<Integer> sMerchantCount = subMerchantCount.list();
				System.out.println("sub category merchant----"
						+ sMerchantCount.size());
				Iterator<Integer> iterator = sMerchantCount.iterator();
				while (iterator.hasNext()) {
					Integer merchantId = iterator.next();

					Merchant merchant = (Merchant) sessionFactory
							.getCurrentSession().load(Merchant.class,
									merchantId);
					System.out.println("merchant----->" + merchant);
					merchants.add(merchant);
				}
			}
		} catch (Exception exception) {
			exception.printStackTrace();
			throw exception;
		}
		return merchants;
	}

@Override
@Transactional
public Category getSubCategories(int categoryId) {
	SubCategory category=(SubCategory) sessionFactory.getCurrentSession().load(SubCategory.class, categoryId);
	System.out.println("category"+category);
	//System.out.println(category.getSubCategoryList().size());
 
	Category category1 =null;
	return category1;
}









	

}
