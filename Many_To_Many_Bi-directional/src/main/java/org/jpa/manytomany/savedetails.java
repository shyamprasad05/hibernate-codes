package org.jpa.manytomany;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class savedetails {
	public static void main(String[] args) {
		Student s1= new Student();
		s1.setName("abc");
		s1.setPhone(67868768);
		
		Student s2= new Student();
		s2.setName("abcd");
		s2.setPhone(32131);
		
		Student s3= new Student();
		s3.setName("jfbrei");
		s3.setPhone(54632547);
		
		
		Courses c1= new Courses();
		c1.setDuration(56);
		c1.setSubject("java");
		
		Courses c2= new Courses();
		c2.setDuration(89);
		c2.setSubject("j2ee");
		
		Courses c3=new Courses();
		c3.setDuration(90);
		c3.setSubject("framework");
		
		s1.setCourses(new ArrayList<Courses>(Arrays.asList(c1,c2,c3)));
		s1.setCourses(new ArrayList<Courses>(Arrays.asList(c1,c3)));
		s1.setCourses(new ArrayList<Courses>(Arrays.asList(c1,c2)));
		c1.setStudent(new ArrayList<Student>(Arrays.asList(s1,s2)));
		c2.setStudent(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		c3.setStudent(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		et.begin();
		et.commit();
		
		
	}
}
