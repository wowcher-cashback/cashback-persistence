package uk.co.wowcher.cashback.persistence.domain;

public class TransactionType {
	private int iTransactionGroupId;
	private String sTransactionGroupCode;
	private String sTransactionGroupName;
	private String sTransactionGroupDescription;
	public int getITransactionGroupId() {
		return iTransactionGroupId;
	}
	public void setITransactionGroupId(int transactionGroupId) {
		iTransactionGroupId = transactionGroupId;
	}
	public String getSTransactionGroupCode() {
		return sTransactionGroupCode;
	}
	public void setSTransactionGroupCode(String transactionGroupCode) {
		sTransactionGroupCode = transactionGroupCode;
	}
	public String getSTransactionGroupName() {
		return sTransactionGroupName;
	}
	public void setSTransactionGroupName(String transactionGroupName) {
		sTransactionGroupName = transactionGroupName;
	}
	public String getSTransactionGroupDescription() {
		return sTransactionGroupDescription;
	}
	public void setSTransactionGroupDescription(String transactionGroupDescription) {
		sTransactionGroupDescription = transactionGroupDescription;
	}
	
}
