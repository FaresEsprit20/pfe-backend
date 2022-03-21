package com.github.workTimeMangementGithub.dto;

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
public class UserDTO {

	private long id;
	private String username;
	private String password;
	private String lastname;
	private String name;
	private String email;
	private UserRoleType role;
	private String permission;
	private String githubPersonalAcessToken;
	private String avatar;
	private List<TeamDTO> teams = new ArrayList<>();
	private List<IssueDTO> issues = new ArrayList<>();
	
}
