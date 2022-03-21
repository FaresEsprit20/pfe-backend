package com.github.workTimeMangementGithub.controllers;

import com.github.workTimeMangementGithub.services.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ProjectController {

	@Autowired
	IProjectService iprojectService;
	
}
