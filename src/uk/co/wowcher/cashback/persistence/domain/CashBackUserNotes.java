package uk.co.wowcher.cashback.persistence.domain;

import java.util.Date;

public class CashBackUserNotes {
	private int iCashBackUserNoteId;
	private Date dCreatedDate;
	private CashBackUser oWowcherAdmin;
	private String sNote;
	private CashBackUser oCashBackUser;
	public int getICashBackUserNoteId() {
		return iCashBackUserNoteId;
	}
	public void setICashBackUserNoteId(int cashBackUserNoteId) {
		iCashBackUserNoteId = cashBackUserNoteId;
	}
	public Date getDCreatedDate() {
		return dCreatedDate;
	}
	public void setDCreatedDate(Date createdDate) {
		dCreatedDate = createdDate;
	}
	public CashBackUser getOWowcherAdmin() {
		return oWowcherAdmin;
	}
	public void setOWowcherAdmin(CashBackUser wowcherAdmin) {
		oWowcherAdmin = wowcherAdmin;
	}
	public String getSNote() {
		return sNote;
	}
	public void setSNote(String note) {
		sNote = note;
	}
	public CashBackUser getOCashBackUser() {
		return oCashBackUser;
	}
	public void setOCashBackUser(CashBackUser cashBackUser) {
		oCashBackUser = cashBackUser;
	}
	
}
