package uk.co.wowcher.cashback.persistence.domain;

public class ManualCashbackReason {
	private int iManualCashBackReasonId;
	private String sManualCashBackReasonCode;
	private String sManualCashBackReasonName;
	private String sManualCashBackReasonDescription;
	public int getIManualCashBackReasonId() {
		return iManualCashBackReasonId;
	}
	public void setIManualCashBackReasonId(int manualCashBackReasonId) {
		iManualCashBackReasonId = manualCashBackReasonId;
	}
	public String getSManualCashBackReasonCode() {
		return sManualCashBackReasonCode;
	}
	public void setSManualCashBackReasonCode(String manualCashBackReasonCode) {
		sManualCashBackReasonCode = manualCashBackReasonCode;
	}
	public String getSManualCashBackReasonName() {
		return sManualCashBackReasonName;
	}
	public void setSManualCashBackReasonName(String manualCashBackReasonName) {
		sManualCashBackReasonName = manualCashBackReasonName;
	}
	public String getSManualCashBackReasonDescription() {
		return sManualCashBackReasonDescription;
	}
	public void setSManualCashBackReasonDescription(
			String manualCashBackReasonDescription) {
		sManualCashBackReasonDescription = manualCashBackReasonDescription;
	}
	
}
