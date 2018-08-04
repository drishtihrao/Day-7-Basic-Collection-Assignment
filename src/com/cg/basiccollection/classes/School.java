package com.cg.basiccollection.classes;

public class School {
	private String name;
	private String city;
	private String schoolDistrict;
	private int greatSchoolRanking;

	// creating a constructor for School class
	public School(String name, String city, String dist, int rank) {
		this.name = name;
		this.city = city;
		this.schoolDistrict = dist;
		this.greatSchoolRanking = rank;
	}

	@Override
	public String toString() {
		return "School with name = " + name + ", city = " + city + ", schoolDistrict = " + schoolDistrict
				+ ", greatSchoolRanking = " + greatSchoolRanking + ".";
	}

}