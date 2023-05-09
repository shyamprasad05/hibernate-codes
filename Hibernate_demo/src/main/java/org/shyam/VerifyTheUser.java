package org.shyam;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class VerifyTheUser {
	public static void main(String[] args) {
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		String qry="select u from user u where u.phoneno=?1 and u.password=?2";
		Query<user> q=s.createQuery(qry);
		q.setParameter(1,123456);
		q.setParameter(2, "1234");
		List<user> li=q.getResultList();
		if(li.size()>0) {
			user u=li.get(0);
			System.out.println(u.getId());
			System.out.println(u.getName());
			System.out.println(u.getPhoneno());
		}else {
			System.out.println("not found");
		}
	}

}
