package uk.co.wowcher.cashback.persistence.dao.impl;

import java.util.Date;
import java.util.Iterator;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uk.co.wowcher.cashback.domain.beans.CommissionGroup;
import uk.co.wowcher.cashback.domain.beans.Merchant;
import uk.co.wowcher.cashback.domain.beans.MerchantDeal;
import uk.co.wowcher.cashback.domain.beans.MerchantDealType;
import uk.co.wowcher.cashback.persistence.dao.MerchantDealDao;

@Component("merchantDealDao")
@Transactional
public class MerchantDealDaoImpl implements MerchantDealDao {


	@Autowired
	SessionFactory mySessionFactory;
	Session session = null;
	
	HibernateTemplate hibernateTemplate;
	
	public boolean addMerchantDeal(MerchantDeal merchantDeal) {
		try{
			
			session = mySessionFactory.getCurrentSession();
			CommissionGroup group = null;
			Criteria criteria = session.createCriteria(CommissionGroup.class);
			criteria.add(Expression.le("dValidFrom", merchantDeal.getdValidFrom()));
			criteria.add(Expression.ge("dValidTo", merchantDeal.getdValidTo()));
			if(merchantDeal.getoCommissionGroup().getsCommissionGroupCode()==null || "".equals(merchantDeal.getoCommissionGroup().getsCommissionGroupCode()))
			{
				criteria.addOrder(Order.desc("fCommissionGroupRate"));
				group = (CommissionGroup)criteria.list().get(0);
				merchantDeal.setoCommissionGroup(group);
			}
			System.out.println(group.getoCommissionGroupRateType());
			merchantDeal.setoCashBackRateType(group.getoCommissionGroupRateType());
			session.saveOrUpdate(merchantDeal);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Message------->"+e.getMessage());
			return false;
		}
		
		return true;
	}
	
	public List<MerchantDeal> getMerchantDeals(Merchant merchant,String merchantDealType_name)
	{
		session = mySessionFactory.getCurrentSession();
		
		Criteria criteria = session.createCriteria(MerchantDeal.class);
		MerchantDealType merchantDealType = null;
		Criteria dealTypecriteria = session.createCriteria(MerchantDealType.class);
		dealTypecriteria.add(Restrictions.eq("sDealTypeName", merchantDealType_name));
		merchantDealType = (MerchantDealType) dealTypecriteria.uniqueResult();
		criteria.add(Restrictions.eq("merchant", merchant));
		criteria.add(Restrictions.eq("oMerchantDealType", merchantDealType));
		criteria.add(Restrictions.eq("bDeleteFlag", false));
		List<MerchantDeal> lstMerchantDeals = criteria.list();
		return lstMerchantDeals;
	}
	
	public boolean deleteMerchantDeal(MerchantDeal merchantDeal)
	{
		try{
			session = mySessionFactory.getCurrentSession();
			MerchantDeal merchantDealUpdate = (MerchantDeal) session.get(MerchantDeal.class, merchantDeal.getiMerchantDealId());
			merchantDealUpdate.setbDeleteFlag(merchantDeal.isbDeleteFlag());
			merchantDealUpdate.setdDealDeletedDate(new Date());
			session.saveOrUpdate(merchantDealUpdate);
		}
		catch(Exception exception)
		{
			return false;
		}
		return true;
	}
	
	public MerchantDeal getMerchantDeal(int merchantDealId)
	{
		MerchantDeal merchantDeal = null;
		
		try{
			
			session = mySessionFactory.getCurrentSession();
			
			merchantDeal = (MerchantDeal) session.get(MerchantDeal.class,merchantDealId);
			
			
		}
		catch(Exception e)
		{
			
		}
		
		return merchantDeal;
	}

}
