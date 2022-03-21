package com.github.workTimeMangementGithub.controllers;

import com.github.workTimeMangementGithub.entities.User;
import com.github.workTimeMangementGithub.mapper.github.UserGithubMapper;
import com.github.workTimeMangementGithub.response.ResponseUserJSON;
import com.github.workTimeMangementGithub.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.github.workTimeMangementGithub.Constant.Constant.TOKEN;


@RestController
@RequestMapping("/api/user")
public class UserController {


  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }


	@GetMapping("/getAuthenticatedUser")
	public User getAuthenticatedUser() {
		User authUser = new User();
		ResponseUserJSON response = userService.getAuthenticatedUserAPI(TOKEN);
		if(response.getStatus_code() == 200 && response != null) {
			authUser =  UserGithubMapper.toEntity(response.getBodyGithub().get(0)) ;
			//appel jpa
			User user = new User();
			if(user.getId() ==authUser.getId()){
//				ghkskgjhgjksdhsdkj
			}
		}
		return authUser;
	}




}
