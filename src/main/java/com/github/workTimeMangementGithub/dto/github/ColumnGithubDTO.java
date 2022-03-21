package com.github.workTimeMangementGithub.dto.github;

import java.util.ArrayList;
import java.util.List;


import com.github.workTimeMangementGithub.entities.IssueStatus;
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
public class ColumnGithubDTO {

	private long id;
	private IssueStatus columnName;
    private List<CardGithubDTO> cards = new ArrayList<>();
    private ProjectGithubDTO project;
	
}
