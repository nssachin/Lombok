package com.java.example;

import com.java.example.model.User;

public class LombokBasic {

	public static void main(String[] args) {

		// 1. Pojo getter, Setter
		User user = new User();
		user.setAge(20);
		user.setFirstName("Sachin");
		user.setLastName("NS");
		System.out.println(user.toString());
		StringUtils.line();
		
	}

}

abstract class StringUtils {
	static void line() {
		System.out.println("=================================================");
	}
}
