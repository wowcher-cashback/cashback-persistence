package uk.co.wowcher.cashback.persistence.domain;

public class Money {
	private int iMoneyId;
	private float fAmount;
	private String sCurrency;
	public int getIMoneyId() {
		return iMoneyId;
	}
	public void setIMoneyId(int moneyId) {
		iMoneyId = moneyId;
	}
	public float getFAmount() {
		return fAmount;
	}
	public void setFAmount(float amount) {
		fAmount = amount;
	}
	public String getSCurrency() {
		return sCurrency;
	}
	public void setSCurrency(String currency) {
		sCurrency = currency;
	}
	
}
