package uk.co.wowcher.cashback.persistence.domain;

public class Category {
	private int iCategoryId;
	private String sName;
	private String sDescription;
	public int getICategoryId() {
		return iCategoryId;
	}
	public void setICategoryId(int categoryId) {
		iCategoryId = categoryId;
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
