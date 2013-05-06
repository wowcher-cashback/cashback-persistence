package uk.co.wowcher.cashback.persistence.domain;

public class CampaignDuration {
	private int iCampaignDurationID;
	private String sCampaignDurationCode;
	private String sCampaignDurationName;
	private String sCampaignDurationDescription;
	public int getICampaignDurationID() {
		return iCampaignDurationID;
	}
	public void setICampaignDurationID(int campaignDurationID) {
		iCampaignDurationID = campaignDurationID;
	}
	public String getSCampaignDurationCode() {
		return sCampaignDurationCode;
	}
	public void setSCampaignDurationCode(String campaignDurationCode) {
		sCampaignDurationCode = campaignDurationCode;
	}
	public String getSCampaignDurationName() {
		return sCampaignDurationName;
	}
	public void setSCampaignDurationName(String campaignDurationName) {
		sCampaignDurationName = campaignDurationName;
	}
	public String getSCampaignDurationDescription() {
		return sCampaignDurationDescription;
	}
	public void setSCampaignDurationDescription(String campaignDurationDescription) {
		sCampaignDurationDescription = campaignDurationDescription;
	}
	
}
