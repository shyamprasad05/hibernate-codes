package org.jpa.controller;

import org.jpa.dao.Userdao;
import org.jpa.dto.User;

public class Usercontroller {
	public static void main(String[] args) {
		User u = new User();
		u.setEmail("Sanvier@g,=mail.com");
		u.setName("abc");
		u.setPassword("bjeb");
		u.setPhone(7687686);
		Userdao udao=new Userdao();
		u=udao.saveUser(u);
		System.out.println("data is saved"+u.getId());
		
	}

}
