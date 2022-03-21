package com.github.workTimeMangementGithub.dto;

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
public class ColumnDTO {

	private long id;
	private IssueStatus columnName;
    private List<CardDTO> cards = new ArrayList<>();
    private ProjectDTO project;
	
}
