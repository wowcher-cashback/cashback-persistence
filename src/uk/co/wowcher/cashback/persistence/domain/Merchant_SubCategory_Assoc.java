package uk.co.wowcher.cashback.persistence.domain;

public class Merchant_SubCategory_Assoc {
	private int iMerchantSubCategoryAssocId;
	private SubCategory oSubCategory;
	private Merchant oMerchant;
	public int getIMerchantSubCategoryAssocId() {
		return iMerchantSubCategoryAssocId;
	}
	public void setIMerchantSubCategoryAssocId(int merchantSubCategoryAssocId) {
		iMerchantSubCategoryAssocId = merchantSubCategoryAssocId;
	}
	public SubCategory getOSubCategory() {
		return oSubCategory;
	}
	public void setOSubCategory(SubCategory subCategory) {
		oSubCategory = subCategory;
	}
	public Merchant getOMerchant() {
		return oMerchant;
	}
	public void setOMerchant(Merchant merchant) {
		oMerchant = merchant;
	}
	
}
