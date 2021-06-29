package com.cg.jpa.app;

import javax.persistence.*;

@Entity
@Table(name = "cg_dep")
public class Department {

	@Id
	@Column(name = "department_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;

	@Column(name = "department_name", length = 128, nullable = false)
	private String dname;

	@Column(name = "department_city", length = 128, nullable = false)
	private String city;
	
	public Department(int id, String name, String city) {
		super();
		this.did = id;
		this.dname = name;
		this.city = city;
	}

	public Department(String name, String city) {
		super();  
		this.dname = name;
		this.city = city;
	}
	
	public Department() {
		super();
	}
	
	public int getId() {
		return did;
	}

	public void setId(int id) {
		this.did = id;
	}

	public String getName() {
		return dname;
	}

	public void setName(String name) {
		this.dname = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Department [id=" + did + ", name=" + dname + ", city=" + city + "]";
	}

}
