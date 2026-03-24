package com.gal.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "issue")
public class Issue {

    @Id
    @Column(name = "issue_id")
    int issueId;

    @Column(name = "category")
    String category;

    @Column(name = "raise_date")
    Date raiseDate;

    @Column(name = "resolve_date")
    Date resolveDate;

    @Column(name = "status")
    String status; 
    @ManyToOne
    @JoinColumn(name = "employee_id")  
    private Employee employee;

    public int getIssueId() {
        return issueId;
    }

    @Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", category=" + category + ", raiseDate=" + raiseDate + ", resolveDate="
				+ resolveDate + ", status=" + status + ", employee=" + employee + "]";
	}

	public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getRaiseDate() {
        return raiseDate;
    }

    public void setRaiseDate(Date raiseDate) {
        this.raiseDate = raiseDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}