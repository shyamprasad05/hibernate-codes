package org.jpa.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class fetchbystudentid {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		String qry= "select s from student s where s.Courses.id=?1";
		Query q= em.createQuery(qry);
		
	}

}
