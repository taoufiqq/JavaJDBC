package com.jdbcTest.app.models;

import java.sql.SQLException;

import com.jdbcTest.app.Controller.Controller;

public class Person {
    private int id;
	private String name;
	private String description;
	private String cin;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	
	public Person(int id, String name, String description, String cin) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.cin = cin;
	}
	
	public Person() {
		
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", description=" + description + ", cin=" + cin + "]";
	}
	
	public void addPerson(String name, String description, String cin) throws ClassNotFoundException, SQLException {
		Controller addStudent = new Controller();
		addStudent.add(name, description, cin);

	}
	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
