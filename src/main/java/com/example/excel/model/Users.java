package com.example.excel.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "master_user")
public class users {
	
	@Id
	private int id;
	
//	
//	@Column
//	private String email;
//	
//	
	@Column
	private String name;


	@Override
	public String toString() {
		return "users [id=" + id + ", name=" + name + "]";
	}


	public users() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


//	public String getEmail() {
//		return email;
//	}
//
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
	
	
	
	

}
