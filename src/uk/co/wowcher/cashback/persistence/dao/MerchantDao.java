package uk.co.wowcher.cashback.persistence.dao;

import java.util.List;

import uk.co.wowcher.cashback.domain.beans.Merchant;
import uk.co.wowcher.cashback.domain.beans.MerchantDeal;




public interface MerchantDao {

		
		public List<Merchant> addMerchant(Merchant domainMerchant) throws Exception;
		public List<Merchant> getMerchantList(String merchantName,String sortBy,String sortOrder) throws Exception;
		public void deleteMerchant(List<Integer> merchantId) throws Exception;
	


}
