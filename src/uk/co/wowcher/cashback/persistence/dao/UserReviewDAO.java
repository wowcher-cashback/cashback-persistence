package uk.co.wowcher.cashback.persistence.dao;

import java.util.List;

import uk.co.wowcher.cashback.domain.beans.MerchantReview;

public interface UserReviewDAO {
	
	public List<MerchantReview> getAllUserComments() throws Exception;
	
	public List getFilterValuesforReview(String merchantName,String userName,String reviewStatus) throws Exception;
	
	public List<MerchantReview> getFilterReviews(int merchantId,int userId,int reviewId) throws Exception;
	
	public boolean  updateReviewStatus(MerchantReview merchantReview) throws Exception;

}
