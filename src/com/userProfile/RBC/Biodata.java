package com.userProfile.RBC;

public class Biodata {
	private String name, nationality, sex, SIN;
	private int age;
	private Biodata(String name, String nationality, String sex, String SIN, int age) {
		this.name = name;
		this.nationality = nationality;
		this.sex = sex;
		this.SIN = SIN;
		this.age = age;
	}
}
