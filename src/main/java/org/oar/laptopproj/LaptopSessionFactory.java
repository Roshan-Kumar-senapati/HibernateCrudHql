package org.oar.laptopproj;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LaptopSessionFactory {
	private static SessionFactory sessionFactory=null;

	private LaptopSessionFactory() {
	}
	public static SessionFactory createSessionFactory()
	{
		if(sessionFactory ==null)
			sessionFactory=new Configuration().configure().buildSessionFactory();
		return sessionFactory;
	}
	
	

}
