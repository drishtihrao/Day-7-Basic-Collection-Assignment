package com.cg.basiccollection.test;

import java.util.LinkedList;
import java.util.List;

import com.cg.basiccollection.classes.Car;
import com.cg.basiccollection.classes.CellPhone;
import com.cg.basiccollection.classes.Laptop;
import com.cg.basiccollection.classes.School;
import com.cg.basiccollection.classes.Television;

public class TestList {
	public static void main(String args[]) {
		List list = new LinkedList();

		//adding objects of CellPhone class
		list.add(new CellPhone("Samsung", "X10", "Black", "Android", 14000));
		list.add(new CellPhone("OnePlus", "6", "Red", "Android", 19000));
		list.add(new CellPhone("Apple", "X", "Matte", "iOS", 34000));
		
		//adding objects of Laptop class
		list.add(new Laptop("Acer", "Lfive", "Windows", "i5"));
		list.add(new Laptop("Dell", "Lthree", "MacOS", "i8"));
		list.add(new Laptop("HP", "Lseven", "Linux", "i7"));
		
		//adding objects of Car class
		list.add(new Car("Mercedes", "820", 2008, 23000));
		list.add(new Car("BMW", "827", 2014, 70000));
		list.add(new Car("Lamborgini", "X", 2015, 2023000));
		
		//adding objects of Television class
		list.add(new Television("LG", "LCD", true, 20000));
		list.add(new Television("Onida", "LED", true, 23000));
		list.add(new Television("Sony", "Plasma", false, 25000));
		
		//adding objects of School class
		list.add(new School("Vivek", "Mumbai", "Mumbai", 20));
		list.add(new School("SFIT", "Mumbai", "Bov", 200));
		list.add(new School("Patkar", "Boisar", "Palghar", 12));

		//displaying all list with all the objects of different classes
		//the linked list maintains the order in which the objects were added
		list.stream().forEach((list_linked) -> System.out.println(list_linked));

	}
}
