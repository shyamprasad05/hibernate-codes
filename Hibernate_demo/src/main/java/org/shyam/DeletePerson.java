package org.shyam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeletePerson {
	public static void main(String[] args) {
		Configuration cfg= new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		Person p=s.find(Person.class, 1);
		if(p!=null) {
			s.delete(p);
			t.commit();
		}else {
			System.out.println("record not found");
		}
	}

}
