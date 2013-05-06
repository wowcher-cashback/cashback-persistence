package uk.co.wowcher.cashback.persistence.domain;

public class CashBackByMerchantWalletTransactionAssoc {
	private int iCashBackByMerchantWalletTransactionAssocId;
	private UserCashBackByMerchant oUserCashBackByMerchant;
	private WalletTransaction oWalletTransaction;
	public int getICashBackByMerchantWalletTransactionAssocId() {
		return iCashBackByMerchantWalletTransactionAssocId;
	}
	public void setICashBackByMerchantWalletTransactionAssocId(
			int cashBackByMerchantWalletTransactionAssocId) {
		iCashBackByMerchantWalletTransactionAssocId = cashBackByMerchantWalletTransactionAssocId;
	}
	public UserCashBackByMerchant getOUserCashBackByMerchant() {
		return oUserCashBackByMerchant;
	}
	public void setOUserCashBackByMerchant(
			UserCashBackByMerchant userCashBackByMerchant) {
		oUserCashBackByMerchant = userCashBackByMerchant;
	}
	public WalletTransaction getOWalletTransaction() {
		return oWalletTransaction;
	}
	public void setOWalletTransaction(WalletTransaction walletTransaction) {
		oWalletTransaction = walletTransaction;
	}
	
}
