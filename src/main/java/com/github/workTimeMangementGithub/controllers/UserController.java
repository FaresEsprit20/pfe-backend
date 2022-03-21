package com.github.workTimeMangementGithub.controllers;

import com.github.workTimeMangementGithub.dto.github.UserGithubDTO;
import com.github.workTimeMangementGithub.entities.User;
import com.github.workTimeMangementGithub.mapper.github.UserGithubMapper;
import com.github.workTimeMangementGithub.response.ResponseUserJSON;
import com.github.workTimeMangementGithub.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import static com.github.workTimeMangementGithub.Constant.Constant.TOKEN;


@RestController
@RequestMapping("/api/user")
@Slf4j
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

	@GetMapping("/getUserByUsername/{username}")
	@ResponseBody
	public User getUserByUsername(@PathVariable(name = "username") String username) {
		User user = new User();
		ResponseUserJSON response = userService.GetUserByUserNameAPI(username,TOKEN);
		if(response.getStatus_code() == 200 && response != null) {
			user =  UserGithubMapper.toEntity(response.getBodyGithub().get(0)) ;
			//appel jpa

		}
		return user;
	}

	@PatchMapping("/UpdateAuthUserNameAPI")
	@ResponseBody
	public ResponseUserJSON UpdateAuthUserNameAPI( String name,String token){
		User user = new User();
		ResponseUserJSON response = userService.UpdateAuthUserNameAPI(name,TOKEN)
		if(response.getStatus_code() == 200 && response != null) {
			user =  UserGithubMapper.toEntity(response.getBodyGithub().get(0)) ;
			//appel jpa

		}
		return null;
	}

	//User Projects
	public ResponseUserJSON AddProjectCollaboratorAPI(UserGithubDTO user, long projectId, String token){
		return null;
	} //204ok,304(not modified),401,403,404,422
	public ResponseUserJSON GetProjectCollaboratorPermissionAPI(long projectId,String token){
		return null;
	}//200ok , 304,401,403,404,422
	public ResponseUserJSON GetProjectCollaboratorsAPI(long projectId,String token){
		return null;
	}//200ok,304,401,404,422
	public ResponseUserJSON DeleteProjectCollaboratorAPI(long projectId, String username,String token){
	  return null;
	}//204ok ,304,401403;404,422

}
