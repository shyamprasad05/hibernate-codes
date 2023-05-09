package org.jpa.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		Employee e=new Employee();
		e.setId(1);
		e.setDesignation("manager");
		e.setName("vinay");
		e.setSalary(50000);
		e.setPassword("anc#1232");
		em.merge(e);
		et.begin();
		et.commit();


	}
	

}
