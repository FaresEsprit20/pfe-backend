package com.github.workTimeMangementGithub.dto;

import java.util.ArrayList;
import java.util.List;


import com.github.workTimeMangementGithub.entities.StateType;
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
public class ProjectDTO {

	private long id;
	private long projectNumber;
	private String name;
	private String body;
	private StateType state;
	private boolean visibility;
	private GithubRepositoryDTO projectRepository;
	private List<ColumnDTO> columns = new ArrayList<>();
	
}
