//To add student names to a linked hashset and print them
package com.cg.basiccollection.test;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
	public static void main(String[] args) {
		// Creating a linked hashset
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<>(); 

		linkedhashset.add("DR"); // Adding names to linked hashset
		linkedhashset.add("PK");
		linkedhashset.add("PRd");
		linkedhashset.add("VP");
		linkedhashset.add("RS");

		// Iterating through the set and displaying each name
		//A linked hash set maintains the order in which the objects are added 
		linkedhashset.stream().forEach((name) -> System.out.println(name));
	}

}