package uk.co.wowcher.cashback.persistence.dao;

import java.util.List;

import uk.co.wowcher.cashback.domain.beans.PremiumPlacementType;

public interface AdminPremPlaceDAO {

	public List<PremiumPlacementType> getPremPlaceList();
}
