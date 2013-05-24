package uk.co.wowcher.cashback.domain.beans;

import java.util.Date;



public class MerchantDeal {

	private Integer iMerchantDealId;
	private MerchantDealType oMerchantDealType;
	private String sDescription;
	private String sMerchantDealUrl;
	private Boolean bIsExclusive;
	private Float fCashBackRate;
	private RateType oCashBackRateType;
	private String sOfferTitle;
	private Boolean bIsWithCashBack;
	private Boolean bIsPrintable;
	private String sVoucherCode;
	private Date dValidFrom;
	private Date dValidTo;
	private Integer iProductId;
	private String sProductImageUrl;
	private Merchant_Deal_SubCategory_Assoc oMerchantDealSubCategoryAssoc;
	private Money oPrice;
	private Boolean bToShow;
	private Date dDealDeletedDate;
	private Boolean bDeleteFlag;
	private Merchant merchant;
	private String sTerms;
	private CommissionGroup oCommissionGroup;
	public Integer getiMerchantDealId() {
		return iMerchantDealId;
	}
	public void setiMerchantDealId(Integer iMerchantDealId) {
		this.iMerchantDealId = iMerchantDealId;
	}
	public MerchantDealType getoMerchantDealType() {
		return oMerchantDealType;
	}
	public void setoMerchantDealType(MerchantDealType oMerchantDealType) {
		this.oMerchantDealType = oMerchantDealType;
	}
	public String getsDescription() {
		return sDescription;
	}
	public void setsDescription(String sDescription) {
		this.sDescription = sDescription;
	}
	public String getsMerchantDealUrl() {
		return sMerchantDealUrl;
	}
	public void setsMerchantDealUrl(String sMerchantDealUrl) {
		this.sMerchantDealUrl = sMerchantDealUrl;
	}
	public Boolean isbIsExclusive() {
		return bIsExclusive;
	}
	public void setbIsExclusive(Boolean bIsExclusive) {
		this.bIsExclusive = bIsExclusive;
	}
	public Merchant_Deal_SubCategory_Assoc getoMerchantDealSubCategoryAssoc() {
		return oMerchantDealSubCategoryAssoc;
	}
	public void setoMerchantDealSubCategoryAssoc(
			Merchant_Deal_SubCategory_Assoc oMerchantDealSubCategoryAssoc) {
		this.oMerchantDealSubCategoryAssoc = oMerchantDealSubCategoryAssoc;
	}
	public Money getoPrice() {
		return oPrice;
	}
	public void setoPrice(Money oPrice) {
		this.oPrice = oPrice;
	}
	public Boolean getbIsExclusive() {
		return bIsExclusive;
	}
	public Boolean getbIsWithCashBack() {
		return bIsWithCashBack;
	}
	public Boolean getbIsPrintable() {
		return bIsPrintable;
	}
	public Boolean getbToShow() {
		return bToShow;
	}
	public Boolean getbDeleteFlag() {
		return bDeleteFlag;
	}
	public Float getfCashBackRate() {
		return fCashBackRate;
	}
	public void setfCashBackRate(Float fCashBackRate) {
		this.fCashBackRate = fCashBackRate;
	}
	public RateType getoCashBackRateType() {
		return oCashBackRateType;
	}
	public void setoCashBackRateType(RateType oCashBackRateType) {
		this.oCashBackRateType = oCashBackRateType;
	}
	public String getsOfferTitle() {
		return sOfferTitle;
	}
	public void setsOfferTitle(String sOfferTitle) {
		this.sOfferTitle = sOfferTitle;
	}
	public Boolean isbIsWithCashBack() {
		return bIsWithCashBack;
	}
	public void setbIsWithCashBack(Boolean bIsWithCashBack) {
		this.bIsWithCashBack = bIsWithCashBack;
	}
	public Boolean isbIsPrintable() {
		return bIsPrintable;
	}
	public void setbIsPrintable(Boolean bIsPrintable) {
		this.bIsPrintable = bIsPrintable;
	}
	public String getsVoucherCode() {
		return sVoucherCode;
	}
	public void setsVoucherCode(String sVoucherCode) {
		this.sVoucherCode = sVoucherCode;
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
	public Integer getiProductId() {
		return iProductId;
	}
	public void setiProductId(Integer iProductId) {
		this.iProductId = iProductId;
	}
	public String getsProductImageUrl() {
		return sProductImageUrl;
	}
	public void setsProductImageUrl(String sProductImageUrl) {
		this.sProductImageUrl = sProductImageUrl;
	}
	public Boolean isbToShow() {
		return bToShow;
	}
	public void setbToShow(Boolean bToShow) {
		this.bToShow = bToShow;
	}
	public Date getdDealDeletedDate() {
		return dDealDeletedDate;
	}
	public void setdDealDeletedDate(Date dDealDeletedDate) {
		this.dDealDeletedDate = dDealDeletedDate;
	}
	public Boolean isbDeleteFlag() {
		return bDeleteFlag;
	}
	public void setbDeleteFlag(Boolean bDeleteFlag) {
		this.bDeleteFlag = bDeleteFlag;
	}
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	public String getsTerms() {
		return sTerms;
	}
	public void setsTerms(String sTerms) {
		this.sTerms = sTerms;
	}
	public CommissionGroup getoCommissionGroup() {
		return oCommissionGroup;
	}
	public void setoCommissionGroup(CommissionGroup oCommissionGroup) {
		this.oCommissionGroup = oCommissionGroup;
	}
	
	
}
