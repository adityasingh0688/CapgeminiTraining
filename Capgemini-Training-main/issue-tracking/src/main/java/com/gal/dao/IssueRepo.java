package com.gal.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gal.model.Issue;

public interface IssueRepo extends JpaRepository<Issue, Integer>{
	List<Issue> findByEmployeeEmpIdAndStatus(int empId, String status);
	    List<Issue> findByRaiseDateBetween(Date start, Date end);
	    List<Issue> findByRaiseDateBetweenOrderByEmployee_Name(Date start, Date end);
}
