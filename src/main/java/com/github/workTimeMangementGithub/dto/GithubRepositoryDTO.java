package com.github.workTimeMangementGithub.dto;

import java.util.ArrayList;
import java.util.List;

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
public class GithubRepositoryDTO {

	private long id;
	private String repositoryName;
	private String repositoryUrl;
	private List<IssueDTO> issues = new ArrayList<>();
	private List<ProjectDTO> repositoryProjects;
	
}
