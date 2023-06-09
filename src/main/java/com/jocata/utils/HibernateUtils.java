package com.jocata.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.jocata.entity.Employee;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			try {
				Configuration  configuration = new Configuration();				
				configuration.addAnnotatedClass(Employee.class);
				ServiceRegistry serviceRegistry =new StandardServiceRegistryBuilder().
						                        applySettings(configuration.getProperties()).build();
				
				sessionFactory=configuration.buildSessionFactory(serviceRegistry);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return sessionFactory;
	}
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}
