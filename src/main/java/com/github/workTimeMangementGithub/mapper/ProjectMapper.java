package com.github.workTimeMangementGithub.mapper;

import java.util.ArrayList;
import java.util.List;

import com.github.workTimeMangementGithub.dto.ProjectDTO;
import com.github.workTimeMangementGithub.entities.Project;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProjectMapper {

	
	public static Project toEntity(ProjectDTO projectDto) {
		Project project = new Project();
		project.setId(projectDto.getId());
		project.setProjectNumber(projectDto.getProjectNumber());
		project.setName(projectDto.getName());
		project.setBody(projectDto.getBody());
		project.setState(projectDto.getState());
		project.setVisibility(projectDto.isVisibility());
		project.setGithubRepository(GithubRepositoryMapper.toEntity(projectDto.getProjectRepository()) );
		project.setColumnPs(ColumnMapper.toListEntity(projectDto.getColumns()) );
		return project;
	}
	
	public static List<Project> toListEntity(List<ProjectDTO> projectListDto) {
		List<Project> projectList = new ArrayList<>();
		Project project = new Project();
		for(ProjectDTO projectDto : projectListDto) {
		project.setId(projectDto.getId());
		project.setProjectNumber(projectDto.getProjectNumber());
		project.setName(projectDto.getName());
		project.setBody(projectDto.getBody());
		project.setState(projectDto.getState());
		project.setVisibility(projectDto.isVisibility());
		project.setGithubRepository(GithubRepositoryMapper.toEntity(projectDto.getProjectRepository()) );
		project.setColumnPs(ColumnMapper.toListEntity(projectDto.getColumns()) );
		projectList.add(project);
		}
		return projectList;
	}
	
	public static ProjectDTO toDTO(Project project) {
		ProjectDTO projectDto = new ProjectDTO();
		projectDto.setId(project.getId());
		projectDto.setProjectNumber(project.getProjectNumber());
		projectDto.setName(project.getName());
		projectDto.setBody(project.getBody());
		projectDto.setState(project.getState());
		projectDto.setVisibility(project.isVisibility());
		projectDto.setProjectRepository(GithubRepositoryMapper.toDTO(project.getGithubRepository()) );
		projectDto.setColumns(ColumnMapper.toListDTO(project.getColumnPs()));
		return projectDto;
	}
	
	public static List<ProjectDTO> toDTO(List<Project> projectList) {
		List<ProjectDTO> projectDtoList = new ArrayList<>();
		for(Project project : projectList) {
		ProjectDTO projectDto = new ProjectDTO();
		projectDto.setId(project.getId());
		projectDto.setProjectNumber(project.getProjectNumber());
		projectDto.setName(project.getName());
		projectDto.setBody(project.getBody());
		projectDto.setState(project.getState());
		projectDto.setVisibility(project.isVisibility());
		projectDto.setProjectRepository(GithubRepositoryMapper.toDTO(project.getGithubRepository()) );
		projectDto.setColumns(ColumnMapper.toListDTO(project.getColumnPs()));
		projectDtoList.add(projectDto);
		}
		return projectDtoList;
	}
	
}
