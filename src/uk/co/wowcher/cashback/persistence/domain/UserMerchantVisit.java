package uk.co.wowcher.cashback.persistence.domain;

import java.util.Date;

public class UserMerchantVisit {
	private int iUserMerchantVisitId;
	private Date dVisitedDate;
	private CashBackUser oUser;
	private Merchant oMerchantVisited;
	public int getIUserMerchantVisitId() {
		return iUserMerchantVisitId;
	}
	public void setIUserMerchantVisitId(int userMerchantVisitId) {
		iUserMerchantVisitId = userMerchantVisitId;
	}
	public Date getDVisitedDate() {
		return dVisitedDate;
	}
	public void setDVisitedDate(Date visitedDate) {
		dVisitedDate = visitedDate;
	}
	public CashBackUser getOUser() {
		return oUser;
	}
	public void setOUser(CashBackUser user) {
		oUser = user;
	}
	public Merchant getOMerchantVisited() {
		return oMerchantVisited;
	}
	public void setOMerchantVisited(Merchant merchantVisited) {
		oMerchantVisited = merchantVisited;
	}
	
}
