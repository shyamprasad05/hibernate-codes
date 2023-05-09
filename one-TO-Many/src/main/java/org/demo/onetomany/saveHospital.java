package org.demo.onetomany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveHospital {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Hospital h= new Hospital();
		h.setFounder("xyz");
		h.setGst("appolo123");
		h.setName("apollo");
		
		Branches b1=new Branches();
		b1.setEmail("appolloB@gmail.com");
		b1.setName("ApolloB");
		b1.setPhone(1232);
		
		Branches b2=new Branches();
		b2.setEmail("appolloM@gmail.com");
		b2.setName("ApolloM");
		b2.setPhone(1232);
		
		Branches b3=new Branches();
		b3.setEmail("appolloM@gmail.com");
		b3.setName("ApolloM");
		b3.setPhone(123232);
		
		Branches b4=new Branches();
		b4.setEmail("appolloH@gmail.com");
		b4.setName("ApolloH");
		b4.setPhone(123132);
		
		List<Branches> li = new ArrayList<Branches>(Arrays.asList(b1,b2,b3,b4)) ;
		h.setBranch(li);
		
		
		em.persist(h);
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		em.persist(b4);
		et.begin();
		et.commit();
	}

}
