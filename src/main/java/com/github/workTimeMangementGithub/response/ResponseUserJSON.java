package com.github.workTimeMangementGithub.response;


import java.util.ArrayList;
import java.util.List;

import com.github.workTimeMangementGithub.dto.UserDTO;
import com.github.workTimeMangementGithub.dto.github.UserGithubDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class ResponseUserJSON {

	String message;
	int status_code;
	List<UserGithubDTO> bodyGithub = new ArrayList<UserGithubDTO>();
	List<UserDTO> body = new ArrayList<UserDTO>();
	
	
	
	
	
	
}
