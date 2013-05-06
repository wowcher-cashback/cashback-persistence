package uk.co.wowcher.cashback.persistence.domain;

public class AWTransactionUserCashBackByMerchantAssoc {
	private int iId;
	private UserCashBackByMerchant oUserCashBackByMerchant;
	private AWTransaction oAWTransaction;
	public int getIId() {
		return iId;
	}
	public void setIId(int id) {
		iId = id;
	}
	public UserCashBackByMerchant getOUserCashBackByMerchant() {
		return oUserCashBackByMerchant;
	}
	public void setOUserCashBackByMerchant(
			UserCashBackByMerchant userCashBackByMerchant) {
		oUserCashBackByMerchant = userCashBackByMerchant;
	}
	public AWTransaction getOAWTransaction() {
		return oAWTransaction;
	}
	public void setOAWTransaction(AWTransaction transaction) {
		oAWTransaction = transaction;
	}
	
}
