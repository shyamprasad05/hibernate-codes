package org.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jpa.dto.User;

public class Userdao {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
	EntityManager em= emf.createEntityManager();
	public User saveUser(User user) {
		EntityTransaction et= em.getTransaction();
		em.persist(user);
		et.begin();et.commit();
		return user;
		
	}
	public User mergeUser(int id) {
		EntityTransaction et= em.getTransaction();
		User u= em.find(User.class, id);
		em.merge(u);
		et.begin();et.commit();
		return u;
	}
	public boolean deleteUser(int id) {
		EntityTransaction et= em.getTransaction();
		User u= em.find(User.class, id);
		em.remove(u);
		et.begin();et.commit();
		if(u!=null) {
			return true;
		}
		return false;
	}
	public User findUserById(int id) {
		return em.find(User.class, id);
	}
	public List<User>findAllUsers(){
		Query q=em.createQuery("select u from User u");
		return q.getResultList();
	}
	public User verifyuser(long phone,String password) {
		Query q=em.createQuery("select u from User u where u.phone=?1 and u.password=?2");
		q.setParameter(1, phone);
		q.setParameter(2, password);
		List<User> li= q.getResultList();
		if(li.size()>0) {
			return li.get(0);
		}
		return null;
	}

}
