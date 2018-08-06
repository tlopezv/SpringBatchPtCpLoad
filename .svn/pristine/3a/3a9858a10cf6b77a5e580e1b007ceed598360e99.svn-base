package com.rci.ptcp.springbatch.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HibernateSessionFactory {

 @Autowired
 SessionFactory sessionFactory;
	
	public Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		
		if (session == null) {
			session = sessionFactory.openSession();
		} 
		
		return session;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
}
