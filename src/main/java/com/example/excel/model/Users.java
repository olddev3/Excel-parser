package com.example.excel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="data")
public class Users {

	
    @Id
    @Column(name = "Id")
	private int Id;
    
    @Column(name = "Name")
	private String Name;
    
    @Column(name = "Address")
	private String Address;
    
    @Column(name = "Age")
	private int Age;

	public Users(int id, String name, String address, int age) {
		super();
		Id = id;
		Name = name;
		Address = address;
		Age = age;
	}
																			
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
    
	
	
	
	
	
}
