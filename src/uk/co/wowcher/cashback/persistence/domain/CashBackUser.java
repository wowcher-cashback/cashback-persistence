package uk.co.wowcher.cashback.persistence.domain;

public class CashBackUser {
	private int iCashBackUserId;
	private String sFirstName;
	private String sSurName;
	private String sUserName;
	private String sEmail;
	private String sPassword;
	private boolean bIsActive;
	private UserType oUserType;
	private boolean bEmailFromWowcher;
	private boolean bEmailFromDMGT;
	private Money oTotalAvailableCredit;
	private UserPaymentSetting oUserPaymentSetting;
	public int getICashBackUserId() {
		return iCashBackUserId;
	}
	public void setICashBackUserId(int cashBackUserId) {
		iCashBackUserId = cashBackUserId;
	}
	public String getSFirstName() {
		return sFirstName;
	}
	public void setSFirstName(String firstName) {
		sFirstName = firstName;
	}
	public String getSSurName() {
		return sSurName;
	}
	public void setSSurName(String surName) {
		sSurName = surName;
	}
	public String getSUserName() {
		return sUserName;
	}
	public void setSUserName(String userName) {
		sUserName = userName;
	}
	public String getSEmail() {
		return sEmail;
	}
	public void setSEmail(String email) {
		sEmail = email;
	}
	public String getSPassword() {
		return sPassword;
	}
	public void setSPassword(String password) {
		sPassword = password;
	}
	public boolean isBIsActive() {
		return bIsActive;
	}
	public void setBIsActive(boolean isActive) {
		bIsActive = isActive;
	}
	public UserType getOUserType() {
		return oUserType;
	}
	public void setOUserType(UserType userType) {
		oUserType = userType;
	}
	public boolean isBEmailFromWowcher() {
		return bEmailFromWowcher;
	}
	public void setBEmailFromWowcher(boolean emailFromWowcher) {
		bEmailFromWowcher = emailFromWowcher;
	}
	public boolean isBEmailFromDMGT() {
		return bEmailFromDMGT;
	}
	public void setBEmailFromDMGT(boolean emailFromDMGT) {
		bEmailFromDMGT = emailFromDMGT;
	}
	public Money getOTotalAvailableCredit() {
		return oTotalAvailableCredit;
	}
	public void setOTotalAvailableCredit(Money totalAvailableCredit) {
		oTotalAvailableCredit = totalAvailableCredit;
	}
	public UserPaymentSetting getOUserPaymentSetting() {
		return oUserPaymentSetting;
	}
	public void setOUserPaymentSetting(UserPaymentSetting userPaymentSetting) {
		oUserPaymentSetting = userPaymentSetting;
	}
	
}
