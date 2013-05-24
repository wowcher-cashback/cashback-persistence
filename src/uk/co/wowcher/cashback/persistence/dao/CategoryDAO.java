package uk.co.wowcher.cashback.persistence.dao;

import java.util.List;

import uk.co.wowcher.cashback.domain.beans.Category;
import uk.co.wowcher.cashback.domain.beans.Merchant;
import uk.co.wowcher.cashback.domain.beans.SubCategory;






public interface CategoryDAO {
	
	public void addCategory(Category category) throws Exception;

	public void addSubCategory(SubCategory subCategory) throws Exception;
	
        public boolean deleteCategory(int categoryId) throws Exception;
	
	public boolean deleteSubCategory(int subCategoryId) throws Exception;
	
	
	
	public Category getSubCategories(int categoryId ) throws Exception;
	
	public List<Category> getCategories()throws Exception;
	
	public List<Category> getMerchantCount() throws Exception;
	
	public List<Merchant> getMerchant(String id) throws Exception;
	
	
	
	

}
