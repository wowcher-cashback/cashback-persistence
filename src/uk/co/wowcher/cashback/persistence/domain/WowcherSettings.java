package uk.co.wowcher.cashback.persistence.domain;

public class WowcherSettings {
	private int iWowcherSettingsId;
	private float fCashBackRetainAmount;
	private Money oMinTransferAmount;
	private float fSignUpBonus;
	private int iCashBackExpiryTime;
	private String sCashBackBonusType;
	private float fCashBackBonus;
	private CashBackUser oAdmin;
	public int getIWowcherSettingsId() {
		return iWowcherSettingsId;
	}
	public void setIWowcherSettingsId(int wowcherSettingsId) {
		iWowcherSettingsId = wowcherSettingsId;
	}
	public float getFCashBackRetainAmount() {
		return fCashBackRetainAmount;
	}
	public void setFCashBackRetainAmount(float cashBackRetainAmount) {
		fCashBackRetainAmount = cashBackRetainAmount;
	}
	public Money getOMinTransferAmount() {
		return oMinTransferAmount;
	}
	public void setOMinTransferAmount(Money minTransferAmount) {
		oMinTransferAmount = minTransferAmount;
	}
	public float getFSignUpBonus() {
		return fSignUpBonus;
	}
	public void setFSignUpBonus(float signUpBonus) {
		fSignUpBonus = signUpBonus;
	}
	public int getICashBackExpiryTime() {
		return iCashBackExpiryTime;
	}
	public void setICashBackExpiryTime(int cashBackExpiryTime) {
		iCashBackExpiryTime = cashBackExpiryTime;
	}
	public String getSCashBackBonusType() {
		return sCashBackBonusType;
	}
	public void setSCashBackBonusType(String cashBackBonusType) {
		sCashBackBonusType = cashBackBonusType;
	}
	public float getFCashBackBonus() {
		return fCashBackBonus;
	}
	public void setFCashBackBonus(float cashBackBonus) {
		fCashBackBonus = cashBackBonus;
	}
	public CashBackUser getOAdmin() {
		return oAdmin;
	}
	public void setOAdmin(CashBackUser admin) {
		oAdmin = admin;
	}
	
}
