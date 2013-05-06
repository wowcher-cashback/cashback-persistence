package uk.co.wowcher.cashback.persistence.domain;

import java.util.Date;

public class ManualCashbackClaim {
	private int iManualCashbackClaimId;
	private ManualCashbackStatus oStatus;
	private Date dClaimDate;
	private Date dOrderDate;
	private Merchant oMerchant;
	private ManualCashbackReason oClaimType;
	private int iOrderNumber;
	private String sCashbackRate;
	private RateType oManualCashbackRateType;
	private Money oTransactionAmount;
	private Money oCashbackAmount;
	private String sEmailAddressForPurchase;
	private CashBackUser oCashbackUser;
	public int getIManualCashbackClaimId() {
		return iManualCashbackClaimId;
	}
	public void setIManualCashbackClaimId(int manualCashbackClaimId) {
		iManualCashbackClaimId = manualCashbackClaimId;
	}
	public ManualCashbackStatus getOStatus() {
		return oStatus;
	}
	public void setOStatus(ManualCashbackStatus status) {
		oStatus = status;
	}
	public Date getDClaimDate() {
		return dClaimDate;
	}
	public void setDClaimDate(Date claimDate) {
		dClaimDate = claimDate;
	}
	public Date getDOrderDate() {
		return dOrderDate;
	}
	public void setDOrderDate(Date orderDate) {
		dOrderDate = orderDate;
	}
	public Merchant getOMerchant() {
		return oMerchant;
	}
	public void setOMerchant(Merchant merchant) {
		oMerchant = merchant;
	}
	public ManualCashbackReason getOClaimType() {
		return oClaimType;
	}
	public void setOClaimType(ManualCashbackReason claimType) {
		oClaimType = claimType;
	}
	public int getIOrderNumber() {
		return iOrderNumber;
	}
	public void setIOrderNumber(int orderNumber) {
		iOrderNumber = orderNumber;
	}
	public String getSCashbackRate() {
		return sCashbackRate;
	}
	public void setSCashbackRate(String cashbackRate) {
		sCashbackRate = cashbackRate;
	}
	public RateType getOManualCashbackRateType() {
		return oManualCashbackRateType;
	}
	public void setOManualCashbackRateType(RateType manualCashbackRateType) {
		oManualCashbackRateType = manualCashbackRateType;
	}
	public Money getOTransactionAmount() {
		return oTransactionAmount;
	}
	public void setOTransactionAmount(Money transactionAmount) {
		oTransactionAmount = transactionAmount;
	}
	public Money getOCashbackAmount() {
		return oCashbackAmount;
	}
	public void setOCashbackAmount(Money cashbackAmount) {
		oCashbackAmount = cashbackAmount;
	}
	public String getSEmailAddressForPurchase() {
		return sEmailAddressForPurchase;
	}
	public void setSEmailAddressForPurchase(String emailAddressForPurchase) {
		sEmailAddressForPurchase = emailAddressForPurchase;
	}
	public CashBackUser getOCashbackUser() {
		return oCashbackUser;
	}
	public void setOCashbackUser(CashBackUser cashbackUser) {
		oCashbackUser = cashbackUser;
	}
}
