package org.jpa.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
public class fetchemployeebyJPQLQuery {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		String qry="select q from Employee q where q.designation=?1";
		String qry1="select q from Employee q where q.id=?1";
		String qry2="select q from Employee q where q.name=?1";
		String qry3="select q from Employee q where q.id=?1 and q.password=?2";
		
		Query q=em.createQuery(qry3);
		q.setParameter(1, 1);
		q.setParameter(2, "anc#1232");
		List<Employee> li=q.getResultList();
		for(Employee e:li) {
			System.out.println("Id :"+e.getId());
			System.out.println("Name :"+e.getName());
			System.out.println("Designation :"+e.getDesignation());
			System.out.println("-----------");
			
		}
		
	}
}
