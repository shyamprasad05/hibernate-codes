package org.shyam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Updateperson {
	public static void main(String[] args) {
		Person p=new Person();
		p.setId(1);
		p.setName("Rakesh");
		p.setPlace("nagari");
		p.setState("Ap");
		Configuration cfg =new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t= s.beginTransaction();
		s.update(p);
		t.commit();
		
	}

}
