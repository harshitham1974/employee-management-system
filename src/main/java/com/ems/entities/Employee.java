package com.ems.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "emp_seq")
	@SequenceGenerator(name = "emp_seq",initialValue = 1,allocationSize = 1)
	private int id;
    private String name;
    private String email;
    private String phone;
    private String department;
    private double salary;
    private LocalDate joiningDate;
    private String password;
    
	public Employee(int id, String name, String email, String phone, String department, double salary,
			LocalDate joiningDate, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.department = department;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.password = password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", department="
				+ department + ", salary=" + salary + ", joiningDate=" + joiningDate + "]";
	}
    
    
}
