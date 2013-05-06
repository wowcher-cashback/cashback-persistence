package uk.co.wowcher.cashback.persistence.domain;

public class UserPaymentSetting {
	private int iPaymentSettingsId;
	private PaymentType oPaymentType;
	private String sPayPalEmail;
	private String sPayPalPassword;
	private String sSortCode;
	private String sAccNo;
	private String sAccName;
	public int getIPaymentSettingsId() {
		return iPaymentSettingsId;
	}
	public void setIPaymentSettingsId(int paymentSettingsId) {
		iPaymentSettingsId = paymentSettingsId;
	}
	public PaymentType getOPaymentType() {
		return oPaymentType;
	}
	public void setOPaymentType(PaymentType paymentType) {
		oPaymentType = paymentType;
	}
	public String getSPayPalEmail() {
		return sPayPalEmail;
	}
	public void setSPayPalEmail(String payPalEmail) {
		sPayPalEmail = payPalEmail;
	}
	public String getSPayPalPassword() {
		return sPayPalPassword;
	}
	public void setSPayPalPassword(String payPalPassword) {
		sPayPalPassword = payPalPassword;
	}
	public String getSSortCode() {
		return sSortCode;
	}
	public void setSSortCode(String sortCode) {
		sSortCode = sortCode;
	}
	public String getSAccNo() {
		return sAccNo;
	}
	public void setSAccNo(String accNo) {
		sAccNo = accNo;
	}
	public String getSAccName() {
		return sAccName;
	}
	public void setSAccName(String accName) {
		sAccName = accName;
	}
	
}
