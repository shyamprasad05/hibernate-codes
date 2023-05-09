package org.shyam;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
@SuppressWarnings("all")
public class GetAllPersons {
	public static void main(String[] args) {
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		String hql="select p from Person p";
		Query<Person> q=s.createQuery(hql);
		List<Person> ps=q.getResultList();
		for(Person p:ps) {
			System.out.println("ID: "+p.getId());
			System.out.println("Name "+p.getName());
			System.out.println("Placs: "+p.getPlace());
			System.out.println("state :"+p.getState());
			System.out.println("---------------------");
			
		}
	}

}
