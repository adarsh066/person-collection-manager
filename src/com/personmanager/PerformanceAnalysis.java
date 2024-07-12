package com.personmanager;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Class for analyzing performance of HashSet and LinkedHashSet. 
 * Author: Aadarsh Patil
 */
public class PerformanceAnalysis {

	public static void main(String[] args) {
		int numElements = 1000000; // Number of elements to test with

		// Analyzing performance of HashSet
		Set<Person> hashSet = new HashSet<>();
		long hashSetAddTime = measureAddPerformance(hashSet, numElements);
		long hashSetRemoveTime = measureRemovePerformance(hashSet, numElements);
		long hashSetContainsTime = measureContainsPerformance(hashSet, numElements);

		System.out.println("HashSet - Add Time: " + hashSetAddTime + "ms");
		System.out.println("HashSet - Remove Time: " + hashSetRemoveTime + "ms");
		System.out.println("HashSet - Contains Time: " + hashSetContainsTime + "ms");

		// Analyzing performance of LinkedHashSet
		Set<Person> linkedHashSet = new LinkedHashSet<>();
		long linkedHashSetAddTime = measureAddPerformance(linkedHashSet, numElements);
		long linkedHashSetRemoveTime = measureRemovePerformance(linkedHashSet, numElements);
		long linkedHashSetContainsTime = measureContainsPerformance(linkedHashSet, numElements);

		System.out.println("LinkedHashSet - Add Time: " + linkedHashSetAddTime + "ms");
		System.out.println("LinkedHashSet - Remove Time: " + linkedHashSetRemoveTime + "ms");
		System.out.println("LinkedHashSet - Contains Time: " + linkedHashSetContainsTime + "ms");
	}

	/**
	 * Measures the time taken to add elements to a set.
	 * 
	 * @param set         Set of Person objects
	 * @param numElements Number of elements to add
	 * @return Time taken in milliseconds
	 */
	private static long measureAddPerformance(Set<Person> set, int numElements) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numElements; i++) {
			set.add(new Person(i, "Person " + i, 20 + (i % 50)));
		}
		return System.currentTimeMillis() - startTime;
	}

	/**
	 * Measures the time taken to remove elements from a set.
	 * 
	 * @param set         Set of Person objects
	 * @param numElements Number of elements to remove
	 * @return Time taken in milliseconds
	 */
	private static long measureRemovePerformance(Set<Person> set, int numElements) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numElements; i++) {
			set.remove(new Person(i, "Person " + i, 20 + (i % 50)));
		}
		return System.currentTimeMillis() - startTime;
	}

	/**
	 * Measures the time taken to check if elements are contained in a set.
	 * 
	 * @param set         Set of Person objects
	 * @param numElements Number of elements to check
	 * @return Time taken in milliseconds
	 */
	private static long measureContainsPerformance(Set<Person> set, int numElements) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numElements; i++) {
			set.contains(new Person(i, "Person " + i, 20 + (i % 50)));
		}
		return System.currentTimeMillis() - startTime;
	}
}
