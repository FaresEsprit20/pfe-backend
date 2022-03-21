package com.github.workTimeMangementGithub.mapper.github;

import java.util.ArrayList;
import java.util.List;

import com.github.workTimeMangementGithub.dto.github.IssueGithubDTO;
import com.github.workTimeMangementGithub.entities.Issue;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class IssueGithubMapper {


	
	public static Issue toEntity(IssueGithubDTO issueDto) {
		Issue issue = new Issue();
		issue.setId(issueDto.getId());
		issue.setIssueNumber(issueDto.getIssueNumber());
		issue.setType(issueDto.getType());
		issue.setTitle(issueDto.getTitle());
		issue.setBody(issueDto.getBody());
		issue.setStatus(issueDto.getStatus());
		issue.setState(issueDto.getState());
		issue.setPriority(issueDto.getPriority());
		issue.setComplexity(issueDto.getComplexity());
		issue.setStartDate(issueDto.getStartDate());
		issue.setEndDate(issueDto.getEndDate());
		issue.setCard(CardGithubMapper.toEntity(issueDto.getCard()));
		issue.setGithubRepository(GithubRepositoryGithubMapper.toEntity(issueDto.getRepository()));
		issue.setIssueOwner(issueDto.getIssueOwner());
		issue.setLabels(LabelGithubMapper.toListEntity(issueDto.getLabels()));
		issue.setAssignees(UserGithubMapper.toListEntity(issueDto.getAssignees()) );
		return issue;
	}
	
	public static List<Issue> toListEntity(List<IssueGithubDTO> issueListDto) {
		List<Issue> issueList = new ArrayList<>();
		for(IssueGithubDTO issueDto: issueListDto ) {
		Issue issue = new Issue();
		issue.setId(issueDto.getId());
		issue.setIssueNumber(issueDto.getIssueNumber());
		issue.setType(issueDto.getType());
		issue.setTitle(issueDto.getTitle());
		issue.setBody(issueDto.getBody());
		issue.setStatus(issueDto.getStatus());
		issue.setState(issueDto.getState());
		issue.setPriority(issueDto.getPriority());
		issue.setComplexity(issueDto.getComplexity());
		issue.setStartDate(issueDto.getStartDate());
		issue.setEndDate(issueDto.getEndDate());
		issue.setCard(CardGithubMapper.toEntity(issueDto.getCard()));
		issue.setGithubRepository(GithubRepositoryGithubMapper.toEntity(issueDto.getRepository()));
		issue.setIssueOwner(issueDto.getIssueOwner());
		issue.setLabels(LabelGithubMapper.toListEntity(issueDto.getLabels()));
		issue.setAssignees(UserGithubMapper.toListEntity(issueDto.getAssignees()));
		issueList.add(issue);
		}
		return issueList;
	}
	
	public static IssueGithubDTO toDTO(Issue issue) {
		IssueGithubDTO issueDto = new IssueGithubDTO();
		issueDto.setId(issue.getId());
		issueDto.setIssueNumber(issue.getIssueNumber());
		issueDto.setType(issue.getType());
		issueDto.setTitle(issue.getTitle());
		issueDto.setBody(issue.getBody());
		issueDto.setStatus(issue.getStatus());
		issueDto.setState(issue.getState());
		issueDto.setPriority(issue.getPriority());
		issueDto.setComplexity(issue.getComplexity());
		issueDto.setStartDate(issue.getStartDate());
		issueDto.setEndDate(issue.getEndDate());
		issueDto.setCard(CardGithubMapper.toDTO(issue.getCard()));
		issueDto.setRepository(GithubRepositoryGithubMapper.toDTO(issue.getGithubRepository()));
		issueDto.setIssueOwner(issue.getIssueOwner());
		issueDto.setLabels(LabelGithubMapper.toListDTO(issue.getLabels()) );
		issueDto.setAssignees(UserGithubMapper.toListDTO(issue.getAssignees()));
		return issueDto;
	}
	
	public static List<IssueGithubDTO> toListDTO(List<Issue> issueList) {
		List<IssueGithubDTO> issueListDto = new ArrayList<>();
		for(Issue issue : issueList) {
		IssueGithubDTO issueDto = new IssueGithubDTO();
		issueDto.setId(issue.getId());
		issueDto.setIssueNumber(issue.getIssueNumber());
		issueDto.setType(issue.getType());
		issueDto.setTitle(issue.getTitle());
		issueDto.setBody(issue.getBody());
		issueDto.setStatus(issue.getStatus());
		issueDto.setState(issue.getState());
		issueDto.setPriority(issue.getPriority());
		issueDto.setComplexity(issue.getComplexity());
		issueDto.setStartDate(issue.getStartDate());
		issueDto.setEndDate(issue.getEndDate());
		issueDto.setCard(CardGithubMapper.toDTO(issue.getCard()));
		issueDto.setRepository(GithubRepositoryGithubMapper.toDTO(issue.getGithubRepository()));
		issueDto.setIssueOwner(issue.getIssueOwner());
		issueDto.setLabels(LabelGithubMapper.toListDTO(issue.getLabels()));
		issueDto.setAssignees(UserGithubMapper.toListDTO(issue.getAssignees()));
		issueListDto.add(issueDto);
		}
		return issueListDto;
	}
	
	
}
