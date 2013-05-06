package uk.co.wowcher.cashback.persistence.domain;

public class PaymentType {
	private int iPaymentTypeId;
	private String sPaymentTypeCode;
	private String sPaymentTypeName;
	private String sPaymentTypeDescription;
	public int getIPaymentTypeId() {
		return iPaymentTypeId;
	}
	public void setIPaymentTypeId(int paymentTypeId) {
		iPaymentTypeId = paymentTypeId;
	}
	public String getSPaymentTypeCode() {
		return sPaymentTypeCode;
	}
	public void setSPaymentTypeCode(String paymentTypeCode) {
		sPaymentTypeCode = paymentTypeCode;
	}
	public String getSPaymentTypeName() {
		return sPaymentTypeName;
	}
	public void setSPaymentTypeName(String paymentTypeName) {
		sPaymentTypeName = paymentTypeName;
	}
	public String getSPaymentTypeDescription() {
		return sPaymentTypeDescription;
	}
	public void setSPaymentTypeDescription(String paymentTypeDescription) {
		sPaymentTypeDescription = paymentTypeDescription;
	}
	
}
