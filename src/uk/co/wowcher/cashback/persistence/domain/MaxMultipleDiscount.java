package uk.co.wowcher.cashback.persistence.domain;

public class MaxMultipleDiscount {
	private int iMaxMultipleDiscountId;
	private NumberOfPlacements oNumberOfPlacements;
	private CampaignDuration oCampaignDuration;
	private String sMaxMultipleDiscount;
	public int getIMaxMultipleDiscountId() {
		return iMaxMultipleDiscountId;
	}
	public void setIMaxMultipleDiscountId(int maxMultipleDiscountId) {
		iMaxMultipleDiscountId = maxMultipleDiscountId;
	}
	public NumberOfPlacements getONumberOfPlacements() {
		return oNumberOfPlacements;
	}
	public void setONumberOfPlacements(NumberOfPlacements numberOfPlacements) {
		oNumberOfPlacements = numberOfPlacements;
	}
	public CampaignDuration getOCampaignDuration() {
		return oCampaignDuration;
	}
	public void setOCampaignDuration(CampaignDuration campaignDuration) {
		oCampaignDuration = campaignDuration;
	}
	public String getSMaxMultipleDiscount() {
		return sMaxMultipleDiscount;
	}
	public void setSMaxMultipleDiscount(String maxMultipleDiscount) {
		sMaxMultipleDiscount = maxMultipleDiscount;
	}
	
}
