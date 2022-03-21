package com.github.workTimeMangementGithub.mapper;

import java.util.ArrayList;
import java.util.List;


import com.github.workTimeMangementGithub.dto.TeamDTO;
import com.github.workTimeMangementGithub.entities.Team;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TeamMapper {

	
	public static Team toEntity(TeamDTO teamDto) {
		Team team = new Team();
		team.setId(teamDto.getId());
		team.setName(teamDto.getName());
		team.setSlug(teamDto.getSlug());
		team.setDescription(teamDto.getDescription());
		team.setUsers(UserMapper.toListEntity(teamDto.getUsers()));
		return team;
	}
	
	public static List<Team> toListEntity(List<TeamDTO> teamListDto) {
		List<Team> teamList = new ArrayList<>();
		for(TeamDTO teamDto : teamListDto ) {
		Team team = new Team();
		team.setId(teamDto.getId());
		team.setName(teamDto.getName());
		team.setSlug(teamDto.getSlug());
		team.setDescription(teamDto.getDescription());
		team.setUsers(UserMapper.toListEntity(teamDto.getUsers()));
		teamList.add(team);
		}
		return teamList;
	}
	
	public static TeamDTO toDTO(Team team) {
		TeamDTO teamDto = new TeamDTO();
		teamDto.setId(team.getId());
		teamDto.setName(team.getName());
		teamDto.setSlug(team.getSlug());
		teamDto.setDescription(team.getDescription());
		teamDto.setUsers(UserMapper.toListDTO(team.getUsers()));
		return teamDto;
	}
	
	public static List<TeamDTO> toListDTO(List<Team> teamList) {
		List<TeamDTO> teamListDto = new ArrayList<>();
		for(Team team : teamList) {
		TeamDTO teamDto = new TeamDTO();
		teamDto.setId(team.getId());
		teamDto.setName(team.getName());
		teamDto.setSlug(team.getSlug());
		teamDto.setDescription(team.getDescription());
		teamDto.setUsers(UserMapper.toListDTO(team.getUsers()));
		teamListDto.add(teamDto);
		}
		return teamListDto;
	}
	
	
}
