package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Childern")
public class Babydetails {
	@Id
    @Column(name="ID")
    private int babyid;
    
    @Column(name="FNAME")
    private String babyFirstName;
    
    @Column(name="LNAME")
    private String babyLastName;
    
    @Column(name="faName")
    private String fathername;
    
    @Column(name="maName")
    private String mothername;
    
    @Column(name="addr")
    private String address;

	public int getBabyid() {
		return babyid;
	}

	public void setBabyid(int babyid) {
		this.babyid = babyid;
	}

	public String getBabyFirstName() {
		return babyFirstName;
	}

	public void setBabyFirstName(String babyFirstName) {
		this.babyFirstName = babyFirstName;
	}

	public String getBabyLastName() {
		return babyLastName;
	}

	public void setBabyLastName(String babyLastName) {
		this.babyLastName = babyLastName;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    public Babydetails() {}
    
	public Babydetails(int babyid, String babyFirstName, String babyLastName, String fathername, String mothername,
			String address) {
		super();
		this.babyid = babyid;
		this.babyFirstName = babyFirstName;
		this.babyLastName = babyLastName;
		this.fathername = fathername;
		this.mothername = mothername;
		this.address = address;
	}
}