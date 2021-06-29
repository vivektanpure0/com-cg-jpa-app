package com.cg.jpa.app.demo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dep_table")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	@Column
	private String dname;
	@Column
	private String city;

	@OneToMany(mappedBy = "department")
	private List<Employee> employees;

	public Department() {
		super();
	}

	public Department(String dname, String city) {
		super();
		this.dname = dname;
		this.city = city;
	}

	public Department(int did, String dname, String city) {
		super();
		this.did = did;
		this.dname = dname;
		this.city = city;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", city=" + city + "]";
	}

}