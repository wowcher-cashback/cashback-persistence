package uk.co.wowcher.cashback.persistence.domain;

import java.util.Date;

public class WalletTransaction {
	private int iWowcherCashBackTransactionId;
	private TransactionStatus sStatus;
	private Date dTransactionDate;
	private RateType oRateType;
	private Money oTransactionAmount;
	private PaymentType oPaymentType;
	private CashBackUser oCashBackUser;
	public int getIWowcherCashBackTransactionId() {
		return iWowcherCashBackTransactionId;
	}
	public void setIWowcherCashBackTransactionId(int wowcherCashBackTransactionId) {
		iWowcherCashBackTransactionId = wowcherCashBackTransactionId;
	}
	public TransactionStatus getSStatus() {
		return sStatus;
	}
	public void setSStatus(TransactionStatus status) {
		sStatus = status;
	}
	public Date getDTransactionDate() {
		return dTransactionDate;
	}
	public void setDTransactionDate(Date transactionDate) {
		dTransactionDate = transactionDate;
	}
	public RateType getORateType() {
		return oRateType;
	}
	public void setORateType(RateType rateType) {
		oRateType = rateType;
	}
	public Money getOTransactionAmount() {
		return oTransactionAmount;
	}
	public void setOTransactionAmount(Money transactionAmount) {
		oTransactionAmount = transactionAmount;
	}
	public PaymentType getOPaymentType() {
		return oPaymentType;
	}
	public void setOPaymentType(PaymentType paymentType) {
		oPaymentType = paymentType;
	}
	public CashBackUser getOCashBackUser() {
		return oCashBackUser;
	}
	public void setOCashBackUser(CashBackUser cashBackUser) {
		oCashBackUser = cashBackUser;
	}
	
}
