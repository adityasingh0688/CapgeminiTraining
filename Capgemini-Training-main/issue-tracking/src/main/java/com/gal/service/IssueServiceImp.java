package com.gal.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gal.dao.IssueRepo;
import com.gal.model.Issue;

@Service
public class IssueServiceImp implements IssueService {
	@Autowired
	private IssueRepo issueRepository;
	private static final Logger logger = LoggerFactory.getLogger(IssueServiceImp.class);

	@Override
	public List<Issue> getUnresolved(int empId) {
	    logger.info("Fetching unresolved issue {}", empId);
	    return issueRepository.findByEmployeeEmpIdAndStatus(empId, "UNRESOLVED");
	}
	@Override
	public List<Issue> getIssuesOfThisMonth() {
		LocalDate now = LocalDate.now();
		Date start = Date.valueOf(now.withDayOfMonth(1));
		Date end = Date.valueOf(now.withDayOfMonth(now.lengthOfMonth()));
		return issueRepository.findByRaiseDateBetween(start, end);
	}

	@Override
	public List<String> getEmployeeNamesThisMonth() {
		LocalDate now = LocalDate.now();
		Date start = Date.valueOf(now.withDayOfMonth(1));
		Date end = Date.valueOf(now.withDayOfMonth(now.lengthOfMonth()));
		List<Issue> issues = issueRepository.findByRaiseDateBetween(start, end);
		List<String> names = new ArrayList<>();
		for (int i = 0; i < issues.size(); i++) {
			Issue issue = issues.get(i);
			String name = issue.getEmployee().getName();
			if (!names.contains(name)) {
				names.add(name);
			}
		}
		return names;
	}
}