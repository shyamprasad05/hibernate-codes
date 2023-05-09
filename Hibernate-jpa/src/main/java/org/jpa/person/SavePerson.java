package org.jpa.person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		Person p=new Person();
		p.setAge(22);
		p.setName("rakesh");
		p.setPhone(12214);
		em.persist(p);
		et.begin();
		et.commit();
	}

}
