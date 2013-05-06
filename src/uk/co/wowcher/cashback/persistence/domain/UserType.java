package uk.co.wowcher.cashback.persistence.domain;

public class UserType {
	private int iUserTypeId;
	private String sUserTypeCode;
	private String sUserTypeName;
	private String sUserTypeDescription;
	public int getIUserTypeId() {
		return iUserTypeId;
	}
	public void setIUserTypeId(int userTypeId) {
		iUserTypeId = userTypeId;
	}
	public String getSUserTypeCode() {
		return sUserTypeCode;
	}
	public void setSUserTypeCode(String userTypeCode) {
		sUserTypeCode = userTypeCode;
	}
	public String getSUserTypeName() {
		return sUserTypeName;
	}
	public void setSUserTypeName(String userTypeName) {
		sUserTypeName = userTypeName;
	}
	public String getSUserTypeDescription() {
		return sUserTypeDescription;
	}
	public void setSUserTypeDescription(String userTypeDescription) {
		sUserTypeDescription = userTypeDescription;
	}
	
}
