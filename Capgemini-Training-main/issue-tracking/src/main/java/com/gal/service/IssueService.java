package com.gal.service;

import java.util.List;
import com.gal.model.Issue;

public interface IssueService {
	List<Issue> getUnresolved(int empId);
	List<Issue> getIssuesOfThisMonth();
	List<String> getEmployeeNamesThisMonth();
}