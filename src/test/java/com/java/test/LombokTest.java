package com.java.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.example.model.Person;
import com.java.example.model.User;

public class LombokTest {

	static final String NAME = "Sachin";

	@Test
	public void testAccessor() {
		User user = new User();
		user.setAge(10);
		user.setFirstName(NAME);
		user.setLastName("jois");

		assertEquals(NAME, user.getFirstName());
	}

	public void testBuilder() {
		Person person = Person.builder().name(NAME).build();
		assertEquals(NAME, person.getName());
	}

}
