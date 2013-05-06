package uk.co.wowcher.cashback.persistence.domain;

public class InsertionOrderStatus {
	private int iId;
	private String sCode;
	private String sName;
	private String sDescription;
	public int getIId() {
		return iId;
	}
	public void setIId(int id) {
		iId = id;
	}
	public String getSCode() {
		return sCode;
	}
	public void setSCode(String code) {
		sCode = code;
	}
	public String getSName() {
		return sName;
	}
	public void setSName(String name) {
		sName = name;
	}
	public String getSDescription() {
		return sDescription;
	}
	public void setSDescription(String description) {
		sDescription = description;
	}
	
}
