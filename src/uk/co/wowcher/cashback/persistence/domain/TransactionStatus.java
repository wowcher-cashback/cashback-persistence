package uk.co.wowcher.cashback.persistence.domain;

public class TransactionStatus {
	private int iCashBackStatusId;
	private String sCashBackStatusCode;
	private String sCashBackStatusName;
	private String sCashBackStatusDescription;
	private TransactionStatusGroup oTransactionGroup;
	public int getICashBackStatusId() {
		return iCashBackStatusId;
	}
	public void setICashBackStatusId(int cashBackStatusId) {
		iCashBackStatusId = cashBackStatusId;
	}
	public String getSCashBackStatusCode() {
		return sCashBackStatusCode;
	}
	public void setSCashBackStatusCode(String cashBackStatusCode) {
		sCashBackStatusCode = cashBackStatusCode;
	}
	public String getSCashBackStatusName() {
		return sCashBackStatusName;
	}
	public void setSCashBackStatusName(String cashBackStatusName) {
		sCashBackStatusName = cashBackStatusName;
	}
	public String getSCashBackStatusDescription() {
		return sCashBackStatusDescription;
	}
	public void setSCashBackStatusDescription(String cashBackStatusDescription) {
		sCashBackStatusDescription = cashBackStatusDescription;
	}
	public TransactionStatusGroup getOTransactionGroup() {
		return oTransactionGroup;
	}
	public void setOTransactionGroup(TransactionStatusGroup transactionGroup) {
		oTransactionGroup = transactionGroup;
	}
	
}	
