package uk.co.wowcher.cashback.persistence.domain;

public class TransactionStatusGroup {
	private int iTransactionStatusGroupId;
	private String sTransactionStatusGroupCode;
	private String sTransactionStatusGroupName;
	private String sTransactionStatusGroupDescription;
	public int getITransactionStatusGroupId() {
		return iTransactionStatusGroupId;
	}
	public void setITransactionStatusGroupId(int transactionStatusGroupId) {
		iTransactionStatusGroupId = transactionStatusGroupId;
	}
	public String getSTransactionStatusGroupCode() {
		return sTransactionStatusGroupCode;
	}
	public void setSTransactionStatusGroupCode(String transactionStatusGroupCode) {
		sTransactionStatusGroupCode = transactionStatusGroupCode;
	}
	public String getSTransactionStatusGroupName() {
		return sTransactionStatusGroupName;
	}
	public void setSTransactionStatusGroupName(String transactionStatusGroupName) {
		sTransactionStatusGroupName = transactionStatusGroupName;
	}
	public String getSTransactionStatusGroupDescription() {
		return sTransactionStatusGroupDescription;
	}
	public void setSTransactionStatusGroupDescription(
			String transactionStatusGroupDescription) {
		sTransactionStatusGroupDescription = transactionStatusGroupDescription;
	}
	
}
