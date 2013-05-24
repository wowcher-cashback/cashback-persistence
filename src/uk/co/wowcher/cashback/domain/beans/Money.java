package uk.co.wowcher.cashback.domain.beans;

public class Money {
	private int iMoneyId;
	private float fAmount;
	private String sCurrency;
	private MerchantDeal merchantDeal;
	public int getiMoneyId() {
		return iMoneyId;
	}
	public void setiMoneyId(int iMoneyId) {
		this.iMoneyId = iMoneyId;
	}
	public float getfAmount() {
		return fAmount;
	}
	public void setfAmount(float fAmount) {
		this.fAmount = fAmount;
	}
	public String getsCurrency() {
		return sCurrency;
	}
	public void setsCurrency(String sCurrency) {
		this.sCurrency = sCurrency;
	}
	public MerchantDeal getMerchantDeal() {
		return merchantDeal;
	}
	public void setMerchantDeal(MerchantDeal merchantDeal) {
		this.merchantDeal = merchantDeal;
	}
	
	
	
}
