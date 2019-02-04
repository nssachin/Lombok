package com.java.example;

import com.java.example.model.User;

public class LombokBasic {

	public static void main(String[] args) {

		User user = new User();
		user.setAge(20);
		user.setFirstName("Name");
		user.setLastName("last");

		System.out.println(user.toString());
	}

}
