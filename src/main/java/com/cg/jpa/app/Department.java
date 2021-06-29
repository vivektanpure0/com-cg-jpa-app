package com.cg.jpa.app;

import javax.persistence.*;

@Entity
@Table(name = "cg_dep")
public class Department {

	@Id
	@Column(name = "department_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "department_name", length = 128, nullable = false)
	private String name;

	@Column(name = "department_city", length = 128, nullable = false)
	private String city;
	
	public Department(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Department(String name, String city) {
		super();  
		this.name = name;
		this.city = city;
	}
	
	public Department() {
		super();
	}
	
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
