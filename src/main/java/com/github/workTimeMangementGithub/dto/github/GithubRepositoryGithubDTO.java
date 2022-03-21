package com.github.workTimeMangementGithub.dto.github;

import java.util.ArrayList;
import java.util.List;

import com.github.workTimeMangementGithub.dto.ProjectDTO;
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
public class GithubRepositoryGithubDTO {

	private long id;
	private String repositoryName;
	private String repositoryUrl;
	private List<IssueGithubDTO> issues = new ArrayList<>();
	private List<ProjectDTO> repositoryProjects;
}
