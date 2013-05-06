package uk.co.wowcher.cashback.persistence.domain;

public class ManualCashbackStatus {
	private int iManualCashbackId;
	private String sManualCashbackStatusCode;
	private String sManualCashbackStatusName;
	private String sManualCashbackStatusDescription;
	public int getIManualCashbackId() {
		return iManualCashbackId;
	}
	public void setIManualCashbackId(int manualCashbackId) {
		iManualCashbackId = manualCashbackId;
	}
	public String getSManualCashbackStatusCode() {
		return sManualCashbackStatusCode;
	}
	public void setSManualCashbackStatusCode(String manualCashbackStatusCode) {
		sManualCashbackStatusCode = manualCashbackStatusCode;
	}
	public String getSManualCashbackStatusName() {
		return sManualCashbackStatusName;
	}
	public void setSManualCashbackStatusName(String manualCashbackStatusName) {
		sManualCashbackStatusName = manualCashbackStatusName;
	}
	public String getSManualCashbackStatusDescription() {
		return sManualCashbackStatusDescription;
	}
	public void setSManualCashbackStatusDescription(
			String manualCashbackStatusDescription) {
		sManualCashbackStatusDescription = manualCashbackStatusDescription;
	}
}
