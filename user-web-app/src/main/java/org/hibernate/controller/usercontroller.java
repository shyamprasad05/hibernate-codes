package org.hibernate.controller;

import org.hibernate.dao.userdao;
import org.hibernate.dto.user;

public class usercontroller {
	public static void main(String[] args) {
		user u=new user();
		u.setName("shyam");
		u.setPhone(69269296);
		u.setEmail("vcewuv@gmail.com");
		u.setPassword("hello");
		userdao ud=new userdao();
		ud.saveuser(u);
	}

}
