package uk.co.wowcher.cashback.persistence.domain;

public class RateType {
	private int iRateTypeId;
	private String sRateTypeCode;
	private String sRateTypeName;
	private String sRateTypeDescription;
	public int getIRateTypeId() {
		return iRateTypeId;
	}
	public void setIRateTypeId(int rateTypeId) {
		iRateTypeId = rateTypeId;
	}
	public String getSRateTypeCode() {
		return sRateTypeCode;
	}
	public void setSRateTypeCode(String rateTypeCode) {
		sRateTypeCode = rateTypeCode;
	}
	public String getSRateTypeName() {
		return sRateTypeName;
	}
	public void setSRateTypeName(String rateTypeName) {
		sRateTypeName = rateTypeName;
	}
	public String getSRateTypeDescription() {
		return sRateTypeDescription;
	}
	public void setSRateTypeDescription(String rateTypeDescription) {
		sRateTypeDescription = rateTypeDescription;
	}
	
}
