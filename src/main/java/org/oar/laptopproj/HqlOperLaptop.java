package org.oar.laptopproj;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class HqlOperLaptop 
{
	public List<LaptopDto> getLaptopDetails() {
		
		Session session = LaptopSessionFactory.createSessionFactory().openSession();
		String hql="from LaptopDto";
		Query query = session.createQuery(hql);
		query.setCacheable(true);
		List<LaptopDto> list = query.list();
		return list;

		
	}

	public LaptopDto getLaptopDetailsByLid(String lid) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql="from LaptopDto where lid=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id",lid );
		LaptopDto uniqueResult = (LaptopDto) query.uniqueResult();
		return uniqueResult;
	}
	
	public void updateLaptopPriceById(String lid,Double lprice) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hql="update LaptopDto set lprice=:newPrice where lid=:lid";
		Query query = session.createQuery(hql);
		query.setParameter("newPrice", lprice);
		query.setParameter("lid", lid);
		int updateRows = query.executeUpdate();
		transaction.commit();
		if(updateRows == 0) {
			System.out.println("Update Operation Failed");
			return;
		}
		System.out.println("Update Operation successfull");
	}
	
	public void deleteById(String lid) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hql="delete LaptopDto where id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("lid", lid);
		int updateRows = query.executeUpdate();
		transaction.commit();
		if(updateRows == 0) {
			System.out.println("Delete Operation Failed");
			return;
		}
		System.out.println("Delete Operation successfull");
	}
}




