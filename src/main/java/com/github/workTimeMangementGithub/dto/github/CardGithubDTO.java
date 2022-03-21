package com.github.workTimeMangementGithub.dto.github;


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
public class CardGithubDTO {

	private long id;
	private long content_id;
	private String content_type ="Issue";
	private IssueGithubDTO issue;
	private ColumnGithubDTO column;	
	
}
