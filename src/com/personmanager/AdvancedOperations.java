package com.personmanager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Class for performing advanced operations on Person sets. 
 * Author: Aadarsh Patil
 */
public class AdvancedOperations {

	public static void main(String[] args) {
		Set<Person> hashSet = new HashSet<>(); // Creating HashSet for Person objects
		Set<Person> linkedHashSet = new LinkedHashSet<>(); // Creating LinkedHashSet for Person objects

		// Adding Person objects to the sets
		hashSet.add(new Person(1, "Alice", 30));
		hashSet.add(new Person(2, "Bob", 25));
		hashSet.add(new Person(3, "Charlie", 35));

		linkedHashSet.add(new Person(4, "Dave", 20));
		linkedHashSet.add(new Person(5, "Eve", 28));
		linkedHashSet.add(new Person(6, "Frank", 33));

		// Finding and printing the Person with maximum and minimum age in HashSet
		System.out.println("Max age in HashSet: " + findMaxAge(hashSet));
		System.out.println("Min age in HashSet: " + findMinAge(hashSet));

		// Finding and printing the Person with maximum and minimum age in LinkedHashSet
		System.out.println("Max age in LinkedHashSet: " + findMaxAge(linkedHashSet));
		System.out.println("Min age in LinkedHashSet: " + findMinAge(linkedHashSet));

		// Sorting and printing the Person objects in HashSet by age
		List<Person> sortedHashSet = sortByAge(hashSet);
		System.out.println("Sorted HashSet by age: " + sortedHashSet);

		// Sorting and printing the Person objects in LinkedHashSet by age
		List<Person> sortedLinkedHashSet = sortByAge(linkedHashSet);
		System.out.println("Sorted LinkedHashSet by age: " + sortedLinkedHashSet);

		// Filtering and printing the Person objects in HashSet by age greater than 26
		Set<Person> filteredSet = filterByAge(hashSet, 26);
		System.out.println("Filtered HashSet (age > 26): " + filteredSet);
	}

	/**
	 * Finds the Person with the maximum age in a set.
	 * 
	 * @param set Set of Person objects
	 * @return Person with the maximum age
	 */
	private static Person findMaxAge(Set<Person> set) {
		return set.stream().max(Comparator.comparingInt(Person::getAge)).orElse(null);
	}

	/**
	 * Finds the Person with the minimum age in a set.
	 * 
	 * @param set Set of Person objects
	 * @return Person with the minimum age
	 */
	private static Person findMinAge(Set<Person> set) {
		return set.stream().min(Comparator.comparingInt(Person::getAge)).orElse(null);
	}

	/**
	 * Sorts the Person objects in a set by age.
	 * 
	 * @param set Set of Person objects
	 * @return List of sorted Person objects
	 */
	private static List<Person> sortByAge(Set<Person> set) {
		List<Person> list = new ArrayList<>(set);
		list.sort(Comparator.comparingInt(Person::getAge));
		return list;
	}

	/**
	 * Filters the Person objects in a set by age greater than a given value.
	 * 
	 * @param set Set of Person objects
	 * @param age Age threshold
	 * @return Filtered set of Person objects
	 */
	private static Set<Person> filterByAge(Set<Person> set, int age) {
		Set<Person> resultSet = new HashSet<>();
		for (Person person : set) {
			if (person.getAge() > age) {
				resultSet.add(person);
			}
		}
		return resultSet;
	}
}
