package uk.co.wowcher.cashback.domain.beans;

import java.util.Date;

import org.springframework.stereotype.Component;


@Component("domainMerchantReview")
public class MerchantReview {

	private int iMerchantReviewId;
	private String sComment;
	private float fRating;
	private MerchantReviewStatus oStatus;
	@Override
	public String toString() {
		return "MerchantReview [iMerchantReviewId=" + iMerchantReviewId
				+ ", sComment=" + sComment + ", fRating=" + fRating
				+ ", oStatus=" + oStatus + ", oCashBackUser=" + oCashBackUser
				+ ", oMerchant=" + oMerchant + ", dReviewDate=" + dReviewDate
				+ "]";
	}
	private CashBackUser oCashBackUser;
	private Merchant oMerchant;
	private Date dReviewDate;
	public int getiMerchantReviewId() {
		return iMerchantReviewId;
	}
	public void setiMerchantReviewId(int iMerchantReviewId) {
		this.iMerchantReviewId = iMerchantReviewId;
	}
	public String getsComment() {
		return sComment;
	}
	public void setsComment(String sComment) {
		this.sComment = sComment;
	}
	public float getfRating() {
		return fRating;
	}
	public void setfRating(float fRating) {
		this.fRating = fRating;
	}
	public MerchantReviewStatus getoStatus() {
		return oStatus;
	}
	public void setoStatus(MerchantReviewStatus oStatus) {
		this.oStatus = oStatus;
	}
	public CashBackUser getoCashBackUser() {
		return oCashBackUser;
	}
	public void setoCashBackUser(CashBackUser oCashBackUser) {
		this.oCashBackUser = oCashBackUser;
	}
	public Merchant getoMerchant() {
		return oMerchant;
	}
	public void setoMerchant(Merchant oMerchant) {
		this.oMerchant = oMerchant;
	}
	public Date getdReviewDate() {
		return dReviewDate;
	}
	public void setdReviewDate(Date dReviewDate) {
		this.dReviewDate = dReviewDate;
	}
	
	
	
	
}
