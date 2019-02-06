package com.java.example;

import com.java.example.model.Person;
import com.java.example.model.User;

import lombok.extern.java.Log;

@Log
public class LombokBasic {

	public static void main(String[] args) {

		// 1. Pojo getter, Setter
		User user = new User();
		user.setAge(20);
		user.setFirstName("Sachin");
		user.setLastName("NS");
		log.info(user.toString());
		StringUtils.line();

		// 2. Builder class annotation
		Person person = Person.builder().age(10)
							.gender('F').name("Monali")
							.build();
		log.info(person.toBuilder().toString());
		log.info("Person Name is " + person.getName());
		log.info("Age is "+ person.getAge());
		log.info("Phone No. is "+ person.getPhoneNumber());
		StringUtils.line();
	}

}

abstract class StringUtils {
	static void line() {
		System.out.println("=================================================");
	}
}
