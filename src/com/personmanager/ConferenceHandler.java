package com.personmanager;

import java.util.HashSet;
import java.util.Set;

/**
 * Class for managing conference attendees. 
 * Author: Aadarsh Patil
 */
public class ConferenceHandler {

	private Set<Person> attendees = new HashSet<>(); // Set of conference attendees

	/**
	 * Adds a participant to the conference.
	 * 
	 * @param person Person object to add
	 */
	public void addParticipant(Person person) {
		attendees.add(person);
	}

	/**
	 * Removes a participant from the conference.
	 * 
	 * @param person Person object to remove
	 */
	public void removeParticipant(Person person) {
		attendees.remove(person);
	}

	/**
	 * Finds duplicate attendees based on id.
	 * 
	 * @return Set of duplicate Person objects
	 */
	public Set<Person> findDuplicateAttendees() {
		Set<Person> uniqueAttendees = new HashSet<>();
		Set<Person> duplicateAttendees = new HashSet<>();
		for (Person attendee : attendees) {
			if (!uniqueAttendees.add(attendee)) {
				duplicateAttendees.add(attendee);
			}
		}
		return duplicateAttendees;
	}

	/**
	 * Lists all unique attendees.
	 * 
	 * @return Set of unique Person objects
	 */
	public Set<Person> listUniqueAttendees() {
		return new HashSet<>(attendees);
	}

	/**
	 * Finds attendees within a certain age range.
	 * 
	 * @param minAge Minimum age
	 * @param maxAge Maximum age
	 * @return Set of Person objects within the age range
	 */
	public Set<Person> findAttendeesWithinAgeRange(int minAge, int maxAge) {
		Set<Person> result = new HashSet<>();
		for (Person attendee : attendees) {
			if (attendee.getAge() >= minAge && attendee.getAge() <= maxAge) {
				result.add(attendee);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ConferenceHandler conference = new ConferenceHandler();

		// Adding participants to the conference
		conference.addParticipant(new Person(1, "Alice", 30));
		conference.addParticipant(new Person(2, "Bob", 25));
		conference.addParticipant(new Person(3, "Charlie", 35));
		conference.addParticipant(new Person(1, "Alice", 30)); // Duplicate

		// Printing all attendees
		System.out.println("All Attendees: " + conference.attendees);
		// Printing duplicate attendees
		System.out.println("Duplicate Attendees: " + conference.findDuplicateAttendees());
		// Printing unique attendees
		System.out.println("Unique Attendees: " + conference.listUniqueAttendees());
		// Printing attendees within age range 20-30
		System.out.println("Attendees aged 20-30: " + conference.findAttendeesWithinAgeRange(20, 30));
	}
}
