package uk.co.wowcher.cashback.persistence.domain;

public class MerchantDealType {
	private int iMerchantDealTypeId;
	private String sDealTypeCode;
	private String sDealTypeName;
	private String sDealTypeDescription;
	public int getIMerchantDealTypeId() {
		return iMerchantDealTypeId;
	}
	public void setIMerchantDealTypeId(int merchantDealTypeId) {
		iMerchantDealTypeId = merchantDealTypeId;
	}
	public String getSDealTypeCode() {
		return sDealTypeCode;
	}
	public void setSDealTypeCode(String dealTypeCode) {
		sDealTypeCode = dealTypeCode;
	}
	public String getSDealTypeName() {
		return sDealTypeName;
	}
	public void setSDealTypeName(String dealTypeName) {
		sDealTypeName = dealTypeName;
	}
	public String getSDealTypeDescription() {
		return sDealTypeDescription;
	}
	public void setSDealTypeDescription(String dealTypeDescription) {
		sDealTypeDescription = dealTypeDescription;
	}
	
}
