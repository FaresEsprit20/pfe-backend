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
public class NotificationGithubDTO {

	private long id;
	private String title;
	private String type;
	private String body;
	private String from;
	private List<UserGithubDTO> users = new ArrayList<>();
	
}
