package com.github.workTimeMangementGithub.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
@Entity
public class GithubRepository implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(unique = true)
	private Long id;

	@Column(length = 50, unique = true)
	private String repositoryName;

	@Column(nullable = true)
	private String repositoryUrl;

	@OneToMany(mappedBy = "githubRepository")
	private List<Issue> issues = new ArrayList<>();

	@OneToMany(mappedBy = "githubRepository")
	private List<Project> repositoryProjects;
	

}
