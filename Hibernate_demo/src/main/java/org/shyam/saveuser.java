package org.shyam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class saveuser {
	public static void main(String[] args) {
		user u = new user();
		u.setId(1);
		u.setName("ntr");
		u.setPassword("23232f");
		u.setPhoneno(23244242);
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(u);
		t.commit();
	}

}
