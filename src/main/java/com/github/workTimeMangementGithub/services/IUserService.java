package com.github.workTimeMangementGithub.services;

import com.github.workTimeMangementGithub.dto.github.UserGithubDTO;
import com.github.workTimeMangementGithub.entities.*;
import com.github.workTimeMangementGithub.response.ResponseUserJSON;

import java.util.List;



public interface IUserService {

	//********Api Github*********
	//User management
	public ResponseUserJSON getAuthenticatedUserAPI(String token); //200ok, 304,401,403(forbidden)
	public UserGithubDTO GetUserByUserNameAPI(String username); //200ok, 404 not found
	public UserGithubDTO UpdateAuthUserNameAPI(String name);	//200ok , 304(not modified),401,403,404,422
	//User Projects
	public void AddProjectCollaboratorAPI(UserGithubDTO user,long projectId); //204ok,304(not modified),401,403,404,422
	public UserGithubDTO GetProjectCollaboratorPermissionAPI(long projectId);//200ok , 304,401,403,404,422
	public List<UserGithubDTO> GetProjectCollaboratorsAPI(long projectId);//200ok,304,401,404,422
	public void DeleteProjectCollaboratorAPI(long projectId, String username);//204ok ,304,401403;404,422
	
	//*******Spring Data JPA *******//
	//User management
	public User getAuthenticatedUser();
	public User GetUserByUserName(String username);
	public User UpdateAuthUserName(String name);
	public User UpdateProfile(User user);
	//User Projects
	public void AddProjectCollaborator(User user,long projectId); 
	public User GetProjectCollaboratorPermission(long projectId);
	public List<User> GetProjectCollaborators(long projectId);
	public void DeleteProjectCollaborator(long projectId, String username);
	public List<Project> ListUserProjects(String userId);
	public User SetUserPermissionToProject(long userId, long projectId, String permission);
	//User Team
	public User AddUserToTeam(long userId, long teamId);
	public List<User> ListUsersByTeam(long teamId);
	public List<Team> ListUserTeams(long userId);
	public List<Team> UpdateUserTeams(long userId);
	public void DeleteUserFromTeam(long userId, long teamId);
	//user repositories
	public List<GithubRepository> GetUserRepositories(String username);
	//user issues
	public List<Issue> GetUserIssues(long userId);
	
}
