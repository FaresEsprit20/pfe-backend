package com.github.workTimeMangementGithub.controllers;

import com.github.workTimeMangementGithub.services.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class NotificationController {

	@Autowired
	private INotificationService iNotificationService;
	
}
