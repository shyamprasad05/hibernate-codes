package org.jpa.bidirectional_onetomany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class savehospital {
	public static void main(String[] args) {
		
		
		Hospital h1=new Hospital();
		h1.setGst("guieguih947");
		h1.setName("xnfu");
		h1.setFounder("fuici4");
		
		
		Branchs b1,b2,b3;
		b1=new Branchs();
		b1.setEmail("abc@gmail.com");
		b1.setName("abd");
		b1.setPhone(13231);
		b1.setHospital(h1);
		
		b2=new Branchs();
		b2.setEmail("abcd@gmail.com");
		b2.setName("abdd");
		b2.setPhone(13243231);
		b2.setHospital(h1);

		b3=new Branchs();
		b3.setEmail("abcde@gmail.com");
		b3.setName("abcde");
		b3.setPhone(1323187768);
		b3.setHospital(h1);
		
		h1.setBranch(new ArrayList<Branchs>(Arrays.asList(b1,b2,b3)));
		
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		em.persist(h1);
		et.begin();
		et.commit();

		
	}
	
}
