package uk.co.wowcher.cashback.domain.beans;

import java.util.List;

import org.springframework.stereotype.Component;





@Component("domainCategory")
public class Category {
	 
	   
	 
	  
	   private int iCategoryId;
	   private String sName;
	   private String sDescription;
	   private boolean blsSpecialBonusAvailable;
	   private float sSpecialBonus;
	   private int iAssociatedMerchantCount;
	   private List<SubCategory> subCategoryList;
	   boolean bdeleteFlag;
	   private int iSortOrder;
	   
	   
	   
	   public int getiSortOrder() {
		return iSortOrder;
	}
	public void setiSortOrder(int iSortOrder) {
		this.iSortOrder = iSortOrder;
	}
	
	   
	public boolean isBdeleteFlag() {
		return bdeleteFlag;
	}
	public void setBdeleteFlag(boolean bdeleteFlag) {
		this.bdeleteFlag = bdeleteFlag;
	}
	public int getiCategoryId() {
		return iCategoryId;
	}
	public void setiCategoryId(int iCategoryId) {
		this.iCategoryId = iCategoryId;
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
	public boolean isBlsSpecialBonusAvailable() {
		return blsSpecialBonusAvailable;
	}
	public void setBlsSpecialBonusAvailable(boolean blsSpecialBonusAvailable) {
		this.blsSpecialBonusAvailable = blsSpecialBonusAvailable;
	}
	public float getsSpecialBonus() {
		return sSpecialBonus;
	}
	public void setsSpecialBonus(float sSpecialBonus) {
		this.sSpecialBonus = sSpecialBonus;
	}
	public List<SubCategory> getSubCategoryList() {
		return subCategoryList;
	}
	public void setSubCategoryList(List<SubCategory> subCategoryList) {
		this.subCategoryList = subCategoryList;
	}
	@Override
	public String toString() {
		return "Category [iCategoryId=" + iCategoryId + ", sName=" + sName
				+ ", sDescription=" + sDescription
				+ ", blsSpecialBonusAvailable=" + blsSpecialBonusAvailable
				+ ", sSpecialBonus=" + sSpecialBonus + ", iMerchantCount="
				+ iAssociatedMerchantCount + ", deleteFlag=" + bdeleteFlag + "]";
	}
	public int getiAssociatedMerchantCount() {
		return iAssociatedMerchantCount;
	}
	public void setiAssociatedMerchantCount(int iAssociatedMerchantCount) {
		this.iAssociatedMerchantCount = iAssociatedMerchantCount;
	}
	
	   
	
	
	
 } 