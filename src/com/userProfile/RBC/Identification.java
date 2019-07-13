package com.userProfile.RBC;

public class Identification {
	private String SIN, passportNo, UCINo, address;
	private Identification(String SIN, String passportNo, String UCINo, String address) {
		this.SIN = SIN;
		this.passportNo = passportNo;
		this.UCINo = UCINo;
		this.address = address;
	}
	
	//Component to be added: DB insertion of Identification 
}
