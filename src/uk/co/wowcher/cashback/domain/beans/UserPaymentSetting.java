package uk.co.wowcher.cashback.domain.beans;

public class UserPaymentSetting {
	
	private int iPaymentSettingsId;
	private PaymentType oPaymentType;
	private String sPayPalEmail;
	private String sPayPalPassword;
	private String sSortCode;
	private String sAccNo;
	private String sAccName;
	
	
	
	
	
	public PaymentType getoPaymentType() {
		return oPaymentType;
	}
	public void setoPaymentType(PaymentType oPaymentType) {
		this.oPaymentType = oPaymentType;
	}
	public String getsPayPalEmail() {
		return sPayPalEmail;
	}
	public void setsPayPalEmail(String sPayPalEmail) {
		this.sPayPalEmail = sPayPalEmail;
	}
	public String getsPayPalPassword() {
		return sPayPalPassword;
	}
	public void setsPayPalPassword(String sPayPalPassword) {
		this.sPayPalPassword = sPayPalPassword;
	}
	public String getsSortCode() {
		return sSortCode;
	}
	public void setsSortCode(String sSortCode) {
		this.sSortCode = sSortCode;
	}
	public String getsAccNo() {
		return sAccNo;
	}
	public void setsAccNo(String sAccNo) {
		this.sAccNo = sAccNo;
	}
	public String getsAccName() {
		return sAccName;
	}
	public void setsAccName(String sAccName) {
		this.sAccName = sAccName;
	}
	public int getiPaymentSettingsId() {
		return iPaymentSettingsId;
	}
	public void setiPaymentSettingsId(int iPaymentSettingsId) {
		this.iPaymentSettingsId = iPaymentSettingsId;
	}
	
	
	
	

}
