package com.github.workTimeMangementGithub.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(unique = true)
	private Long id;
	@Column(unique = true, length = 20)
	private String username;
	@Column(length = 20)
	private String password = "member";
	@Column(length = 30, nullable = true)
	private String lastname;
	@Column(length = 30, nullable = true)
	private String name;
	@Column(unique = true, nullable = true)
	private String email;
	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private UserRoleType role = UserRoleType.MEMBER;
	//can be read,write or admin or owner
	@Column(length = 10)
	private String permission = "read";
	@Column(unique = true)
	private String githubPersonalAcessToken;
	@Column(nullable = true)
	private String avatar;
    @ManyToMany
	private List<Team> teams = new ArrayList<>();
    @ManyToMany
	private List<Issue> issues = new ArrayList<>();
	
	

}
