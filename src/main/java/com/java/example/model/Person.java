package com.java.example.model;

import lombok.Builder;
import lombok.Getter;

@Builder(toBuilder=true)
@Getter
public class Person {
	String name;
	int age;
	int phoneNumber;
	char gender;
}
