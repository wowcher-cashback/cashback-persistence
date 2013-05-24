package uk.co.wowcher.cashback.domain.beans;

public class TrackingStatType {

	private int iTrackingStatTypeId;
	private String sTrackingStatTypeCode;
	private String sTrackingStatTypeName;
	private String STrackingStatTypeDescription;
	
	
	public int getiTrackingStatTypeId() {
		return iTrackingStatTypeId;
	}
	public void setiTrackingStatTypeId(int iTrackingStatTypeId) {
		this.iTrackingStatTypeId = iTrackingStatTypeId;
	}
	public String getsTrackingStatTypeCode() {
		return sTrackingStatTypeCode;
	}
	public void setsTrackingStatTypeCode(String sTrackingStatTypeCode) {
		this.sTrackingStatTypeCode = sTrackingStatTypeCode;
	}
	public String getsTrackingStatTypeName() {
		return sTrackingStatTypeName;
	}
	public void setsTrackingStatTypeName(String sTrackingStatTypeName) {
		this.sTrackingStatTypeName = sTrackingStatTypeName;
	}
	public String getSTrackingStatTypeDescription() {
		return STrackingStatTypeDescription;
	}
	public void setSTrackingStatTypeDescription(String sTrackingStatTypeDescription) {
		STrackingStatTypeDescription = sTrackingStatTypeDescription;
	}
	
}
