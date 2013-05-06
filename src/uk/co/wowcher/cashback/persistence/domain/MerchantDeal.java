package uk.co.wowcher.cashback.persistence.domain;

import java.util.Date;

public class MerchantDeal {
	private int iMerchantDealId;
	private MerchantDealType oMerchantDealType;
	private String sDescription;
	private String sMerchantUrl;
	private boolean bIsExclusive;
	private float fCashBackRate;
	private RateType oCashBackRateType;
	private String sOfferTitle;
	private boolean bIsWithCashBack;
	private boolean bIsPrintable;
	private String sVoucherCode;
	private Date dValidFrom;
	private Date dValidTo;
	private int iProductId;
	private String sProductImageUrl;
	private Merchant_Deal_SubCategory_Assoc oMerchantDealSubCategoryAssoc;
	private Money oPrice;
	private boolean bToShow;
	private Date dDealDeletedDate;
	public int getIMerchantDealId() {
		return iMerchantDealId;
	}
	public void setIMerchantDealId(int merchantDealId) {
		iMerchantDealId = merchantDealId;
	}
	public MerchantDealType getOMerchantDealType() {
		return oMerchantDealType;
	}
	public void setOMerchantDealType(MerchantDealType merchantDealType) {
		oMerchantDealType = merchantDealType;
	}
	public String getSDescription() {
		return sDescription;
	}
	public void setSDescription(String description) {
		sDescription = description;
	}
	public String getSMerchantUrl() {
		return sMerchantUrl;
	}
	public void setSMerchantUrl(String merchantUrl) {
		sMerchantUrl = merchantUrl;
	}
	public boolean isBIsExclusive() {
		return bIsExclusive;
	}
	public void setBIsExclusive(boolean isExclusive) {
		bIsExclusive = isExclusive;
	}
	public float getFCashBackRate() {
		return fCashBackRate;
	}
	public void setFCashBackRate(float cashBackRate) {
		fCashBackRate = cashBackRate;
	}
	public RateType getOCashBackRateType() {
		return oCashBackRateType;
	}
	public void setOCashBackRateType(RateType cashBackRateType) {
		oCashBackRateType = cashBackRateType;
	}
	public String getSOfferTitle() {
		return sOfferTitle;
	}
	public void setSOfferTitle(String offerTitle) {
		sOfferTitle = offerTitle;
	}
	public boolean isBIsWithCashBack() {
		return bIsWithCashBack;
	}
	public void setBIsWithCashBack(boolean isWithCashBack) {
		bIsWithCashBack = isWithCashBack;
	}
	public boolean isBIsPrintable() {
		return bIsPrintable;
	}
	public void setBIsPrintable(boolean isPrintable) {
		bIsPrintable = isPrintable;
	}
	public String getSVoucherCode() {
		return sVoucherCode;
	}
	public void setSVoucherCode(String voucherCode) {
		sVoucherCode = voucherCode;
	}
	public Date getDValidFrom() {
		return dValidFrom;
	}
	public void setDValidFrom(Date validFrom) {
		dValidFrom = validFrom;
	}
	public Date getDValidTo() {
		return dValidTo;
	}
	public void setDValidTo(Date validTo) {
		dValidTo = validTo;
	}
	public int getIProductId() {
		return iProductId;
	}
	public void setIProductId(int productId) {
		iProductId = productId;
	}
	public String getSProductImageUrl() {
		return sProductImageUrl;
	}
	public void setSProductImageUrl(String productImageUrl) {
		sProductImageUrl = productImageUrl;
	}
	public Merchant_Deal_SubCategory_Assoc getOMerchantDealSubCategoryAssoc() {
		return oMerchantDealSubCategoryAssoc;
	}
	public void setOMerchantDealSubCategoryAssoc(
			Merchant_Deal_SubCategory_Assoc merchantDealSubCategoryAssoc) {
		oMerchantDealSubCategoryAssoc = merchantDealSubCategoryAssoc;
	}
	public Money getOPrice() {
		return oPrice;
	}
	public void setOPrice(Money price) {
		oPrice = price;
	}
	public boolean isBToShow() {
		return bToShow;
	}
	public void setBToShow(boolean toShow) {
		bToShow = toShow;
	}
	public Date getDDealDeletedDate() {
		return dDealDeletedDate;
	}
	public void setDDealDeletedDate(Date dealDeletedDate) {
		dDealDeletedDate = dealDeletedDate;
	}
	
}
