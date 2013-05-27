package uk.co.wowcher.cashback.persistence.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;


import org.apache.log4j.Logger;
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

	protected static Logger logger = Logger.getLogger("MerchantDealDaoImpl");
	
	
	@Resource(name="sessionFactory")
	 private SessionFactory sessionFactory;
	
	
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
	
	/*public List<MerchantDeal> getMerchantDeals(Merchant merchant,String merchantDealType_name)
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
	}*/
	
	
	
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

	

	@Transactional
	public boolean addCashBackrateToMerchantDeal(MerchantDeal domainMerchantDeal) throws Exception 
	{
		List<MerchantDeal> lstMerchantdeals = new ArrayList<MerchantDeal>();
		try
		{
			CommissionGroup commissionGroupObj = new CommissionGroup();
			commissionGroupObj = domainMerchantDeal.getoCommissionGroup();
			logger.info(commissionGroupObj.getiCommissionGroupId());
		logger.info("domainMerchantDeal Obj---------------->"+domainMerchantDeal.getsDescription());
		System.out.println("getoMerchant()---------------------------------->"+domainMerchantDeal.getMerchant());
		if(sessionFactory.getCurrentSession() != null)
		{
			Session session = sessionFactory.getCurrentSession();
			 Criteria criteria = session.createCriteria(CommissionGroup.class);
			 List lstCommissionGroup = criteria.list();
			 if(lstCommissionGroup.size() == 0)
			 {
				 sessionFactory.getCurrentSession().saveOrUpdate(commissionGroupObj);
			 }
			logger.info("before add call in dao");
			sessionFactory.getCurrentSession().saveOrUpdate(domainMerchantDeal);
			sessionFactory.getCurrentSession().flush();
			
			criteria = session.createCriteria(MerchantDeal.class);
			lstMerchantdeals = criteria.list();
			logger.info("after add call in dao");
			logger.info("lstMerchantdeals from dao--->"+lstMerchantdeals);

		
		}

		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("Exception occured in addMerchantDeal()--->"+e.getMessage());
			return false;
		}
		return true;
	}
	
	
	@SuppressWarnings("unchecked")
	
	@Transactional
	public List<MerchantDeal> getMerchantDealList(Merchant merchant,String merchantDealType_name) throws Exception
	{
		 logger.info("merchant id from dao"+merchant.getiMerchantId());
		
		 logger.info("merchant merchantDealType_name from dao"+merchantDealType_name);
		 List<MerchantDeal> lstMerchantDeals = new ArrayList<MerchantDeal>();
		 try
		 {
		
		Session session = sessionFactory.getCurrentSession();
		
		  if(session != null)
		   {
			 	
		  Criteria criteria = session.createCriteria(MerchantDeal.class);
		  MerchantDealType merchantDealType = null;
		  Criteria dealTypecriteria = session.createCriteria(MerchantDealType.class);

		 dealTypecriteria.add(Restrictions.eq("sDealTypeName", merchantDealType_name));
		
		 merchantDealType = (MerchantDealType) dealTypecriteria.uniqueResult();
		 criteria.add(Restrictions.eq("oMerchant", merchant));
		criteria.add(Restrictions.eq("oMerchantDealType", merchantDealType));
		criteria.add(Restrictions.eq("bdeletedFlag", false));
		lstMerchantDeals = criteria.list();
		logger.info("lstMerchantDeals size"+lstMerchantDeals.size());
		   }
		 }
		  catch(Exception e)
			{
				e.printStackTrace();
				logger.error("Exception occured in getMerchantDealList()--->"+e.getMessage());
				throw new Exception("Exception occured in getMerchantDealList()--->"+e.getMessage());
			}
		  
		  return lstMerchantDeals;
		
	}
	
	
	public boolean deleteMerchantDeal(MerchantDeal merchantDeal) throws Exception
	{
		try{
			System.out.println("id..."+merchantDeal.getiMerchantDealId());
			MerchantDeal merchantDealUpdate = (MerchantDeal) sessionFactory.getCurrentSession().load(MerchantDeal.class, merchantDeal.getiMerchantDealId());
			System.out.println("merchantDealUpdate------------>"+merchantDealUpdate);
			merchantDealUpdate.setbDeleteFlag(true);
			merchantDealUpdate.setdDealDeletedDate(new Date());
			sessionFactory.getCurrentSession().update(merchantDealUpdate);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("Exception occured in deleteMerchantDeal()--->"+e.getMessage());
			throw new Exception("Exception occured in deleteMerchantDeal()--->"+e.getMessage());
		}
		return true;
	}

	


	
	
}





