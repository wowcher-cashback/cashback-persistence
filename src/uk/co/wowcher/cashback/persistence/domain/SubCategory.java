package uk.co.wowcher.cashback.persistence.domain;

public class SubCategory {
	private int iSubCategory;
	private String sName;
	private String sDescription;
	private Category oParentCategory;
	public int getISubCategory() {
		return iSubCategory;
	}
	public void setISubCategory(int subCategory) {
		iSubCategory = subCategory;
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
	public Category getOParentCategory() {
		return oParentCategory;
	}
	public void setOParentCategory(Category parentCategory) {
		oParentCategory = parentCategory;
	}
	
}
