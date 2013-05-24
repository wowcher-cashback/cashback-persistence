package uk.co.wowcher.cashback.domain.beans;




public class PremiumPlacementType {
	
	private int iPremiumPlacementTypeId;
	private String sPremiumPlacementTypeCode;
	private String sPremiumPlacementTypeName;
	private String sPremiumPlacementTypeDescription;
	private int iNoOfInventory;
	private InventoryUnitType oInventoryUnitType;
	private float fRateCardPrice;
	private float fMaxSingleDiscount;
	
	public int getiPremiumPlacementTypeId() {
		return iPremiumPlacementTypeId;
	}
	public void setiPremiumPlacementTypeId(int iPremiumPlacementTypeId) {
		this.iPremiumPlacementTypeId = iPremiumPlacementTypeId;
	}
	public String getsPremiumPlacementTypeCode() {
		return sPremiumPlacementTypeCode;
	}
	public void setsPremiumPlacementTypeCode(String sPremiumPlacementTypeCode) {
		this.sPremiumPlacementTypeCode = sPremiumPlacementTypeCode;
	}
	public String getsPremiumPlacementTypeName() {
		return sPremiumPlacementTypeName;
	}
	public void setsPremiumPlacementTypeName(String sPremiumPlacementTypeName) {
		this.sPremiumPlacementTypeName = sPremiumPlacementTypeName;
	}
	public String getsPremiumPlacementTypeDescription() {
		return sPremiumPlacementTypeDescription;
	}
	public void setsPremiumPlacementTypeDescription(
			String sPremiumPlacementTypeDescription) {
		this.sPremiumPlacementTypeDescription = sPremiumPlacementTypeDescription;
	}
	public int getiNoOfInventory() {
		return iNoOfInventory;
	}
	public void setiNoOfInventory(int iNoOfInventory) {
		this.iNoOfInventory = iNoOfInventory;
	}
	public InventoryUnitType getoInventoryUnitType() {
		return oInventoryUnitType;
	}
	public void setoInventoryUnitType(InventoryUnitType oInventoryUnitType) {
		this.oInventoryUnitType = oInventoryUnitType;
	}
	public float getfRateCardPrice() {
		return fRateCardPrice;
	}
	public void setfRateCardPrice(float fRateCardPrice) {
		this.fRateCardPrice = fRateCardPrice;
	}
	public float getfMaxSingleDiscount() {
		return fMaxSingleDiscount;
	}
	public void setfMaxSingleDiscount(float fMaxSingleDiscount) {
		this.fMaxSingleDiscount = fMaxSingleDiscount;
	}
	
	
	
}
