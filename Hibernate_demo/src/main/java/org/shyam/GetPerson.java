package org.shyam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetPerson {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure();
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Person p=s.find(Person.class, 9);
		if(p!=null) {
			System.out.println("Id: "+p.getId());
			System.out.println("name: "+p.getName());
			System.out.println("place: "+p.getPlace());
			System.out.println("state: "+p.getState());
			
			
		}else {
			System.err.println("record not found");
		}
		
	}

}
