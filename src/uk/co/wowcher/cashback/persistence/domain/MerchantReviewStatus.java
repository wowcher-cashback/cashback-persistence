package uk.co.wowcher.cashback.persistence.domain;

public class MerchantReviewStatus {
	private int iMerchantReviewStatusId;
	private String sMerchantReviewStatusCode;
	private String sMerchantReviewStatusName;
	private String sMerchantReviewStatusDescription;
	public int getIMerchantReviewStatusId() {
		return iMerchantReviewStatusId;
	}
	public void setIMerchantReviewStatusId(int merchantReviewStatusId) {
		iMerchantReviewStatusId = merchantReviewStatusId;
	}
	public String getSMerchantReviewStatusCode() {
		return sMerchantReviewStatusCode;
	}
	public void setSMerchantReviewStatusCode(String merchantReviewStatusCode) {
		sMerchantReviewStatusCode = merchantReviewStatusCode;
	}
	public String getSMerchantReviewStatusName() {
		return sMerchantReviewStatusName;
	}
	public void setSMerchantReviewStatusName(String merchantReviewStatusName) {
		sMerchantReviewStatusName = merchantReviewStatusName;
	}
	public String getSMerchantReviewStatusDescription() {
		return sMerchantReviewStatusDescription;
	}
	public void setSMerchantReviewStatusDescription(
			String merchantReviewStatusDescription) {
		sMerchantReviewStatusDescription = merchantReviewStatusDescription;
	}
	
}	
