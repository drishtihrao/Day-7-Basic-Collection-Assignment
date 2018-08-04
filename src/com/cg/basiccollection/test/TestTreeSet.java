//Class to add student names to a tree set and displaying them
package com.cg.basiccollection.test;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		// Creating a tree set
		TreeSet<String> treeset = new TreeSet<>();

		// Adding names to the set
		treeset.add("RS");
		treeset.add("PK");
		treeset.add("BR");
		treeset.add("AB");
		treeset.add("KW");

		// Iterating through the set and displaying each name
		//A tree set does not maintain the order in which the names are added
		treeset.stream().forEach((name) -> System.out.println(name));
	}
}