package com.cg.jpa.app.demo;

import javax.persistence.*;

// explain PK FK and cardinality of entities here 

@Entity
@Table(name = "emp_table")
public class Employee { // entity classes

	@Id // primary key
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;

	@Column
	private String ename;

	@Column
	private double salary;

//	@OneToMany(targetEntity = Department.class)

	@ManyToOne
	@JoinColumn(name = "did")
	private Department department;

	public Employee() {
		super();
	}

	public Employee(String ename, double salary, Department department) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.department = department;
	}

	public Employee(int eid, String ename, double salary, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.department = department;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", department=" + department + "]";
	}

}