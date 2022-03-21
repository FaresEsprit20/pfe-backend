package com.github.workTimeMangementGithub.dto.github;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.github.workTimeMangementGithub.entities.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
public class IssueGithubDTO {

	private long id;
	private long issueNumber;
	private IssueType type;
	private String title;
	private String body;
	private IssueStatus status;
	private StateType state;
	private PriorityType priority;
	private ComplexityType complexity;
	private Date startDate;
	private Date endDate;
	private CardGithubDTO card;
	private GithubRepositoryGithubDTO repository;
	private String issueOwner;
	private List<LabelGithubDTO> labels = new ArrayList<>();
	private List<UserGithubDTO> assignees = new ArrayList<>();
	
}
