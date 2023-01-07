package com.masai.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
//	private String email;
	private String name;
	
	private String mobile;
	private Date dateOfBirth;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Email email;
	
	public User() {}



	public User(Email email, String name, String mobile, Date dateOfBirth) {
		super();
		this.email = email;
		this.name = name;
		this.mobile = mobile;
		this.dateOfBirth = dateOfBirth;
		
	}

//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public Date getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public Email getEmail() {
		return email;
	}



	public void setEmail(Email email) {
		this.email = email;
	}
	
	

	}
	
	
	


