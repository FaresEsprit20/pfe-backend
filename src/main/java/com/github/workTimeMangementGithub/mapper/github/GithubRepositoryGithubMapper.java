package com.github.workTimeMangementGithub.mapper.github;

import java.util.ArrayList;
import java.util.List;


import com.github.workTimeMangementGithub.dto.github.GithubRepositoryGithubDTO;
import com.github.workTimeMangementGithub.entities.GithubRepository;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class GithubRepositoryGithubMapper {

	/*private long id;
	private String repositoryName;
	private String repositoryUrl;
	private List<Issue> issues = new ArrayList<>();*/
	
	public static GithubRepository toEntity(GithubRepositoryGithubDTO githubRepositoryDto) {
	
		GithubRepository githubRepository = new GithubRepository();
		githubRepository.setId(githubRepositoryDto.getId());
		githubRepository.setRepositoryName(githubRepositoryDto.getRepositoryName());
		githubRepository.setRepositoryUrl(githubRepositoryDto.getRepositoryUrl());
		githubRepository.setIssues(IssueGithubMapper.toListEntity(githubRepositoryDto.getIssues()) );
		return githubRepository;
	}
	
	public static List<GithubRepository> toListEntity(List<GithubRepositoryGithubDTO> githubRepositoryListDto) {
		List<GithubRepository> githubRepositoryList = new ArrayList<>();
		for(GithubRepositoryGithubDTO githubRepositoryDto : githubRepositoryListDto) {
		GithubRepository githubRepository = new GithubRepository();
		githubRepository.setId(githubRepositoryDto.getId());
		githubRepository.setRepositoryName(githubRepositoryDto.getRepositoryName());
		githubRepository.setRepositoryUrl(githubRepositoryDto.getRepositoryUrl());
		githubRepository.setIssues(IssueGithubMapper.toListEntity(githubRepositoryDto.getIssues()) );
	    githubRepositoryList.add(githubRepository);
		}
		return githubRepositoryList;
	}
	
	public static GithubRepositoryGithubDTO toDTO(GithubRepository githubRepository) {
		
		GithubRepositoryGithubDTO githubRepositoryDto = new GithubRepositoryGithubDTO();
		githubRepositoryDto.setId(githubRepository.getId());
		githubRepositoryDto.setRepositoryName(githubRepository.getRepositoryName());
		githubRepositoryDto.setRepositoryUrl(githubRepository.getRepositoryUrl());
		githubRepositoryDto.setIssues(IssueGithubMapper.toListDTO(githubRepository.getIssues()));
		return githubRepositoryDto;
	}
	
    public static List<GithubRepositoryGithubDTO> toDTO(List<GithubRepository> githubRepositoryList) {
    	List<GithubRepositoryGithubDTO> githubRepositoryListDto = new ArrayList<>();
    	for(GithubRepository githubRepository : githubRepositoryList ) {
		GithubRepositoryGithubDTO githubRepositoryDto = new GithubRepositoryGithubDTO();
		githubRepositoryDto.setId(githubRepository.getId());
		githubRepositoryDto.setRepositoryName(githubRepository.getRepositoryName());
		githubRepositoryDto.setRepositoryUrl(githubRepository.getRepositoryUrl());
		githubRepositoryDto.setIssues(IssueGithubMapper.toListDTO(githubRepository.getIssues()));
    	githubRepositoryListDto.add(githubRepositoryDto);
    	}
		return githubRepositoryListDto;
	}
	
}
