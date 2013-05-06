package uk.co.wowcher.cashback.persistence.domain;

import java.util.Date;

public class PlacementBooking {
	private int iPlacementBookingId;
	private PremiumPlacementType oPremiumPlacementType;
	private InsertionOrder oInsertionOrder;
	private int iInventoryPosition;
	private Date dStartWeek;
	private String sCostAfterDiscount;
	private Category oCategory;
	private SubCategory oSubCategory;
	private String sRateCard;
	private String sMaxSingleDiscount;
	private String sMaxMultipleDiscount;
	private String sDiscountApplied;
	private Merchant oMerchant;
	public int getIPlacementBookingId() {
		return iPlacementBookingId;
	}
	public void setIPlacementBookingId(int placementBookingId) {
		iPlacementBookingId = placementBookingId;
	}
	public PremiumPlacementType getOPremiumPlacementType() {
		return oPremiumPlacementType;
	}
	public void setOPremiumPlacementType(PremiumPlacementType premiumPlacementType) {
		oPremiumPlacementType = premiumPlacementType;
	}
	public InsertionOrder getOInsertionOrder() {
		return oInsertionOrder;
	}
	public void setOInsertionOrder(InsertionOrder insertionOrder) {
		oInsertionOrder = insertionOrder;
	}
	public int getIInventoryPosition() {
		return iInventoryPosition;
	}
	public void setIInventoryPosition(int inventoryPosition) {
		iInventoryPosition = inventoryPosition;
	}
	public Date getDStartWeek() {
		return dStartWeek;
	}
	public void setDStartWeek(Date startWeek) {
		dStartWeek = startWeek;
	}
	public String getSCostAfterDiscount() {
		return sCostAfterDiscount;
	}
	public void setSCostAfterDiscount(String costAfterDiscount) {
		sCostAfterDiscount = costAfterDiscount;
	}
	public SubCategory getOSubCategory() {
		return oSubCategory;
	}
	public void setOSubCategory(SubCategory subCategory) {
		oSubCategory = subCategory;
	}
	public String getSRateCard() {
		return sRateCard;
	}
	public void setSRateCard(String rateCard) {
		sRateCard = rateCard;
	}
	public String getSMaxSingleDiscount() {
		return sMaxSingleDiscount;
	}
	public void setSMaxSingleDiscount(String maxSingleDiscount) {
		sMaxSingleDiscount = maxSingleDiscount;
	}
	public String getSMaxMultipleDiscount() {
		return sMaxMultipleDiscount;
	}
	public void setSMaxMultipleDiscount(String maxMultipleDiscount) {
		sMaxMultipleDiscount = maxMultipleDiscount;
	}
	public String getSDiscountApplied() {
		return sDiscountApplied;
	}
	public void setSDiscountApplied(String discountApplied) {
		sDiscountApplied = discountApplied;
	}
	public Merchant getOMerchant() {
		return oMerchant;
	}
	public void setOMerchant(Merchant merchant) {
		oMerchant = merchant;
	}
	public Category getOCategory() {
		return oCategory;
	}
	public void setOCategory(Category category) {
		oCategory = category;
	}
	
}
