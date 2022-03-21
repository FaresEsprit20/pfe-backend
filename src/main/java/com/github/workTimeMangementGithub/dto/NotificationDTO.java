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
public class NotificationDTO {

	private long id;
	private String title;
	private String type;
	private String body;
	private String from;
	private List<UserDTO> users = new ArrayList<>();
	
}
