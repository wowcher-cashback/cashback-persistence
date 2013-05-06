package uk.co.wowcher.cashback.persistence.domain;

public class WowcherSpecialBonus {
	private int iWowcherSpecialBonusId;
	private Merchant oMerchant;
	private SubCategory oSubCategory;
	private String sSpecialBonusType;
	private float fSpecialBonus;
	private CashBackUser oAdmin;
	public int getIWowcherSpecialBonusId() {
		return iWowcherSpecialBonusId;
	}
	public void setIWowcherSpecialBonusId(int wowcherSpecialBonusId) {
		iWowcherSpecialBonusId = wowcherSpecialBonusId;
	}
	public Merchant getOMerchant() {
		return oMerchant;
	}
	public void setOMerchant(Merchant merchant) {
		oMerchant = merchant;
	}
	public SubCategory getOSubCategory() {
		return oSubCategory;
	}
	public void setOSubCategory(SubCategory subCategory) {
		oSubCategory = subCategory;
	}
	public String getSSpecialBonusType() {
		return sSpecialBonusType;
	}
	public void setSSpecialBonusType(String specialBonusType) {
		sSpecialBonusType = specialBonusType;
	}
	public float getFSpecialBonus() {
		return fSpecialBonus;
	}
	public void setFSpecialBonus(float specialBonus) {
		fSpecialBonus = specialBonus;
	}
	public CashBackUser getOAdmin() {
		return oAdmin;
	}
	public void setOAdmin(CashBackUser admin) {
		oAdmin = admin;
	}
	
}
