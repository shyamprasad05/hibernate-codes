package org.shyam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecord {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Person p=new Person();
		p.setId(3);
		p.setName("kalakeya");
		p.setPlace("newyork");
		p.setState("usa");
		s.saveOrUpdate(p);
		t.commit();
	}


} 
