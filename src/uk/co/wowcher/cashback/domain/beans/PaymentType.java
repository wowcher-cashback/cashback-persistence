package uk.co.wowcher.cashback.domain.beans;

public class PaymentType {

	private int iPaymentTypeId;
	private String sPaymentTypeCode;
	private String sPaymentTypeName;
	private String sPaymentTypeDescription;
	
	
	
	public int getiPaymentTypeId() {
		return iPaymentTypeId;
	}
	public void setiPaymentTypeId(int iPaymentTypeId) {
		this.iPaymentTypeId = iPaymentTypeId;
	}
	public String getsPaymentTypeCode() {
		return sPaymentTypeCode;
	}
	public void setsPaymentTypeCode(String sPaymentTypeCode) {
		this.sPaymentTypeCode = sPaymentTypeCode;
	}
	public String getsPaymentTypeName() {
		return sPaymentTypeName;
	}
	public void setsPaymentTypeName(String sPaymentTypeName) {
		this.sPaymentTypeName = sPaymentTypeName;
	}
	public String getsPaymentTypeDescription() {
		return sPaymentTypeDescription;
	}
	public void setsPaymentTypeDescription(String sPaymentTypeDescription) {
		this.sPaymentTypeDescription = sPaymentTypeDescription;
	}
	
	
	
	
}
