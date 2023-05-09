package org.jpa.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Employeesave {
	public static void main(String[] args) {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("dev");
		EntityManager em=factory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee e = new Employee();
		e.setId(2);
		e.setName("raja");
		e.setDesignation("jpa");
		e.setSalary(1313124232);
		e.setPassword("1323");
		
		em.persist(e);
		et.begin();
		et.commit();
	}

}
