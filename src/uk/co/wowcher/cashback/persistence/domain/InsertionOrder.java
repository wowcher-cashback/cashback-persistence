package uk.co.wowcher.cashback.persistence.domain;

public class InsertionOrder {
	private int iInsertionOrderId;
	private int iTotalDuration;
	private String sContactName;
	private String sContantEmail;
	private String sContantNo;
	private String sMerchantAdd;
	private String sTotalCost;
	private InsertionOrderStatus oStatus;
	private Merchant oMerchant;
	public int getIInsertionOrderId() {
		return iInsertionOrderId;
	}
	public void setIInsertionOrderId(int insertionOrderId) {
		iInsertionOrderId = insertionOrderId;
	}
	public int getITotalDuration() {
		return iTotalDuration;
	}
	public void setITotalDuration(int totalDuration) {
		iTotalDuration = totalDuration;
	}
	public String getSContactName() {
		return sContactName;
	}
	public void setSContactName(String contactName) {
		sContactName = contactName;
	}
	public String getSContantEmail() {
		return sContantEmail;
	}
	public void setSContantEmail(String contantEmail) {
		sContantEmail = contantEmail;
	}
	public String getSContantNo() {
		return sContantNo;
	}
	public void setSContantNo(String contantNo) {
		sContantNo = contantNo;
	}
	public String getSMerchantAdd() {
		return sMerchantAdd;
	}
	public void setSMerchantAdd(String merchantAdd) {
		sMerchantAdd = merchantAdd;
	}
	public String getSTotalCost() {
		return sTotalCost;
	}
	public void setSTotalCost(String totalCost) {
		sTotalCost = totalCost;
	}
	public InsertionOrderStatus getOStatus() {
		return oStatus;
	}
	public void setOStatus(InsertionOrderStatus status) {
		oStatus = status;
	}
	public Merchant getOMerchant() {
		return oMerchant;
	}
	public void setOMerchant(Merchant merchant) {
		oMerchant = merchant;
	}
	
	
}
