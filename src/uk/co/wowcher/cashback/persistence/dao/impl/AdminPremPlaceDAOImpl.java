package uk.co.wowcher.cashback.persistence.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import uk.co.wowcher.cashback.domain.beans.PremiumPlacementType;
import uk.co.wowcher.cashback.persistence.dao.AdminPremPlaceDAO;

@Component("adminPremPlaceDAO")
@Transactional
public class AdminPremPlaceDAOImpl implements AdminPremPlaceDAO{

	@Autowired
	SessionFactory mySessionFactory;
	
	public List<PremiumPlacementType> getPremPlaceList()
	{
		Session session = mySessionFactory.getCurrentSession();
		
		Criteria criteria = session.createCriteria(PremiumPlacementType.class);
		
		List<PremiumPlacementType> lstPlacementTypes = criteria.list();
		
		System.out.println("session"+session);
		return lstPlacementTypes;
	}
	
}
