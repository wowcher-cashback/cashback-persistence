package uk.co.wowcher.cashback.domain.beans;

public class SubCategory {
	private int iSubCategory;
	private String sName;
	private String sDescription;
	private Category oParentCategory;
	private Merchant_Deal_SubCategory_Assoc merchant_Deal_SubCategory_Assoc;
	public int getiSubCategory() {
		return iSubCategory;
	}
	public void setiSubCategory(int iSubCategory) {
		this.iSubCategory = iSubCategory;
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
	public Merchant_Deal_SubCategory_Assoc getMerchant_Deal_SubCategory_Assoc() {
		return merchant_Deal_SubCategory_Assoc;
	}
	public void setMerchant_Deal_SubCategory_Assoc(
			Merchant_Deal_SubCategory_Assoc merchant_Deal_SubCategory_Assoc) {
		this.merchant_Deal_SubCategory_Assoc = merchant_Deal_SubCategory_Assoc;
	}
	
	
	
}
