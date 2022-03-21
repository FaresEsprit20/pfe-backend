package com.github.workTimeMangementGithub.controllers;

import com.github.workTimeMangementGithub.services.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TeamController {

	@Autowired
	ITeamService iteamService;
	
}
