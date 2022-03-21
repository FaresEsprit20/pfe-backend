package com.github.workTimeMangementGithub.mapper;

import java.util.ArrayList;
import java.util.List;


import com.github.workTimeMangementGithub.dto.IssueDTO;
import com.github.workTimeMangementGithub.entities.Issue;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class IssueMapper {


	
	public static Issue toEntity(IssueDTO issueDto) {
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
		issue.setCard(CardMapper.toEntity(issueDto.getCard()));
		issue.setGithubRepository(GithubRepositoryMapper.toEntity(issueDto.getRepository()));
		issue.setIssueOwner(issueDto.getIssueOwner());
		issue.setAttachements(AttachementMapper.toListEntity(issueDto.getAttachements()) );
		issue.setLabels(LabelMapper.toListEntity(issueDto.getLabels()));
		issue.setAssignees(UserMapper.toListEntity(issueDto.getAssignees()) );
		return issue;
	}
	
	public static List<Issue> toListEntity(List<IssueDTO> issueListDto) {
		List<Issue> issueList = new ArrayList<>();
		for(IssueDTO issueDto: issueListDto ) {
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
		issue.setCard(CardMapper.toEntity(issueDto.getCard()));
		issue.setGithubRepository(GithubRepositoryMapper.toEntity(issueDto.getRepository()));
		issue.setIssueOwner(issueDto.getIssueOwner());
		issue.setAttachements(AttachementMapper.toListEntity(issueDto.getAttachements()));
		issue.setLabels(LabelMapper.toListEntity(issueDto.getLabels()));
		issue.setAssignees(UserMapper.toListEntity(issueDto.getAssignees()));
		issueList.add(issue);
		}
		return issueList;
	}
	
	public static IssueDTO toDTO(Issue issue) {
		IssueDTO issueDto = new IssueDTO();
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
		issueDto.setCard(CardMapper.toDTO(issue.getCard()));
		issueDto.setRepository(GithubRepositoryMapper.toDTO(issue.getGithubRepository()));
		issueDto.setIssueOwner(issue.getIssueOwner());
		issueDto.setAttachements(AttachementMapper.toListDTO(issue.getAttachements()));
		issueDto.setLabels(LabelMapper.toListDTO(issue.getLabels()) );
		issueDto.setAssignees(UserMapper.toListDTO(issue.getAssignees()));
		return issueDto;
	}
	
	public static List<IssueDTO> toListDTO(List<Issue> issueList) {
		List<IssueDTO> issueListDto = new ArrayList<>();
		for(Issue issue : issueList) {
		IssueDTO issueDto = new IssueDTO();
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
		issueDto.setCard(CardMapper.toDTO(issue.getCard()));
		issueDto.setRepository(GithubRepositoryMapper.toDTO(issue.getGithubRepository()));
		issueDto.setIssueOwner(issue.getIssueOwner());
		issueDto.setAttachements(AttachementMapper.toListDTO(issue.getAttachements()));
		issueDto.setLabels(LabelMapper.toListDTO(issue.getLabels()));
		issueDto.setAssignees(UserMapper.toListDTO(issue.getAssignees()));
		issueListDto.add(issueDto);
		}
		return issueListDto;
	}
	
	
}
