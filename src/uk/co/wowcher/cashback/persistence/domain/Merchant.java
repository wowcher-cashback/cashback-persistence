package uk.co.wowcher.cashback.persistence.domain;

public class Merchant {
	private int iMerchantId;
	private String sName;
	private int iMerchantCode;
	private String sUrl;
	private String sDescription;
	private String sLogoUrl;
	private String sTerms;
	private boolean bIsActive;
	private boolean bIsExclusive;
	private TrackingStats oTrackingStats;
	private String sTermsAndConditions;
	public int getIMerchantId() {
		return iMerchantId;
	}
	public void setIMerchantId(int merchantId) {
		iMerchantId = merchantId;
	}
	public String getSName() {
		return sName;
	}
	public void setSName(String name) {
		sName = name;
	}
	public int getIMerchantCode() {
		return iMerchantCode;
	}
	public void setIMerchantCode(int merchantCode) {
		iMerchantCode = merchantCode;
	}
	public String getSUrl() {
		return sUrl;
	}
	public void setSUrl(String url) {
		sUrl = url;
	}
	public String getSDescription() {
		return sDescription;
	}
	public void setSDescription(String description) {
		sDescription = description;
	}
	public String getSLogoUrl() {
		return sLogoUrl;
	}
	public void setSLogoUrl(String logoUrl) {
		sLogoUrl = logoUrl;
	}
	public String getSTerms() {
		return sTerms;
	}
	public void setSTerms(String terms) {
		sTerms = terms;
	}
	public boolean isBIsActive() {
		return bIsActive;
	}
	public void setBIsActive(boolean isActive) {
		bIsActive = isActive;
	}
	public boolean isBIsExclusive() {
		return bIsExclusive;
	}
	public void setBIsExclusive(boolean isExclusive) {
		bIsExclusive = isExclusive;
	}
	public TrackingStats getOTrackingStats() {
		return oTrackingStats;
	}
	public void setOTrackingStats(TrackingStats trackingStats) {
		oTrackingStats = trackingStats;
	}
	public String getSTermsAndConditions() {
		return sTermsAndConditions;
	}
	public void setSTermsAndConditions(String termsAndConditions) {
		sTermsAndConditions = termsAndConditions;
	}
}
