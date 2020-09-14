package org.oar.laptopproj;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGeneratorId implements IdentifierGenerator 
{

	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
		 String val="Asus"+"00S145"+((int)(Math.random()*9000)+1000);
		return val;
	}
	

}
