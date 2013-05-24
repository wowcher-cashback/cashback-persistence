package uk.co.wowcher.cashback.domain.beans;

import org.springframework.stereotype.Component;

@Component("domainSubCategory")
 public class SubCategory {
 
   	   private int iSubCategoryId;
	   private String sName;
	   private String sDescription;
	   private int iAssociatedMerchantCount;
	   private  Category oParentCategory;
	   private int iSortOrder;
	   
	   public int getiSortOrder() {
		return iSortOrder;
	}
	public void setiSortOrder(int iSortOrder) {
		this.iSortOrder = iSortOrder;
	}
	private boolean bdeleteFlag;
	   
	
	public boolean isBdeleteFlag() {
		return bdeleteFlag;
	}
	public void setBdeleteFlag(boolean bdeleteFlag) {
		this.bdeleteFlag = bdeleteFlag;
	}
	public int getiAssociatedMerchantCount() {
		return iAssociatedMerchantCount;
	}
	public void setiAssociatedMerchantCount(int iAssociatedMerchantCount) {
		this.iAssociatedMerchantCount = iAssociatedMerchantCount;
	}
	public int getiSubCategoryId() {
		return iSubCategoryId;
	}
	public void setiSubCategoryId(int iSubCategoryId) {
		this.iSubCategoryId = iSubCategoryId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsDescription() {
		return sDescription;
	}
	public void setsDescription(String sDescription) {
		this.sDescription = sDescription;
	}
	
	public Category getoParentCategory() {
		return oParentCategory;
	}
	public void setoParentCategory(Category oParentCategory) {
		this.oParentCategory = oParentCategory;
	}
	@Override
	public String toString() {
		return "SubCategory [iSubCategoryId=" + iSubCategoryId + ", sName="
				+ sName + ", sDescription=" + sDescription
				+ ", iMerchantCount=" + iAssociatedMerchantCount + ", oParentCategory="
				+ oParentCategory + ", deleteFlag=" + bdeleteFlag + "]";
	}
	
	

 } 