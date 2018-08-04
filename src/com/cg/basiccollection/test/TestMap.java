//Class to add student names and their favorite fruits to a map and print them
package com.cg.basiccollection.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>(); // Create a hashmap

		// Adding names and favorite fruits to hashmap
		map.put("DR", "Cherry"); 
		map.put("RS", "Mango");
		map.put("VP", "Plums");
		map.put("AB", "Peaches");

		Set<Entry<String, String>> set = map.entrySet();

		// Displaying names and favorite fruits using entry-set
		set.stream().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));

		Set<String> keyset = map.keySet();

		//Displaying key values using key-set
		System.out.println("Key set values are: " + keyset);

	}

}