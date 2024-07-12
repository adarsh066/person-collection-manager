package com.personmanager;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Utility class for performing set operations on Person objects. 
 * Author: Aadarsh Patil
 */
public class SetUtility {

	public static void main(String[] args) {
		Set<Person> hashSet = new HashSet<>(); // Creating HashSet for Person objects
		Set<Person> linkedHashSet = new LinkedHashSet<>(); // Creating LinkedHashSet for Person objects

		// Creating Person objects
		Person person1 = new Person(1, "Alice", 30);
		Person person2 = new Person(2, "Bob", 25);
		Person person3 = new Person(3, "Charlie", 35);
		Person person4 = new Person(1, "Alice", 30); // Duplicate Person

		// Adding Person objects to HashSet
		addPerson(hashSet, person1);
		addPerson(hashSet, person2);
		addPerson(hashSet, person3);
		addPerson(hashSet, person4);

		// Adding Person objects to LinkedHashSet
		addPerson(linkedHashSet, person1);
		addPerson(linkedHashSet, person2);
		addPerson(linkedHashSet, person3);
		addPerson(linkedHashSet, person4);

		// Printing the contents of the sets
		System.out.println("HashSet: " + hashSet);
		System.out.println("LinkedHashSet: " + linkedHashSet);

		// Performing union, intersection, and difference operations on sets
		Set<Person> unionSet = union(hashSet, linkedHashSet);
		Set<Person> intersectionSet = intersection(hashSet, linkedHashSet);
		Set<Person> differenceSet1 = difference(hashSet, linkedHashSet);
		Set<Person> differenceSet2 = difference(linkedHashSet, hashSet);

		// Printing the results of set operations
		System.out.println("Union: " + unionSet);
		System.out.println("Intersection: " + intersectionSet);
		System.out.println("Difference (HashSet - LinkedHashSet): " + differenceSet1);
		System.out.println("Difference (LinkedHashSet - HashSet): " + differenceSet2);
	}

	/**
	 * Adds a Person object to a set.
	 * 
	 * @param set    Set of Person objects
	 * @param person Person object to add
	 */
	private static void addPerson(Set<Person> set, Person person) {
		set.add(person);
	}

	/**
	 * Performs the union of two sets.
	 * 
	 * @param set1 First set
	 * @param set2 Second set
	 * @return Union of set1 and set2
	 */
	private static Set<Person> union(Set<Person> set1, Set<Person> set2) {
		Set<Person> resultSet = new HashSet<>(set1);
		resultSet.addAll(set2);
		return resultSet;
	}

	/**
	 * Performs the intersection of two sets.
	 * 
	 * @param set1 First set
	 * @param set2 Second set
	 * @return Intersection of set1 and set2
	 */
	private static Set<Person> intersection(Set<Person> set1, Set<Person> set2) {
		Set<Person> resultSet = new HashSet<>(set1);
		resultSet.retainAll(set2);
		return resultSet;
	}

	/**
	 * Performs the difference of two sets.
	 * 
	 * @param set1 First set
	 * @param set2 Second set
	 * @return Difference of set1 and set2
	 */
	private static Set<Person> difference(Set<Person> set1, Set<Person> set2) {
		Set<Person> resultSet = new HashSet<>(set1);
		resultSet.removeAll(set2);
		return resultSet;
	}
}
