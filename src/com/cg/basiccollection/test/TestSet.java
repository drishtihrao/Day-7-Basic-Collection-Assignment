package com.cg.basiccollection.test;

import java.util.HashSet;
import java.util.Set;

import com.cg.basiccollection.classes.Car;
import com.cg.basiccollection.classes.CellPhone;
import com.cg.basiccollection.classes.Laptop;
import com.cg.basiccollection.classes.School;
import com.cg.basiccollection.classes.Television;

public class TestSet {
	public static void main(String args[]) {
		Set set = new HashSet();
		
		//adding objects of CellPhone class
		set.add(new CellPhone("Samsung", "X10", "Black", "Android", 14000));
		set.add(new CellPhone("OnePlus", "6", "Red", "Android", 19000));
		set.add(new CellPhone("Apple", "X", "Matte", "iOS", 34000));
		
		//adding objects of Laptop class
		set.add(new Laptop("Acer", "Lfive", "Windows", "i5"));
		set.add(new Laptop("Dell", "Lthree", "MacOS", "i8"));
		set.add(new Laptop("HP", "Lseven", "Linux", "i7"));
		
		//adding objects of Car class
		set.add(new Car("Mercedes", "820", 2008, 23000));
		set.add(new Car("BMW", "827", 2014, 70000));
		set.add(new Car("Lamborgini", "X", 2015, 2023000));
		
		//adding objects of Television class
		set.add(new Television("LG", "LCD", true, 20000));
		set.add(new Television("Onida", "LED", true, 23000));
		set.add(new Television("Sony", "Plasma", false, 25000));
		
		//adding objects of School class
		set.add(new School("Vivek", "Mumbai", "Mumbai", 20));
		set.add(new School("SFIT", "Mumbai", "Bov", 200));
		set.add(new School("Patkar", "Boisar", "Palghar", 12));
		
		//displaying all set of all the objects of different classes
		//the hash seet does not maintain the order in which the objects were added
		set.stream().forEach((Hash) -> System.out.println(Hash));

	}
}
