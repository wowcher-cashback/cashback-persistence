package uk.co.wowcher.cashback.persistence.domain;

public class TrackingStats {
	private int iTrackingStatsId;
	private String sTrackingStatValue;
	private String sTrackingStatValueDesc;
	private TrackingStatType oTrackingStatType;
	public int getITrackingStatsId() {
		return iTrackingStatsId;
	}
	public void setITrackingStatsId(int trackingStatsId) {
		iTrackingStatsId = trackingStatsId;
	}
	public String getSTrackingStatValue() {
		return sTrackingStatValue;
	}
	public void setSTrackingStatValue(String trackingStatValue) {
		sTrackingStatValue = trackingStatValue;
	}
	public String getSTrackingStatValueDesc() {
		return sTrackingStatValueDesc;
	}
	public void setSTrackingStatValueDesc(String trackingStatValueDesc) {
		sTrackingStatValueDesc = trackingStatValueDesc;
	}
	public TrackingStatType getOTrackingStatType() {
		return oTrackingStatType;
	}
	public void setOTrackingStatType(TrackingStatType trackingStatType) {
		oTrackingStatType = trackingStatType;
	}
	
}
