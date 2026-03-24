package com.gal.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gal.model.Issue;
import com.gal.service.IssueService;

@RestController
@RequestMapping("/issue")
public class IssueController {

    @Autowired
    IssueService issueService;

    @GetMapping("/unresolved/{empId}")
    public List<Issue> getUnresolved(@PathVariable int empId) {
        return issueService.getUnresolved(empId);
    }

    @GetMapping("/thismonth")
    public List<Issue> getThisMonth() {
        return issueService.getIssuesOfThisMonth();
    }

    @GetMapping("/employees/{month}")
    public List<String> getEmployees(@PathVariable int month) {
        return issueService.getEmployeeNamesThisMonth();
    }
}
