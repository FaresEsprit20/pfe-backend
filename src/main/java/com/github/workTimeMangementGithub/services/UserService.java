package com.github.workTimeMangementGithub.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.github.workTimeMangementGithub.dto.github.UserGithubDTO;
import com.github.workTimeMangementGithub.entities.*;
import com.github.workTimeMangementGithub.response.ResponseUserJSON;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;


import lombok.extern.slf4j.Slf4j;

import static com.github.workTimeMangementGithub.Constant.Constant.GITHUB_BASE_URL;


@Service
@Transactional
@Slf4j
public class UserService implements IUserService {

	String apiBaseUrl = GITHUB_BASE_URL;


	private final RestTemplate restTemplate;

	public UserService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public ResponseUserJSON getAuthenticatedUserAPI(String token) {
		// TODO Auto-generated method stub
		String url = this.apiBaseUrl + "/user";
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("Authorization", "Bearer " + token);
			HttpEntity<String> entity = new HttpEntity<String>(headers);
			ResponseEntity<UserGithubDTO> response = restTemplate.exchange(url, HttpMethod.GET, entity, UserGithubDTO.class);
			int statuscode = response.getStatusCode().value();
			String message = "";
			switch (statuscode) {
				case 200:
					message = "Okay";
					break;
				case 304:
					message = "Not Modified";
					break;
				case 401:
					message = "Requires Authentication , Verify your Github Personal Access Token";
					break;
				case 403:
					message = "Forbidden";
					break;

			}
			log.debug("Api Github call status code " + response.getStatusCode().toString());
			log.debug("Api Github call message " + message);
			log.debug("Api Github call body " + response.getBody());
			List<UserGithubDTO> bodyGithub = new ArrayList<UserGithubDTO>();
			bodyGithub.add(response.getBody());
			return new ResponseUserJSON(message, statuscode, bodyGithub, null);
		} catch (Exception exception) {
			log.error("Eroro", exception);
		}


		return null;
	}

	@Override
	public UserGithubDTO GetUserByUserNameAPI(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserGithubDTO UpdateAuthUserNameAPI(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AddProjectCollaboratorAPI(UserGithubDTO user, long projectId) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserGithubDTO GetProjectCollaboratorPermissionAPI(long projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserGithubDTO> GetProjectCollaboratorsAPI(long projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteProjectCollaboratorAPI(long projectId, String username) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getAuthenticatedUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User GetUserByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User UpdateAuthUserName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User UpdateProfile(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AddProjectCollaborator(User user, long projectId) {
		// TODO Auto-generated method stub

	}

	@Override
	public User GetProjectCollaboratorPermission(long projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> GetProjectCollaborators(long projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteProjectCollaborator(long projectId, String username) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Project> ListUserProjects(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User SetUserPermissionToProject(long userId, long projectId, String permission) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User AddUserToTeam(long userId, long teamId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> ListUsersByTeam(long teamId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Team> ListUserTeams(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Team> UpdateUserTeams(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteUserFromTeam(long userId, long teamId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<GithubRepository> GetUserRepositories(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Issue> GetUserIssues(long userId) {
		// TODO Auto-generated method stub
		return null;
	}


}
