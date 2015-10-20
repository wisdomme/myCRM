package com.di.crm.domain;

import java.util.Date;

import com.di.util.Code.CustomerType;

public class Customer {
	private String rowId;
	
	private String id;					//customer id
	private String firstName;
	private String lastName;
	
	private String companyName;
	private String corpRegNumber;
	
	private CustomerType type;			//private/enterprise
	private String status;				//active, pending, delete
	private String grade;				//white, gray, red, blue, black, diamond
	
	private Address address;			//use address class(address1, address2, city,
										// gu, province, detail address), post number
	
	private PhoneNumber phoneNumber;	//phone number1, phone number 2, home phone number, company phone number
	private Email email;				//company email, private email, email 1, email 2,...

	private Date registeredDate;		//created date and registered date is different!!!
	
	private Date lastUpdated;
	private Date createdDate;
	
	public Customer(String companyName, CustomerType type) {
		this.companyName = companyName;
		this.type = type;
	}

	public String getCorpRegNumber() {
		return corpRegNumber;
	}

	public void setCorpRegNumber(String corpRegNumber) {
		this.corpRegNumber = corpRegNumber;
	}
}
