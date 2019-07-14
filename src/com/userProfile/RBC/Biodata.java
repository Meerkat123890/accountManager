package com.userProfile.RBC;

public class Biodata {
	private String name, nationality, sex;
	private int age;
	private Biodata(String name, String nationality, String sex, int age) {
		this.name = name;
		this.nationality = nationality;
		this.sex = sex;
		this.age = age;
	}

	
	public Object getBio() {
		return String.format("Name:", "%8s", name, "/n", "Sex:", "%8s", sex, "/n", "Age:","%8s", age, "/n","Nationality:", "%8s", nationality);
		 
	}
}



