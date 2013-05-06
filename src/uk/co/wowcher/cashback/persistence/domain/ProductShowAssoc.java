package uk.co.wowcher.cashback.persistence.domain;

import java.util.Date;

public class ProductShowAssoc {
	private int iProductShowAssocId;
	private MerchantDeal oProduct;
	private boolean bToShow;
	private Date dShowOrNoShowDate;
	public int getIProductShowAssocId() {
		return iProductShowAssocId;
	}
	public void setIProductShowAssocId(int productShowAssocId) {
		iProductShowAssocId = productShowAssocId;
	}
	public MerchantDeal getOProduct() {
		return oProduct;
	}
	public void setOProduct(MerchantDeal product) {
		oProduct = product;
	}
	public boolean isBToShow() {
		return bToShow;
	}
	public void setBToShow(boolean toShow) {
		bToShow = toShow;
	}
	public Date getDShowOrNoShowDate() {
		return dShowOrNoShowDate;
	}
	public void setDShowOrNoShowDate(Date showOrNoShowDate) {
		dShowOrNoShowDate = showOrNoShowDate;
	}
	
}
