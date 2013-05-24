package uk.co.wowcher.cashback.domain.beans;

import org.springframework.stereotype.Component;

@Component("domainCashBackUser")
public class CashBackUser {
	
	private int iCashBackUserId;
	private String sFirstName;
	private String sSurName;
	private String sUserName;
	private String sEmail;
	private String sPassword;
	private boolean bIsActive;
	private UserType oUserType;
	private boolean bEmailfromWowcher;
	private boolean bEmailfromDMGT;
	private Money oTotalAvailableCredit;
	private UserPaymentSetting oUserPaymentSetting;
	
	public int getiCashBackUserId() {
		return iCashBackUserId;
	}
	public void setiCashBackUserId(int iCashBackUserId) {
		this.iCashBackUserId = iCashBackUserId;
	}
	public String getsFirstName() {
		return sFirstName;
	}
	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}
	public String getsSurName() {
		return sSurName;
	}
	public void setsSurName(String sSurName) {
		this.sSurName = sSurName;
	}
	public String getsUserName() {
		return sUserName;
	}
	public void setsUserName(String sUserName) {
		this.sUserName = sUserName;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public String getsPassword() {
		return sPassword;
	}
	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}
	public boolean isbIsActive() {
		return bIsActive;
	}
	public void setbIsActive(boolean bIsActive) {
		this.bIsActive = bIsActive;
	}
	public UserType getoUserType() {
		return oUserType;
	}
	public void setoUserType(UserType oUserType) {
		this.oUserType = oUserType;
	}
	public boolean isbEmailfromWowcher() {
		return bEmailfromWowcher;
	}
	public void setbEmailfromWowcher(boolean bEmailfromWowcher) {
		this.bEmailfromWowcher = bEmailfromWowcher;
	}
	public boolean isbEmailfromDMGT() {
		return bEmailfromDMGT;
	}
	public void setbEmailfromDMGT(boolean bEmailfromDMGT) {
		this.bEmailfromDMGT = bEmailfromDMGT;
	}
	public Money getoTotalAvailableCredit() {
		return oTotalAvailableCredit;
	}
	public void setoTotalAvailableCredit(Money oTotalAvailableCredit) {
		this.oTotalAvailableCredit = oTotalAvailableCredit;
	}
	public UserPaymentSetting getoUserPaymentSetting() {
		return oUserPaymentSetting;
	}
	public void setoUserPaymentSetting(UserPaymentSetting oUserPaymentSetting) {
		this.oUserPaymentSetting = oUserPaymentSetting;
	}
	@Override
	public String toString() {
		return "CashBackUser [iCashBackUserId=" + iCashBackUserId
				+ ", sFirstName=" + sFirstName + ", sSurName=" + sSurName
				+ ", sUserName=" + sUserName + ", sEmail=" + sEmail
				+ ", sPassword=" + sPassword + ", bIsActive=" + bIsActive
				+ ", oUserType=" + oUserType + ", bEmailfromWowcher="
				+ bEmailfromWowcher + ", bEmailfromDMGT=" + bEmailfromDMGT
				+ ", oTotalAvailableCredit=" + oTotalAvailableCredit
				+ ", oUserPaymentSetting=" + oUserPaymentSetting + "]";
	}
	
	
	
	

}
