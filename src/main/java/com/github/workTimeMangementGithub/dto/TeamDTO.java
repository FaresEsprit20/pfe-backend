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
public class TeamDTO {

	private long id;
	private String name;
	private String slug;
	private String description;
	private List<UserDTO> users = new ArrayList<>();
	
}
