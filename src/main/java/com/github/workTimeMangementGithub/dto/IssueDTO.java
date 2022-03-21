package com.github.workTimeMangementGithub.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.github.workTimeMangementGithub.entities.*;
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
public class IssueDTO {

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
	private CardDTO card;
	private GithubRepositoryDTO repository;
	private String issueOwner;
	private List<AttachementDTO> attachements = new ArrayList<>();
	private List<LabelDTO> labels = new ArrayList<>();
	private List<UserDTO> assignees = new ArrayList<>();
	
}
