package uk.co.wowcher.cashback.persistence.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import uk.co.wowcher.cashback.domain.beans.CashBackUser;
import uk.co.wowcher.cashback.domain.beans.Merchant;
import uk.co.wowcher.cashback.domain.beans.MerchantReview;
import uk.co.wowcher.cashback.domain.beans.MerchantReviewStatus;
import uk.co.wowcher.cashback.persistence.dao.UserReviewDAO;


@Component
public class UserReviewDAOImpl implements UserReviewDAO {



	@Autowired
	SessionFactory sessionFactory;

	
/**************************GET ALL USER COMMENTS**********************************************/
	
	@Override
	@Transactional
	public List<MerchantReview> getAllUserComments() throws Exception {

		List<MerchantReview> merchantReviewList = null;
		try {

			Query merchantReviewquery = sessionFactory.getCurrentSession()
					.createQuery("from MerchantReview");			
			System.out.println("merchantReviewquery->"+merchantReviewquery);
			merchantReviewList = (List<MerchantReview>)merchantReviewquery.list();
			System.out.println("merchantReviewList size----------->"
					+ merchantReviewList.size());
			Iterator<MerchantReview> iterator=merchantReviewList.iterator();
			while(iterator.hasNext())
			{
				MerchantReview merchantReview=iterator.next();
				System.out.println("merchant review"+merchantReview);
				Date reviewdate= merchantReview.getdReviewDate();
				/*DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
				String text = df.format(reviewdate); */
				System.out.println("review date"+reviewdate);
				
			}

		} catch (Exception exception) {
			exception.printStackTrace();
			throw exception;
		}
		return merchantReviewList;
	}

	
/******************************************GET FILTER VALUES***********************************/
	
	@Override
	@Transactional
	public List getFilterValuesforReview(String merchantName, String userName,
			String reviewStatus) throws Exception {
		List filterValuesList = new ArrayList();

		try {
			if (merchantName != null) {
				Query getMerchant = sessionFactory
						.getCurrentSession()
						.createQuery(
								"select merchantReview.oMerchant from MerchantReview merchantReview");

				filterValuesList = getMerchant.list();
				System.out
						.println("merchant size..." + filterValuesList.size());
				Iterator iterator = filterValuesList.iterator();
				while (iterator.hasNext()) {
					Merchant merchant = (Merchant) iterator.next();
					System.out.println("merchant-------->" + merchant);
				}
			} else if (userName != null) {
				Query getCashBackuser = sessionFactory
						.getCurrentSession()
						.createQuery(
								"select merchantReview.oCashBackUser from MerchantReview merchantReview");

				filterValuesList = getCashBackuser.list();
				System.out.println("user size..." + filterValuesList.size());
				Iterator iterator = filterValuesList.iterator();
				while (iterator.hasNext()) {
					CashBackUser cashBackUser = (CashBackUser) iterator.next();
					System.out.println("user-------->" + cashBackUser);
				}
			} else {
				Query getReview = sessionFactory
						.getCurrentSession()
						.createQuery(
								"select merchantReview.oStatus from MerchantReview merchantReview");
				filterValuesList = getReview.list();
				System.out.println("review status size..." + filterValuesList.size());
				Iterator iterator = filterValuesList.iterator();
				while (iterator.hasNext()) {
					MerchantReviewStatus MerchantreviewStatus = (MerchantReviewStatus) iterator.next();
					System.out.println("reviewStatus-------->" + MerchantreviewStatus);
				}
			}
		} catch (Exception exception) {
			throw exception;
		}
		return filterValuesList;
	}

/******************************REVIEWS FILTERED BASED ON MERCHANT NAME,USER NAME,REVIEW STATUS***************/
	@Override
	@Transactional
	public List<MerchantReview> getFilterReviews(int merchantId, int userId,
			int reviewId) throws Exception {

		List<MerchantReview> merchantReviewList = new ArrayList<MerchantReview>();
		Query query = null;
		try {
			if (merchantId != 0) {
				
				System.out.println("<---------based on merchant name-------------->");
				
				query = sessionFactory
						.getCurrentSession()
						.createQuery(
								"from MerchantReview merchantReview where"
										+ " merchantReview.oMerchant.iMerchantId=:merchantid");
				query.setParameter("merchantid", merchantId);
			} else if (userId != 0) {
				System.out.println("<---------based on user name-------------->");
				query = sessionFactory
						.getCurrentSession()
						.createQuery(
								"from MerchantReview merchantReview where"
										+ " merchantReview.oCashBackUser.iCashBackUserId=:userId");
				query.setParameter("userId", userId);
			}
			else
			{
				System.out.println("<---------based on review status-------------->");
				query = sessionFactory
						.getCurrentSession()
						.createQuery(
								"from MerchantReview merchantReview where"
										+ " merchantReview.oStatus.iMerchantReviewStatusId=:reviewStatusId");
				query.setParameter("reviewStatusId", reviewId);
			}

			merchantReviewList = query.list();
			Iterator<MerchantReview> iterator = merchantReviewList.iterator();
			while (iterator.hasNext()) {
				MerchantReview merchantReview = iterator.next();
				System.out.println("merchant review" + merchantReview);
			}

		} catch (Exception exception) {
			throw exception;
		}
		return merchantReviewList;
	}


@Override
@Transactional
public boolean updateReviewStatus(MerchantReview merchantReview) throws Exception{
	
	boolean status=false;
	try
	{
       sessionFactory.getCurrentSession().saveOrUpdate(merchantReview);
       status=true;
	}
	catch(Exception exception)
	{
		throw exception;
	}
	
	return status;
}

}
