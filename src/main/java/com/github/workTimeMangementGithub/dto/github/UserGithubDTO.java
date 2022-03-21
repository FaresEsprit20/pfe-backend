package com.github.workTimeMangementGithub.dto.github;

import java.util.ArrayList;
import java.util.List;

import com.github.workTimeMangementGithub.entities.UserRoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserGithubDTO {

	private long id;
	private String login;
	private String password;
	private String lastname;
	private String name;
	private String email;
	private UserRoleType role;
	private String permission;
	private String githubPersonalAcessToken;
	private String avatar_url;
	private List<TeamGithubDTO> teams = new ArrayList<>();
	private List<IssueGithubDTO> issues = new ArrayList<>();
	
	public UserGithubDTO(long id,String login,String name, String email,String avatar) {
		this.id = id;
		this.login = login;
		this.name = name;
		this.email = email;
		this.avatar_url = avatar;
	}
	
	
	
	
}
