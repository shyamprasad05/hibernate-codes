package org.shyam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class saveperson {
	public static void main(String[] args) {
		Person p=new Person();
		p.setId(2);
		p.setName("shyam");
		p.setPlace("srikalahasti");
		p.setState("AP");
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(p);
		t.commit();
		
		
	}

}
