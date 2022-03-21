package com.github.workTimeMangementGithub.dto;

import java.util.ArrayList;
import java.util.List;


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
public class LabelDTO {

	private long id;
	private String labelName;
	private String labelColor;
	private List<IssueDTO> issues = new ArrayList<>();
	
}
