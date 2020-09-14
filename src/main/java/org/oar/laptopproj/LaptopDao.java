package org.oar.laptopproj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LaptopDao
{
	public void saveLaptopDetails(LaptopDto laptopDto) 
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(laptopDto);
		transaction.commit();
	}
	
	public LaptopDto getLaptopDetailsById(String id)
	{
		Session session=LaptopSessionFactory.createSessionFactory().openSession();
		return session.get(LaptopDto.class, id);
	}
	
	public void updateLaptopDetailsById(String id, Double lprice) {
		LaptopDto laptopDto = getLaptopDetailsById(id);
		if(laptopDto != null) {
			Configuration configuration = new Configuration();
			configuration.configure();
		    //configuration.addAnnotatedClass(LaptopDto.class);
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			laptopDto.setLprice(lprice);
			session.update(laptopDto);
			transaction.commit();
		}else {
			System.out.println("Laptop Price Update failed");
		}
	
	}
	
	public void deleteLaptopDetails(LaptopDto laptopDto)
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(LaptopDto.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.delete(laptopDto);
		transaction.commit();
		
	}


}
