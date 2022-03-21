package com.github.workTimeMangementGithub.dto.github;

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
public class LabelGithubDTO {

	private long id;
	private String labelName;
	private String labelColor;
	private List<IssueGithubDTO> issues = new ArrayList<>();
	
}
