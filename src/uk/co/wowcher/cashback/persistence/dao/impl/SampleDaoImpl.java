package uk.co.wowcher.cashback.persistence.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;


import uk.co.wowcher.cashback.domain.beans.Category;
import uk.co.wowcher.cashback.persistence.dao.SampleDao;


@Component("sampleDao")
public class SampleDaoImpl implements SampleDao{

	@Autowired
	HibernateTemplate hibernateTemplate;
	@Override
	public List<Category> addCategory(Category domainCategory) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		
		hibernateTemplate.saveOrUpdate(domainCategory);
		System.out.println("successfully inserted");
		
		List<Category> lstCategory = hibernateTemplate.loadAll(Category.class);
		return lstCategory;
	}

	

}
