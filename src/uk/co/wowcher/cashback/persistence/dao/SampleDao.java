package uk.co.wowcher.cashback.persistence.dao;

import java.util.List;

import uk.co.wowcher.cashback.domain.beans.Category;



public interface SampleDao {

	public List<Category> addCategory(Category domainCategory);

}
