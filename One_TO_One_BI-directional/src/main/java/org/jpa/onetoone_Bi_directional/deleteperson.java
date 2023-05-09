package org.jpa.onetoone_Bi_directional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class deleteperson {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		Person p=em.find(Person.class, 3);
		Pancard pan=em.find(Pancard.class, 3);
				em.remove(pan);
				em.remove(p);
				et.begin();
				et.commit();

		
	}

}
