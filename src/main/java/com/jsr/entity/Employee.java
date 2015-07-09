package com.jsr.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee", catalog = "directory")
public class Employee implements Serializable{
	
private String empName;
private int empId;

@Column(name = "employeecol", nullable = false, length = 100)
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}

@Id
@GeneratedValue(strategy = IDENTITY)
@Column(name = "empId", nullable = false, length = 100)
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}

}
