package uk.co.wowcher.cashback.persistence.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import uk.co.wowcher.cashback.domain.beans.Merchant;
import uk.co.wowcher.cashback.domain.beans.MerchantDeal;
import uk.co.wowcher.cashback.persistence.dao.MerchantDao;



@Component("sampleDao")
public class MerchantDaoImpl implements MerchantDao{


	protected static Logger logger = Logger.getLogger("SampleDaoImpl");
	Session session = null;
	Transaction tx = null;

	/*@Autowired
	HibernateTemplate hibernateTemplate;*/

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;


	/*	
	@Override
	public List<Category> addCategory(Category domainCategory) {

		System.out.println("hello");


		//hibernateTemplate.saveOrUpdate(domainCategory);
		System.out.println("successfully inserted");

	//	List<Category> lstCategory = hibernateTemplate.loadAll(Category.class);
		return lstCategory;
	}*/
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Merchant> addMerchant(Merchant domainMerchant) throws Exception 
	{

		List<Merchant> lstMerchants = null;
		try
		{

			logger.info("domainMerchant Obj---------------->"+domainMerchant);
			if(sessionFactory.getCurrentSession() != null)
			{
				sessionFactory.getCurrentSession().saveOrUpdate(domainMerchant);
				Session session = sessionFactory.openSession();
				logger.info("successfully inserted");
				Criteria cr = session.createCriteria(Merchant.class);
				lstMerchants = cr.list();
				System.out.println("merchant list from Dao----------->"+lstMerchants.size());
				if((lstMerchants.size()) != 0){
					logger.info("Merchants list from Dao------------->"+lstMerchants);
					for (Merchant merchantObj : lstMerchants) {
						logger.info(merchantObj.getiMerchantId() + " , "
								+ merchantObj.getsName()+ ", "
								+ merchantObj.getiMerchantCode());
					}

				}

			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("Exception occured in addMerchant()--->"+e.getMessage());
			throw new Exception("Exception occured in addMerchant()--->"+e.getMessage());

		}
		return lstMerchants;
	}
	/**
	 * Retrieves all merchants
	 *
	 * @return a list of merchants
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Merchant> getMerchantList(String merchantName,String sortBy,String sortOrder) throws Exception
	{
		List<Merchant> lstMerchants = new ArrayList<Merchant>();
		Session session = null;
		Criteria criteriaObj = null;
		logger.info("merchantName---------->"+merchantName);
		logger.info("sortBy--------------->"+sortBy);
		logger.info("sortOrder------------>"+sortOrder);
		String sName = merchantName;
		try
		{

			session = sessionFactory.getCurrentSession();

			logger.info("Entered into getMerchantList()--->");

			logger.info("Retrieving all merchants");

			if(session != null)
			{
				// Create a Hibernate query (HQL)

				criteriaObj = session.createCriteria(Merchant.class);

				if(merchantName != null)
				{
					logger.info("Retrieving  merchants based on name");
					criteriaObj.add(Restrictions.ilike("sName", "%"+sName+"%"));
					criteriaObj.add(Restrictions.eq("bdeletedFlag", false));
				}
				lstMerchants = criteriaObj.list();
				logger.info("lstMerchants from DAO----------->"+lstMerchants.size());

			}
			
			if(sortBy != null && sortOrder == "asc")	
			{
				logger.info("Retrieving  merchants based on Ascending sort order for "+sortBy);
				lstMerchants = criteriaObj.addOrder(Order.asc(sortBy)).list();
				logger.info("lstMerchants size-------->"+lstMerchants.size());
			}
			if(sortBy != null && sortOrder == "desc")	
			{
				logger.info("Retrieving  merchants based on Descending sort order for "+sortBy);
				lstMerchants = criteriaObj.addOrder(Order.desc(sortBy)).list();
				logger.info("lstMerchants size-------->"+lstMerchants.size());
			}
			Iterator<Merchant> it = lstMerchants.iterator();
			while(it.hasNext())
			{
				Merchant merchant=it.next();
				System.out.println("dao......."+merchant);
			}
		}

		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("Exception occured in getMerchantList()--->"+e.getMessage());
			throw new Exception("Exception occured in getMerchantList()--->"+e.getMessage());
		}
		return lstMerchants;

	}




	@Transactional
	public void deleteMerchant(List<Integer> merchantIdlist) throws Exception {	

		logger.info("Entered into deleteMerchant()--->");

		//	session = sessionFactory.openSession();

		logger.info("merchantIdlist-------->"+merchantIdlist);
		try{
			for(Integer merchantId:merchantIdlist)
			{
				logger.info("merchantId------------>"+merchantId);
				Merchant merchant =  (Merchant) sessionFactory.getCurrentSession().load(Merchant.class, merchantId);
				
				merchant.setBdeletedFlag(true);
				
				sessionFactory.getCurrentSession().update(merchant);
				System.out.println("done");		

				
			}
		}
		catch (Exception e) {

			e.printStackTrace();
			logger.error("Exception occured in deleteMerchant() in dao--->"+e.getMessage());
			throw new Exception("Exception occured in deleteMerchant() in dao--->"+e.getMessage());

		}
		logger.info("deleted successfully");
	}


}

/* 
 * 
 *  int updateCount = .createSQLQuery("update PERSON set lastmoddate=:lastmoddate,lastmodby=:lastmodby,deleteflag='Y',approval_status_id = DECODE(POST_APPROVAL_UPDATED,'Y','6','2') ,approved_by=''," +
							"approved_date_time='',COMMENTS=:comments where person_id =:personID")
							.setParameter("lastmoddate", person.getLastUpdatedDateTime())
							.setParameter("lastmodby", person.getLastUpdatedBy())
							.setParameter("comments", person.getComments())
							.setParameter("personID", person.getPersonId())
							.executeUpdate();
							String hql = "delete from Merchant where iMerchantId = :iMerchantId";
	  Query query = session.createQuery(hql);
 //    query.setString("iMerchantId",merchantIdlist);
     int rowCount = query.executeUpdate();
     System.out.println("Rows affected: " + rowCount);

     //See the results of the update
     query = session.createQuery("from Merchant");
     List results = query.list(); */


/*@SuppressWarnings("unchecked")
	@Transactional
	public List<Merchant> searchMerchants(String merchantName) throws Exception {

		List<Merchant> merchantResultList = new ArrayList<Merchant>();

		logger.info("Entered into searchMerchants()----->");
		try
		{

		Session session = sessionFactory.getCurrentSession();
		 if(session != null)
		 {
		Criteria criteria = session.createCriteria(Merchant.class);
		String sName = merchantName;
		criteria.add(Restrictions.ilike("sName", sName+"%"));
		merchantResultList = criteria.list();
		logger.info("merchantResultList from DAO----------->"+criteria.list());
		logger.info("merchantResultList size-------->"+merchantResultList.size());
		 }
		}
		catch(Exception e)
		{
			logger.error("Exception occured in searchMerchants()--->"+e.getMessage());
			throw new Exception("Exception occured in searchMerchants()--->"+e.getMessage());
		}
		return merchantResultList;
	}

	@SuppressWarnings("unchecked")
	public List<Merchant> sortMerchants(String merchantName,int merchantId,boolean status) throws Exception
	{

		List<Merchant> merchantSortresultList = new ArrayList<Merchant>();

		logger.info("Entered into sortMerchants()----->");
		try
		{
			Session session = sessionFactory.getCurrentSession();
			 if(session != null)
			 {

			logger.info("merchantResultList from DAO----------->"+criteria.list());
			logger.info("merchantResultList size-------->"+merchantSortresultList.size());
			 }
			}
			catch(Exception e)
			{
				logger.error("Exception occured in sortMerchants()--->"+e.getMessage());
				throw new Exception("Exception occured in sortMerchants()--->"+e.getMessage());
			}
			return merchantSortresultList;
		}*/








/*
	Criteria cr = session.createCriteria(Employee.class);
	// To get records having salary more than 2000
	cr.add(Restrictions.gt("salary", 2000));

	// To sort records in descening order
	crit.addOrder(Order.desc("salary"));

	// To sort records in ascending order
	crit.addOrder(Order.asc("salary"));

	List results = cr.list();*/
