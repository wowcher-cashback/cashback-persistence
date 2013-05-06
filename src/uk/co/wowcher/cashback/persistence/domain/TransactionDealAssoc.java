package uk.co.wowcher.cashback.persistence.domain;

public class TransactionDealAssoc {
	private int iTransactionDealAssocId;
	private AWTransaction oTransaction;
	private MerchantDeal oMerchantDeal;
	private Money oDealMoney;
	public int getITransactionDealAssocId() {
		return iTransactionDealAssocId;
	}
	public void setITransactionDealAssocId(int transactionDealAssocId) {
		iTransactionDealAssocId = transactionDealAssocId;
	}
	public AWTransaction getOTransaction() {
		return oTransaction;
	}
	public void setOTransaction(AWTransaction transaction) {
		oTransaction = transaction;
	}
	public MerchantDeal getOMerchantDeal() {
		return oMerchantDeal;
	}
	public void setOMerchantDeal(MerchantDeal merchantDeal) {
		oMerchantDeal = merchantDeal;
	}
	public Money getODealMoney() {
		return oDealMoney;
	}
	public void setODealMoney(Money dealMoney) {
		oDealMoney = dealMoney;
	}
	
}
