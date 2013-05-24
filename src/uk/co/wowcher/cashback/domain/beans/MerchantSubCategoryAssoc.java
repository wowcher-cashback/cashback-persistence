package uk.co.wowcher.cashback.domain.beans;

public class MerchantSubCategoryAssoc {
	
	private int iMerchantSubCategoryAssocId;
	private SubCategory oSubCategory;
	private Merchant oMerchant;
	private boolean deletedFlag;
	
	
	public boolean isDeletedFlag() {
		return deletedFlag;
	}
	public void setDeletedFlag(boolean deletedFlag) {
		this.deletedFlag = deletedFlag;
	}
	public int getiMerchantSubCategoryAssocId() {
		return iMerchantSubCategoryAssocId;
	}
	public void setiMerchantSubCategoryAssocId(int iMerchantSubCategoryAssocId) {
		this.iMerchantSubCategoryAssocId = iMerchantSubCategoryAssocId;
	}
	public SubCategory getoSubCategory() {
		return oSubCategory;
	}
	public void setoSubCategory(SubCategory oSubCategory) {
		this.oSubCategory = oSubCategory;
	}
	public Merchant getoMerchant() {
		return oMerchant;
	}
	public void setoMerchant(Merchant oMerchant) {
		this.oMerchant = oMerchant;
	}
	
	

}
