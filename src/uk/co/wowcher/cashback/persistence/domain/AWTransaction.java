package uk.co.wowcher.cashback.persistence.domain;

import java.util.Date;

public class AWTransaction {
	private int iAWTransactionId;
	private int iFeedTransactionId;
	private Money oCommissionAmount;
	private Money oSaleAmount;
	private TransactionStatus oStatus;
	private String slp;
	private String sDeclinedReason;
	private Date dClickDate;
	private Date dTransactionDate;
	private Date dValidationDate;
	private CashBackUser oCashBackUser;
	private Merchant oMerchant;
	private TransactionType oTransactionType;
	public int getIAWTransactionId() {
		return iAWTransactionId;
	}
	public void setIAWTransactionId(int transactionId) {
		iAWTransactionId = transactionId;
	}
	public int getIFeedTransactionId() {
		return iFeedTransactionId;
	}
	public void setIFeedTransactionId(int feedTransactionId) {
		iFeedTransactionId = feedTransactionId;
	}
	public Money getOCommissionAmount() {
		return oCommissionAmount;
	}
	public void setOCommissionAmount(Money commissionAmount) {
		oCommissionAmount = commissionAmount;
	}
	public Money getOSaleAmount() {
		return oSaleAmount;
	}
	public void setOSaleAmount(Money saleAmount) {
		oSaleAmount = saleAmount;
	}
	public TransactionStatus getOStatus() {
		return oStatus;
	}
	public void setOStatus(TransactionStatus status) {
		oStatus = status;
	}
	public String getSlp() {
		return slp;
	}
	public void setSlp(String slp) {
		this.slp = slp;
	}
	public String getSDeclinedReason() {
		return sDeclinedReason;
	}
	public void setSDeclinedReason(String declinedReason) {
		sDeclinedReason = declinedReason;
	}
	public Date getDClickDate() {
		return dClickDate;
	}
	public void setDClickDate(Date clickDate) {
		dClickDate = clickDate;
	}
	public Date getDTransactionDate() {
		return dTransactionDate;
	}
	public void setDTransactionDate(Date transactionDate) {
		dTransactionDate = transactionDate;
	}
	public Date getDValidationDate() {
		return dValidationDate;
	}
	public void setDValidationDate(Date validationDate) {
		dValidationDate = validationDate;
	}
	public CashBackUser getOCashBackUser() {
		return oCashBackUser;
	}
	public void setOCashBackUser(CashBackUser cashBackUser) {
		oCashBackUser = cashBackUser;
	}
	public Merchant getOMerchant() {
		return oMerchant;
	}
	public void setOMerchant(Merchant merchant) {
		oMerchant = merchant;
	}
	public TransactionType getOTransactionType() {
		return oTransactionType;
	}
	public void setOTransactionType(TransactionType transactionType) {
		oTransactionType = transactionType;
	}
	
}
