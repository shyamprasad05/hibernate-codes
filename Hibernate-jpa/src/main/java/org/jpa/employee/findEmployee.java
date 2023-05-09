package org.jpa.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class findEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Employee e=em.find(Employee.class, 4);
		if(e!=null) {
			System.out.println("Id :"+e.getId());
			System.out.println("NAMe :"+e.getName());
			System.out.println("designation"+e.getDesignation());
			System.out.println("salary :"+e.getSalary());
		}else {
			System.err.println("invalid id");
		}
	}

}
