package com.github.workTimeMangementGithub.controllers;

import com.github.workTimeMangementGithub.services.IIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IssueController {

	@Autowired
	private IIssueService iissueService;
	
}
