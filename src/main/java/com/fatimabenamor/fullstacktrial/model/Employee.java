package com.fatimabenamor.fullstacktrial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	@Column(name="firstame")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="fonction")
	private String fonction ;
	@Column(name="email_id")
	private String emailId;
	
	
	public Employee() {}
	public Employee(String firstname, String lastname, String fonction, String emailId) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.fonction = fonction;
		this.emailId = emailId;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
}
