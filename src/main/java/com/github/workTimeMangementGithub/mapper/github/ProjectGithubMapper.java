package com.github.workTimeMangementGithub.mapper.github;

import java.util.ArrayList;
import java.util.List;


import com.github.workTimeMangementGithub.dto.github.ProjectGithubDTO;
import com.github.workTimeMangementGithub.entities.Project;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProjectGithubMapper {


	
	public static Project toEntity(ProjectGithubDTO projectDto) {
		Project project = new Project();
		project.setId(projectDto.getId());
		project.setProjectNumber(projectDto.getProjectNumber());
		project.setName(projectDto.getName());
		project.setBody(projectDto.getBody());
		project.setState(projectDto.getState());
		project.setVisibility(projectDto.isVisibility());
		project.setGithubRepository(GithubRepositoryGithubMapper.toEntity(projectDto.getProjectRepository()) );
		project.setColumnPs(ColumnGithubMapper.toListEntity(projectDto.getColumns()) );
		return project;
	}
	
	public static List<Project> toListEntity(List<ProjectGithubDTO> projectListDto) {
		List<Project> projectList = new ArrayList<>();
		Project project = new Project();
		for(ProjectGithubDTO projectDto : projectListDto) {
		project.setId(projectDto.getId());
		project.setProjectNumber(projectDto.getProjectNumber());
		project.setName(projectDto.getName());
		project.setBody(projectDto.getBody());
		project.setState(projectDto.getState());
		project.setVisibility(projectDto.isVisibility());
		project.setGithubRepository(GithubRepositoryGithubMapper.toEntity(projectDto.getProjectRepository()) );
		project.setColumnPs(ColumnGithubMapper.toListEntity(projectDto.getColumns()) );
		projectList.add(project);
		}
		return projectList;
	}
	
	public static ProjectGithubDTO toDTO(Project project) {
		ProjectGithubDTO projectDto = new ProjectGithubDTO();
		projectDto.setId(project.getId());
		projectDto.setProjectNumber(project.getProjectNumber());
		projectDto.setName(project.getName());
		projectDto.setBody(project.getBody());
		projectDto.setState(project.getState());
		projectDto.setVisibility(project.isVisibility());
		projectDto.setProjectRepository(GithubRepositoryGithubMapper.toDTO(project.getGithubRepository()) );
		projectDto.setColumns(ColumnGithubMapper.toListDTO(project.getColumnPs()));
		return projectDto;
	}
	
	public static List<ProjectGithubDTO> toDTO(List<Project> projectList) {
		List<ProjectGithubDTO> projectDtoList = new ArrayList<>();
		for(Project project : projectList) {
		ProjectGithubDTO projectDto = new ProjectGithubDTO();
		projectDto.setId(project.getId());
		projectDto.setProjectNumber(project.getProjectNumber());
		projectDto.setName(project.getName());
		projectDto.setBody(project.getBody());
		projectDto.setState(project.getState());
		projectDto.setVisibility(project.isVisibility());
		projectDto.setProjectRepository(GithubRepositoryGithubMapper.toDTO(project.getGithubRepository()) );
		projectDto.setColumns(ColumnGithubMapper.toListDTO(project.getColumnPs()));
		projectDtoList.add(projectDto);
		}
		return projectDtoList;
	}
	
}
