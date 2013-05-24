package uk.co.wowcher.cashback.domain.beans;


public class TrackingStats {
	

		private int iTrackingStatsId;
		private String sTrackingStatValue;
		private String sTrackingStatValueDesc;
		private TrackingStatType oTrackingStatType;
		private int iMerchantId;
		public int getiTrackingStatsId() {
			return iTrackingStatsId;
		}
		public void setiTrackingStatsId(int iTrackingStatsId) {
			this.iTrackingStatsId = iTrackingStatsId;
		}
		public String getsTrackingStatValue() {
			return sTrackingStatValue;
		}
		public void setsTrackingStatValue(String sTrackingStatValue) {
			this.sTrackingStatValue = sTrackingStatValue;
		}
		public String getsTrackingStatValueDesc() {
			return sTrackingStatValueDesc;
		}
		public void setsTrackingStatValueDesc(String sTrackingStatValueDesc) {
			this.sTrackingStatValueDesc = sTrackingStatValueDesc;
		}
		public TrackingStatType getoTrackingStatType() {
			return oTrackingStatType;
		}
		public void setoTrackingStatType(TrackingStatType oTrackingStatType) {
			this.oTrackingStatType = oTrackingStatType;
		}
		public int getiMerchantId() {
			return iMerchantId;
		}
		public void setiMerchantId(int iMerchantId) {
			this.iMerchantId = iMerchantId;
		}
		
		
		
	}


