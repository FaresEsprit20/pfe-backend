package com.github.workTimeMangementGithub.mapper;

import java.util.ArrayList;
import java.util.List;

import com.github.workTimeMangementGithub.dto.GithubRepositoryDTO;
import com.github.workTimeMangementGithub.entities.GithubRepository;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class GithubRepositoryMapper {

	/*private long id;
	private String repositoryName;
	private String repositoryUrl;
	private List<Issue> issues = new ArrayList<>();*/
	
	public static GithubRepository toEntity(GithubRepositoryDTO githubRepositoryDto) {
	
		GithubRepository githubRepository = new GithubRepository();
		githubRepository.setId(githubRepositoryDto.getId());
		githubRepository.setRepositoryName(githubRepositoryDto.getRepositoryName());
		githubRepository.setRepositoryUrl(githubRepositoryDto.getRepositoryUrl());
		githubRepository.setIssues(IssueMapper.toListEntity(githubRepositoryDto.getIssues()) );
		githubRepository.setRepositoryProjects(ProjectMapper.toListEntity(githubRepositoryDto.getRepositoryProjects()));
		return githubRepository;
	}
	
	public static List<GithubRepository> toListEntity(List<GithubRepositoryDTO> githubRepositoryListDto) {
		List<GithubRepository> githubRepositoryList = new ArrayList<>();
		for(GithubRepositoryDTO githubRepositoryDto : githubRepositoryListDto) {
		GithubRepository githubRepository = new GithubRepository();
		githubRepository.setId(githubRepositoryDto.getId());
		githubRepository.setRepositoryName(githubRepositoryDto.getRepositoryName());
		githubRepository.setRepositoryUrl(githubRepositoryDto.getRepositoryUrl());
		githubRepository.setIssues(IssueMapper.toListEntity(githubRepositoryDto.getIssues()) );
	    githubRepositoryList.add(githubRepository);
		}
		return githubRepositoryList;
	}
	
	public static GithubRepositoryDTO toDTO(GithubRepository githubRepository) {
		
		GithubRepositoryDTO githubRepositoryDto = new GithubRepositoryDTO();
		githubRepositoryDto.setId(githubRepository.getId());
		githubRepositoryDto.setRepositoryName(githubRepository.getRepositoryName());
		githubRepositoryDto.setRepositoryUrl(githubRepository.getRepositoryUrl());
		githubRepositoryDto.setIssues(IssueMapper.toListDTO(githubRepository.getIssues()));
		return githubRepositoryDto;
	}
	
    public static List<GithubRepositoryDTO> toDTO(List<GithubRepository> githubRepositoryList) {
    	List<GithubRepositoryDTO> githubRepositoryListDto = new ArrayList<>();
    	for(GithubRepository githubRepository : githubRepositoryList ) {
		GithubRepositoryDTO githubRepositoryDto = new GithubRepositoryDTO();
		githubRepositoryDto.setId(githubRepository.getId());
		githubRepositoryDto.setRepositoryName(githubRepository.getRepositoryName());
		githubRepositoryDto.setRepositoryUrl(githubRepository.getRepositoryUrl());
		githubRepositoryDto.setIssues(IssueMapper.toListDTO(githubRepository.getIssues()));
    	githubRepositoryListDto.add(githubRepositoryDto);
    	}
		return githubRepositoryListDto;
	}
	
}
