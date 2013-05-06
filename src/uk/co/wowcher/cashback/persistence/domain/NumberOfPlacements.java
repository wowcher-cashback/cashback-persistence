package uk.co.wowcher.cashback.persistence.domain;

public class NumberOfPlacements {
	private int iNumberOfPlacementsID;
	private String sNumberOfPlacementsCode;
	private String sNumberOfPlacementsName;
	private String sNumberOfPlacementsDescription;
	public int getINumberOfPlacementsID() {
		return iNumberOfPlacementsID;
	}
	public void setINumberOfPlacementsID(int numberOfPlacementsID) {
		iNumberOfPlacementsID = numberOfPlacementsID;
	}
	public String getSNumberOfPlacementsCode() {
		return sNumberOfPlacementsCode;
	}
	public void setSNumberOfPlacementsCode(String numberOfPlacementsCode) {
		sNumberOfPlacementsCode = numberOfPlacementsCode;
	}
	public String getSNumberOfPlacementsName() {
		return sNumberOfPlacementsName;
	}
	public void setSNumberOfPlacementsName(String numberOfPlacementsName) {
		sNumberOfPlacementsName = numberOfPlacementsName;
	}
	public String getSNumberOfPlacementsDescription() {
		return sNumberOfPlacementsDescription;
	}
	public void setSNumberOfPlacementsDescription(
			String numberOfPlacementsDescription) {
		sNumberOfPlacementsDescription = numberOfPlacementsDescription;
	}
	
}
