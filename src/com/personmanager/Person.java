package com.personmanager;

import java.util.Objects;

/**
 * Represents a Person with id, name, and age. 
 * Author: Aadarsh Patil
 */
public class Person {
	private int id; // Unique identifier for the person
	private String name; // Name of the person
	private int age; // Age of the person

	/**
	 * Constructor to initialize Person object.
	 * 
	 * @param id   Unique identifier
	 * @param name Name of the person
	 * @param age  Age of the person
	 */
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// Getter for id
	public int getId() {
		return id;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Getter for age
	public int getAge() {
		return age;
	}

	// Overriding equals method to compare persons by id
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Person person = (Person) o;
		return id == person.id;
	}

	// Overriding hashCode method to generate hash based on id
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	// Overriding toString method to provide string representation of Person object
	@Override
	public String toString() {
		return "Person{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
	}
}
