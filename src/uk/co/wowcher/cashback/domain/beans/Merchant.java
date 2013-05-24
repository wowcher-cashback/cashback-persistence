package uk.co.wowcher.cashback.domain.beans;

import org.springframework.stereotype.Component;


@Component("domainMerchant")
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

	private String sTermsAndConditions;

	private boolean bIsSpecialBonusAvailable;

	private float sSpecialBonus;

	private boolean bdeletedFlag;
	
	private int iSortOrder;
	
	private TrackingStats oTrackingStats;
	
	

	public TrackingStats getoTrackingStats() {
		return oTrackingStats;
	}

	public void setoTrackingStats(TrackingStats oTrackingStats) {
		this.oTrackingStats = oTrackingStats;
	}

	public int getiSortOrder() {
		return iSortOrder;
	}

	public void setiSortOrder(int iSortOrder) {
		this.iSortOrder = iSortOrder;
	}

	public int getiMerchantId() {
		return iMerchantId;
	}

	public void setiMerchantId(int iMerchantId) {
		this.iMerchantId = iMerchantId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getiMerchantCode() {
		return iMerchantCode;
	}

	public void setiMerchantCode(int iMerchantCode) {
		this.iMerchantCode = iMerchantCode;
	}

	public String getsUrl() {
		return sUrl;
	}

	public void setsUrl(String sUrl) {
		this.sUrl = sUrl;
	}

	public String getsDescription() {
		return sDescription;
	}

	public void setsDescription(String sDescription) {
		this.sDescription = sDescription;
	}

	public String getsLogoUrl() {
		return sLogoUrl;
	}

	public void setsLogoUrl(String sLogoUrl) {
		this.sLogoUrl = sLogoUrl;
	}

	public String getsTerms() {
		return sTerms;
	}

	public void setsTerms(String sTerms) {
		this.sTerms = sTerms;
	}

	public boolean isbIsActive() {
		return bIsActive;
	}

	public void setbIsActive(boolean bIsActive) {
		this.bIsActive = bIsActive;
	}

	public boolean isbIsExclusive() {
		return bIsExclusive;
	}

	public void setbIsExclusive(boolean bIsExclusive) {
		this.bIsExclusive = bIsExclusive;
	}

	public String getsTermsAndConditions() {
		return sTermsAndConditions;
	}

	public void setsTermsAndConditions(String sTermsAndConditions) {
		this.sTermsAndConditions = sTermsAndConditions;
	}

	public boolean isbIsSpecialBonusAvailable() {
		return bIsSpecialBonusAvailable;
	}

	public void setbIsSpecialBonusAvailable(boolean bIsSpecialBonusAvailable) {
		this.bIsSpecialBonusAvailable = bIsSpecialBonusAvailable;
	}

	public float getsSpecialBonus() {
		return sSpecialBonus;
	}

	public void setsSpecialBonus(float sSpecialBonus) {
		this.sSpecialBonus = sSpecialBonus;
	}

	public boolean isBdeletedFlag() {
		return bdeletedFlag;
	}

	public void setBdeletedFlag(boolean bdeletedFlag) {
		this.bdeletedFlag = bdeletedFlag;
	}

	@Override
	public String toString() {
		return "Merchant [iMerchantId=" + iMerchantId + ", sName=" + sName
				+ ", iMerchantCode=" + iMerchantCode + ", sUrl=" + sUrl
				+ ", sDescription=" + sDescription + ", sLogoUrl=" + sLogoUrl
				+ ", sTerms=" + sTerms + ", bIsActive=" + bIsActive
				+ ", bIsExclusive=" + bIsExclusive + ", sTermsAndConditions="
				+ sTermsAndConditions + ", bIsSpecialBonusAvailable="
				+ bIsSpecialBonusAvailable + ", sSpecialBonus=" + sSpecialBonus
				+ "]";
	}
	
	



}
