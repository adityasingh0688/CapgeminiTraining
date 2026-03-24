package com.gal.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
    @Column(name = "name")
    private String name;
 
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    List<Issue> issues;
    public int getEmployeeId() {
        return empId;
    }

    public void setEmployeeId(int employeeId) {
        this.empId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

	@Override
	public String toString() {
		return "Employee [employeeId=" + empId + ", name=" + name + ", issues="
				+ issues + "]";
	}
    
}