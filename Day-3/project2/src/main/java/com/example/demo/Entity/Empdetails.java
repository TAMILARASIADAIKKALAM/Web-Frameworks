package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employees")
public class Empdetails {
	@Id
    @Column(name="ID")
    private int id;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="AGE")
    private int age;
    
    @Column(name="SALARY")
    private long sal;
    
    public int getId()
    {
    	return id;
    }
    public void setId(int id)
    {
    	this.id=id;
    }
    public String getName()
    {
    	return name;
    }
    public void setName(String name)
    {
    	this.name=name;
    }
    public int getAge()
    {
    	return age;
    }
    public void setMarks(int age)
    {
    	this.age=age;
    }
    public long getsal() 
    {
    	return sal;
    }
    public void setsal(long sal) 
    {
    	this.sal=sal;
    }
    public Empdetails() {}
    public Empdetails(int id, String name, int age,long sal) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal=sal;
	}
}