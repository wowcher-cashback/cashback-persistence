package uk.co.wowcher.cashback.persistence.domain;

import java.util.Date;

public class UserCashBackByMerchant {
	private int iCashBackId;
	private CashBackUser oUser;
	private Merchant oMerchant;
	private Money oAmount;
	private Date dLastUpdatedDate;
	private boolean bIsTransfered;
	private TransactionStatus oStatus;
	public int getICashBackId() {
		return iCashBackId;
	}
	public void setICashBackId(int cashBackId) {
		iCashBackId = cashBackId;
	}
	public CashBackUser getOUser() {
		return oUser;
	}
	public void setOUser(CashBackUser user) {
		oUser = user;
	}
	public Merchant getOMerchant() {
		return oMerchant;
	}
	public void setOMerchant(Merchant merchant) {
		oMerchant = merchant;
	}
	public Money getOAmount() {
		return oAmount;
	}
	public void setOAmount(Money amount) {
		oAmount = amount;
	}
	public Date getDLastUpdatedDate() {
		return dLastUpdatedDate;
	}
	public void setDLastUpdatedDate(Date lastUpdatedDate) {
		dLastUpdatedDate = lastUpdatedDate;
	}
	public boolean isBIsTransfered() {
		return bIsTransfered;
	}
	public void setBIsTransfered(boolean isTransfered) {
		bIsTransfered = isTransfered;
	}
	public TransactionStatus getOStatus() {
		return oStatus;
	}
	public void setOStatus(TransactionStatus status) {
		oStatus = status;
	}
	
}
