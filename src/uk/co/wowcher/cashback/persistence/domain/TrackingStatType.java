package uk.co.wowcher.cashback.persistence.domain;

public class TrackingStatType {
	private int iTrackingStatTypeId;
	private String sTrackingStatTypeCode;
	private String sTrackingStatTypeName;
	private String STrackingStatTypeDescription;
	public int getITrackingStatTypeId() {
		return iTrackingStatTypeId;
	}
	public void setITrackingStatTypeId(int trackingStatTypeId) {
		iTrackingStatTypeId = trackingStatTypeId;
	}
	public String getSTrackingStatTypeCode() {
		return sTrackingStatTypeCode;
	}
	public void setSTrackingStatTypeCode(String trackingStatTypeCode) {
		sTrackingStatTypeCode = trackingStatTypeCode;
	}
	public String getSTrackingStatTypeName() {
		return sTrackingStatTypeName;
	}
	public void setSTrackingStatTypeName(String trackingStatTypeName) {
		sTrackingStatTypeName = trackingStatTypeName;
	}
	public String getSTrackingStatTypeDescription() {
		return STrackingStatTypeDescription;
	}
	public void setSTrackingStatTypeDescription(String trackingStatTypeDescription) {
		STrackingStatTypeDescription = trackingStatTypeDescription;
	}
	
}
