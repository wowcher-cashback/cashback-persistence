package uk.co.wowcher.cashback.persistence.domain;

public class Merchant_Deal_SubCategory_Assoc {
	private int iMerchant_Deal_SubCategory_Assoc_Id;
	private SubCategory oSubCategory;
	private MerchantDeal oMerchantDeal;
	public int getIMerchant_Deal_SubCategory_Assoc_Id() {
		return iMerchant_Deal_SubCategory_Assoc_Id;
	}
	public void setIMerchant_Deal_SubCategory_Assoc_Id(
			int merchant_Deal_SubCategory_Assoc_Id) {
		iMerchant_Deal_SubCategory_Assoc_Id = merchant_Deal_SubCategory_Assoc_Id;
	}
	public SubCategory getOSubCategory() {
		return oSubCategory;
	}
	public void setOSubCategory(SubCategory subCategory) {
		oSubCategory = subCategory;
	}
	public MerchantDeal getOMerchantDeal() {
		return oMerchantDeal;
	}
	public void setOMerchantDeal(MerchantDeal merchantDeal) {
		oMerchantDeal = merchantDeal;
	}
	
}
