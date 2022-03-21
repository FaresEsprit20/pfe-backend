package com.github.workTimeMangementGithub.dto;


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
public class CardDTO {

	private long id;
	private long content_id;
	private String content_type ="Issue";
	private IssueDTO issue;
	private ColumnDTO column;	
	
}
