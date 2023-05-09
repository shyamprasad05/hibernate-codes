package org.jpa.onetoone_Bi_directional;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveperson {
	public static void main(String[] args) {
		Person p= new Person();
		p.setName("rakesh");
		p.setPhone(78798273);
		p.setPlace("srikalahasti");
		Pancard pan=new Pancard();
		pan.setCountry("india");
		pan.setDob(LocalDate.parse("1999-02-23"));
		pan.setNumber("fdopp89342p");
		pan.setPerson(p);
		p.setPan(pan);
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		em.persist(p);
		em.persist(pan);
		et.begin();
		et.commit();
	}

}
