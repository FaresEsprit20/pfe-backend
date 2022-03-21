package com.github.workTimeMangementGithub.mapper;

import java.util.ArrayList;
import java.util.List;


import com.github.workTimeMangementGithub.dto.UserDTO;
import com.github.workTimeMangementGithub.entities.User;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserMapper {

	
	public static User toEntity(UserDTO userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setUsername(userDto.getUsername());
		user.setPassword(userDto.getPassword());
		user.setLastname(userDto.getLastname());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setRole(userDto.getRole());
		user.setPermission(userDto.getPermission());
		user.setGithubPersonalAcessToken(userDto.getGithubPersonalAcessToken());
		user.setAvatar(userDto.getAvatar());
		user.setTeams(TeamMapper.toListEntity(userDto.getTeams()));
		user.setIssues(IssueMapper.toListEntity(userDto.getIssues()));
		return user;
	}
	
	public static List<User> toListEntity(List<UserDTO> userListDto) {
		List<User> userList = new ArrayList<>();
		for(UserDTO userDto : userListDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setUsername(userDto.getUsername());
		user.setPassword(userDto.getPassword());
		user.setLastname(userDto.getLastname());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setRole(userDto.getRole());
		user.setPermission(userDto.getPermission());
		user.setGithubPersonalAcessToken(userDto.getGithubPersonalAcessToken());
		user.setAvatar(userDto.getAvatar());
		user.setTeams(TeamMapper.toListEntity(userDto.getTeams()));
		user.setIssues(IssueMapper.toListEntity(userDto.getIssues()));
		userList.add(user);
		}
		return userList;
	}
	
	public static UserDTO toDTO(User user) {
		UserDTO userDto = new UserDTO();
		userDto.setId(user.getId());
		userDto.setUsername(user.getUsername());
		userDto.setPassword(user.getPassword());
		userDto.setLastname(user.getLastname());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setRole(user.getRole());
		userDto.setPermission(user.getPermission());
		userDto.setGithubPersonalAcessToken(user.getGithubPersonalAcessToken());
		userDto.setAvatar(user.getAvatar());
		userDto.setTeams(TeamMapper.toListDTO(user.getTeams()));
		userDto.setIssues(IssueMapper.toListDTO(user.getIssues()));
		return userDto;
	}
	
	public static List<UserDTO> toListDTO(List<User> userList) {
		List<UserDTO> userListDto = new ArrayList<>();
		for(User user : userList) {
		UserDTO userDto = new UserDTO();
		userDto.setId(user.getId());
		userDto.setUsername(user.getUsername());
		userDto.setPassword(user.getPassword());
		userDto.setLastname(user.getLastname());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setRole(user.getRole());
		userDto.setPermission(user.getPermission());
		userDto.setGithubPersonalAcessToken(user.getGithubPersonalAcessToken());
		userDto.setAvatar(user.getAvatar());
		userDto.setTeams(TeamMapper.toListDTO(user.getTeams()));
		userDto.setIssues(IssueMapper.toListDTO(user.getIssues()));
		userListDto.add(userDto);
		}
		return userListDto;
	}
	
}
