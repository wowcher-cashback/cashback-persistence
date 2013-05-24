package uk.co.wowcher.cashback.persistence.dao;

import java.util.List;

import uk.co.wowcher.cashback.domain.beans.Merchant;
import uk.co.wowcher.cashback.domain.beans.MerchantDeal;

public interface MerchantDealDao {

	public boolean addMerchantDeal(MerchantDeal merchantDeal);
	
	public List<MerchantDeal> getMerchantDeals(Merchant merchant,String merchantDealType_name);
	
	public boolean deleteMerchantDeal(MerchantDeal merchantDeal);
	
	public MerchantDeal getMerchantDeal(int merchantDealId);
}
