package uk.co.wowcher.cashback.domain.beans;

import java.util.Date;


public class CommissionGroup {

	
	private int iCommissionGroupId;
	
	private String sCommissionGroupCode;
	private float fCommissionGroupRate;
	private RateType oCommissionGroupRateType;
	private Date dValidFrom;
	private Date dValidTo;
	
	
	public int getiCommissionGroupId() {
		return iCommissionGroupId;
	}
	public void setiCommissionGroupId(int iCommissionGroupId) {
		this.iCommissionGroupId = iCommissionGroupId;
	}
	public String getsCommissionGroupCode() {
		return sCommissionGroupCode;
	}
	public void setsCommissionGroupCode(String sCommissionGroupCode) {
		this.sCommissionGroupCode = sCommissionGroupCode;
	}
	public float getfCommissionGroupRate() {
		return fCommissionGroupRate;
	}
	public void setfCommissionGroupRate(float fCommissionGroupRate) {
		this.fCommissionGroupRate = fCommissionGroupRate;
	}
	public RateType getoCommissionGroupRateType() {
		return oCommissionGroupRateType;
	}
	public void setoCommissionGroupRateType(RateType oCommissionGroupRateType) {
		this.oCommissionGroupRateType = oCommissionGroupRateType;
	}
	public Date getdValidFrom() {
		return dValidFrom;
	}
	public void setdValidFrom(Date dValidFrom) {
		this.dValidFrom = dValidFrom;
	}
	public Date getdValidTo() {
		return dValidTo;
	}
	public void setdValidTo(Date dValidTo) {
		this.dValidTo = dValidTo;
	}
	
}
