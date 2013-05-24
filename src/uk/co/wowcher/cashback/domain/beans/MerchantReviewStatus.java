package uk.co.wowcher.cashback.domain.beans;

import org.springframework.stereotype.Component;

@Component("domainMerchantReviewStatus")
public class MerchantReviewStatus {
	
	private int iMerchantReviewStatusId;
	
	
	private String sMerchantReviewStatusName;
	private String sMerchantReviewStatusCode;
	private String sMerchantReviewStatusDescription;
	
	
	public int getiMerchantReviewStatusId() {
		return iMerchantReviewStatusId;
	}
	public void setiMerchantReviewStatusId(int iMerchantReviewStatusId) {
		this.iMerchantReviewStatusId = iMerchantReviewStatusId;
	}
	
	
	public String getsMerchantReviewStatusName() {
		return sMerchantReviewStatusName;
	}
	public void setsMerchantReviewStatusName(String sMerchantReviewStatusName) {
		this.sMerchantReviewStatusName = sMerchantReviewStatusName;
	}
	public String getsMerchantReviewStatusCode() {
		return sMerchantReviewStatusCode;
	}
	public void setsMerchantReviewStatusCode(String sMerchantReviewStatusCode) {
		this.sMerchantReviewStatusCode = sMerchantReviewStatusCode;
	}
	public String getsMerchantReviewStatusDescription() {
		return sMerchantReviewStatusDescription;
	}
	public void setsMerchantReviewStatusDescription(
			String sMerchantReviewStatusDescription) {
		this.sMerchantReviewStatusDescription = sMerchantReviewStatusDescription;
	}
	@Override
	public String toString() {
		return "MerchantReviewStatus [iMerchantReviewStatusId="
				+ iMerchantReviewStatusId + ", sMerchantReviewStatusName="
				+ sMerchantReviewStatusName + ", sMerchantReviewStatusCode="
				+ sMerchantReviewStatusCode
				+ ", sMerchantReviewStatusDescription="
				+ sMerchantReviewStatusDescription + "]";
	}
	

}
