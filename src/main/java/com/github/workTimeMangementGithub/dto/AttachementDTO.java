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
public class AttachementDTO {

	 private long id;
	 private String attachementName;
	 private IssueDTO issue;
	
	
}
