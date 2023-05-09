package org.jpa.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveHospitalbranches {
	public static void main(String[] args) {
		Hospital h= new Hospital();
		h.setName("apollo");
		h.setFounder("abc");
		h.setGst("nwenf634r");
		
		Branches b1= new Branches();
		b1.setEmail("apolloo12@gmail.com");
		b1.setHospital(h);
		b1.setName("apollom");
		b1.setPhone(123124);
		
		Branches b2= new Branches();
		b2.setEmail("apollooC12@gmail.com");
		b2.setHospital(h);
		b2.setName("apolloc");
		b2.setPhone(12342124);
		
		Branches b3= new Branches();
		b3.setEmail("apollooc12@gmail.com");
		b3.setHospital(h);
		b3.setName("apolloc");
		b3.setPhone(122323124);
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		em.persist(h);
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		et.begin();et.commit();
		
	
	}

}
