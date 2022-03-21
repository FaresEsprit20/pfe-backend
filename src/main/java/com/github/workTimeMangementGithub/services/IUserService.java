package com.github.workTimeMangementGithub.services;

import com.github.workTimeMangementGithub.dto.github.UserGithubDTO;
import com.github.workTimeMangementGithub.entities.*;
import com.github.workTimeMangementGithub.response.ResponseUserJSON;

import java.util.List;



public interface IUserService {

	//********Api Github*********
	//User management
	public ResponseUserJSON getAuthenticatedUserAPI(String token); //200ok, 304,401,403(forbidden)
	public ResponseUserJSON GetUserByUserNameAPI(String username,String token); //200ok, 404 not found
	public ResponseUserJSON UpdateAuthUserNameAPI(String name,String token);	//200ok , 304(not modified),401,403,404,422
	//User Projects
	public ResponseUserJSON AddProjectCollaboratorAPI(UserGithubDTO user,long projectId,String token); //204ok,304(not modified),401,403,404,422
	public ResponseUserJSON GetProjectCollaboratorPermissionAPI(long projectId,String token);//200ok , 304,401,403,404,422
	public ResponseUserJSON GetProjectCollaboratorsAPI(long projectId,String token);//200ok,304,401,404,422
	public ResponseUserJSON DeleteProjectCollaboratorAPI(long projectId, String username,String token);//204ok ,304,401403;404,422
	
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
