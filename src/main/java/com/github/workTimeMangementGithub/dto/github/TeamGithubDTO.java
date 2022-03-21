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
public class TeamGithubDTO {

	private long id;
	private String name;
	private String slug;
	private String description;
	private List<UserGithubDTO> users = new ArrayList<>();
	
}
