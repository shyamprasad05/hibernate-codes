package org.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.dto.user;

public class userdao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	public void saveuser(user u) {
		EntityTransaction et=em.getTransaction();
		em.persist(u);
		et.begin();
		et.commit();
	}

}
