package com.github.workTimeMangementGithub.mapper.github;

import java.util.ArrayList;
import java.util.List;


import com.github.workTimeMangementGithub.dto.github.UserGithubDTO;
import com.github.workTimeMangementGithub.entities.User;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserGithubMapper {

	
	public static User toEntity(UserGithubDTO userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setUsername(userDto.getLogin());
		user.setPassword(userDto.getPassword());
		user.setLastname(userDto.getLastname());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setRole(userDto.getRole());
		user.setPermission(userDto.getPermission());
		user.setGithubPersonalAcessToken(userDto.getGithubPersonalAcessToken());
		user.setAvatar(userDto.getAvatar_url());
		user.setTeams(TeamGithubMapper.toListEntity(userDto.getTeams()));
		user.setIssues(IssueGithubMapper.toListEntity(userDto.getIssues()));
		return user;
	}
	
	public static List<User> toListEntity(List<UserGithubDTO> userListDto) {
		List<User> userList = new ArrayList<>();
		for(UserGithubDTO userDto : userListDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setUsername(userDto.getLogin());
		user.setPassword(userDto.getPassword());
		user.setLastname(userDto.getLastname());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setRole(userDto.getRole());
		user.setPermission(userDto.getPermission());
		user.setGithubPersonalAcessToken(userDto.getGithubPersonalAcessToken());
		user.setAvatar(userDto.getAvatar_url());
		user.setTeams(TeamGithubMapper.toListEntity(userDto.getTeams()));
		user.setIssues(IssueGithubMapper.toListEntity(userDto.getIssues()));
		userList.add(user);
		}
		return userList;
	}
	
	public static UserGithubDTO toDTO(User user) {
		UserGithubDTO userDto = new UserGithubDTO();
		userDto.setId(user.getId());
		userDto.setLogin(user.getUsername());
		userDto.setPassword(user.getPassword());
		userDto.setLastname(user.getLastname());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setRole(user.getRole());
		userDto.setPermission(user.getPermission());
		userDto.setGithubPersonalAcessToken(user.getGithubPersonalAcessToken());
		userDto.setAvatar_url(user.getAvatar());
		userDto.setTeams(TeamGithubMapper.toListDTO(user.getTeams()));
		userDto.setIssues(IssueGithubMapper.toListDTO(user.getIssues()));
		return userDto;
	}
	
	public static List<UserGithubDTO> toListDTO(List<User> userList) {
		List<UserGithubDTO> userListDto = new ArrayList<>();
		for(User user : userList) {
		UserGithubDTO userDto = new UserGithubDTO();
		userDto.setId(user.getId());
		userDto.setLogin(user.getUsername());
		userDto.setPassword(user.getPassword());
		userDto.setLastname(user.getLastname());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setRole(user.getRole());
		userDto.setPermission(user.getPermission());
		userDto.setGithubPersonalAcessToken(user.getGithubPersonalAcessToken());
		userDto.setAvatar_url(user.getAvatar());
		userDto.setTeams(TeamGithubMapper.toListDTO(user.getTeams()));
		userDto.setIssues(IssueGithubMapper.toListDTO(user.getIssues()));
		userListDto.add(userDto);
		}
		return userListDto;
	}
	
}
