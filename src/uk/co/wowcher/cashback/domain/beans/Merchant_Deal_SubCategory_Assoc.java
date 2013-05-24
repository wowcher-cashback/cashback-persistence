package uk.co.wowcher.cashback.domain.beans;

public class Merchant_Deal_SubCategory_Assoc {
	private int iMerchant_Deal_SubCategory_Assoc_Id;
	private SubCategory oSubCategory;
	private MerchantDeal oMerchantDeal;
	public int getiMerchant_Deal_SubCategory_Assoc_Id() {
		return iMerchant_Deal_SubCategory_Assoc_Id;
	}
	public void setiMerchant_Deal_SubCategory_Assoc_Id(
			int iMerchant_Deal_SubCategory_Assoc_Id) {
		this.iMerchant_Deal_SubCategory_Assoc_Id = iMerchant_Deal_SubCategory_Assoc_Id;
	}
	public SubCategory getoSubCategory() {
		return oSubCategory;
	}
	public void setoSubCategory(SubCategory oSubCategory) {
		this.oSubCategory = oSubCategory;
	}
	public MerchantDeal getoMerchantDeal() {
		return oMerchantDeal;
	}
	public void setoMerchantDeal(MerchantDeal oMerchantDeal) {
		this.oMerchantDeal = oMerchantDeal;
	}
	
	
	
}
