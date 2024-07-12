# Person Collection Manager

**Author:** Aadarsh Patil

## Overview

Person Collection Manager is a comprehensive Java application designed to manage and manipulate collections of `Person` objects using various Set implementations. The application features advanced operations, performance analysis, and a real-world conference attendee management scenario. The project emphasizes effective use of Java's `HashSet` and `LinkedHashSet` along with custom object handling and detailed documentation.

## Features

1. **Custom Object Manipulation**
   - Define a `Person` class with `id`, `name`, and `age` properties.
   - Override `hashCode` and `equals` methods based on `id`.
   - Add `Person` objects to `HashSet` and `LinkedHashSet` ensuring no duplicates based on `id`.

2. **Set Operations**
   - Perform union, intersection, and difference operations on sets of `Person` objects.

3. **Complex Operations**
   - Find the `Person` with the maximum and minimum age.
   - Sort `Person` objects by age using a custom comparator.
   - Filter `Person` objects by age.

4. **Performance Analysis**
   - Measure and compare the performance of `HashSet` and `LinkedHashSet` for `add`, `remove`, and `contains` operations.

5. **Real-World Scenario: Conference Management**
   - Manage conference attendees with methods to add, remove, find duplicates, list unique attendees, and find attendees within a certain age range.

## Project Structure

person-collection-manager/
│
├── src/
│ ├── com/personmanager/
│ │ ├── Person.java
│ │ ├── SetUtility.java
│ │ ├── AdvancedOperations.java
│ │ ├── PerformanceAnalysis.java
│ │ ├── ConferenceHandler.java
│ │ └── Main.java
│
├── README.md


*****Detailed Documentation ******
Person Class
Defines the Person object with properties, constructor, getters, and overridden hashCode and equals methods.

SetUtility Class
Provides methods for basic set operations such as union, intersection, and difference.

AdvancedOperations Class
Implements complex operations like finding the person with the maximum and minimum age, sorting by age, and filtering by age.

PerformanceAnalysis Class
Measures and compares the performance of HashSet and LinkedHashSet for various operations with a large number of elements.

ConferenceHandler Class
Manages conference attendees with functionalities to add, remove, find duplicates, list unique attendees, and find attendees within an age range.

Main Class
Entry point of the application that orchestrates the execution of different tasks and functionalities.
