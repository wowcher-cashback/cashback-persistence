package uk.co.wowcher.cashback.persistence.domain;

public class ContentCreationForPlacements {
	private int iContentCreationForPlacementsId;
	private PremiumPlacementType oPremiumPlacementType;
	private Merchant oMerchant;
	private String sOfferImage;
	private String sOfferText;
	private String sUrl;
	private String sOfferTitle;
	private String sDescription;
	private Category oCategory;
	private SubCategory oSubCategory;
	public int getIContentCreationForPlacementsId() {
		return iContentCreationForPlacementsId;
	}
	public void setIContentCreationForPlacementsId(
			int contentCreationForPlacementsId) {
		iContentCreationForPlacementsId = contentCreationForPlacementsId;
	}
	public PremiumPlacementType getOPremiumPlacementType() {
		return oPremiumPlacementType;
	}
	public void setOPremiumPlacementType(PremiumPlacementType premiumPlacementType) {
		oPremiumPlacementType = premiumPlacementType;
	}
	public Merchant getOMerchant() {
		return oMerchant;
	}
	public void setOMerchant(Merchant merchant) {
		oMerchant = merchant;
	}
	public String getSOfferImage() {
		return sOfferImage;
	}
	public void setSOfferImage(String offerImage) {
		sOfferImage = offerImage;
	}
	public String getSOfferText() {
		return sOfferText;
	}
	public void setSOfferText(String offerText) {
		sOfferText = offerText;
	}
	public String getSUrl() {
		return sUrl;
	}
	public void setSUrl(String url) {
		sUrl = url;
	}
	public String getSOfferTitle() {
		return sOfferTitle;
	}
	public void setSOfferTitle(String offerTitle) {
		sOfferTitle = offerTitle;
	}
	public String getSDescription() {
		return sDescription;
	}
	public void setSDescription(String description) {
		sDescription = description;
	}
	public Category getOCategory() {
		return oCategory;
	}
	public void setOCategory(Category category) {
		oCategory = category;
	}
	public SubCategory getOSubCategory() {
		return oSubCategory;
	}
	public void setOSubCategory(SubCategory subCategory) {
		oSubCategory = subCategory;
	}
	
}
