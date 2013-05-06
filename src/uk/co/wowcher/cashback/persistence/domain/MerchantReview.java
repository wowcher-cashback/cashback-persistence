package uk.co.wowcher.cashback.persistence.domain;

import java.util.Date;

public class MerchantReview {
	private int iMerchantReviewId;
	private String sComment;
	private float fRating;
	private MerchantReviewStatus oStatus;
	private CashBackUser oCashBackUser;
	private Merchant oMerchant;
	private Date dReviewDate;
	public int getIMerchantReviewId() {
		return iMerchantReviewId;
	}
	public void setIMerchantReviewId(int merchantReviewId) {
		iMerchantReviewId = merchantReviewId;
	}
	public String getSComment() {
		return sComment;
	}
	public void setSComment(String comment) {
		sComment = comment;
	}
	public float getFRating() {
		return fRating;
	}
	public void setFRating(float rating) {
		fRating = rating;
	}
	public MerchantReviewStatus getOStatus() {
		return oStatus;
	}
	public void setOStatus(MerchantReviewStatus status) {
		oStatus = status;
	}
	public CashBackUser getOCashBackUser() {
		return oCashBackUser;
	}
	public void setOCashBackUser(CashBackUser cashBackUser) {
		oCashBackUser = cashBackUser;
	}
	public Merchant getOMerchant() {
		return oMerchant;
	}
	public void setOMerchant(Merchant merchant) {
		oMerchant = merchant;
	}
	public Date getDReviewDate() {
		return dReviewDate;
	}
	public void setDReviewDate(Date reviewDate) {
		dReviewDate = reviewDate;
	}
	
}
