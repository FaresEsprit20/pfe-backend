package com.github.workTimeMangementGithub.mapper.github;

import java.util.ArrayList;
import java.util.List;

import com.github.workTimeMangementGithub.dto.github.TeamGithubDTO;
import com.github.workTimeMangementGithub.entities.Team;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TeamGithubMapper {


	
	public static Team toEntity(TeamGithubDTO teamDto) {
		Team team = new Team();
		team.setId(teamDto.getId());
		team.setName(teamDto.getName());
		team.setSlug(teamDto.getSlug());
		team.setDescription(teamDto.getDescription());
		team.setUsers(UserGithubMapper.toListEntity(teamDto.getUsers()));
		return team;
	}
	
	public static List<Team> toListEntity(List<TeamGithubDTO> teamListDto) {
		List<Team> teamList = new ArrayList<>();
		for(TeamGithubDTO teamDto : teamListDto ) {
		Team team = new Team();
		team.setId(teamDto.getId());
		team.setName(teamDto.getName());
		team.setSlug(teamDto.getSlug());
		team.setDescription(teamDto.getDescription());
		team.setUsers(UserGithubMapper.toListEntity(teamDto.getUsers()));
		teamList.add(team);
		}
		return teamList;
	}
	
	public static TeamGithubDTO toDTO(Team team) {
		TeamGithubDTO teamDto = new TeamGithubDTO();
		teamDto.setId(team.getId());
		teamDto.setName(team.getName());
		teamDto.setSlug(team.getSlug());
		teamDto.setDescription(team.getDescription());
		teamDto.setUsers(UserGithubMapper.toListDTO(team.getUsers()));
		return teamDto;
	}
	
	public static List<TeamGithubDTO> toListDTO(List<Team> teamList) {
		List<TeamGithubDTO> teamListDto = new ArrayList<>();
		for(Team team : teamList) {
		TeamGithubDTO teamDto = new TeamGithubDTO();
		teamDto.setId(team.getId());
		teamDto.setName(team.getName());
		teamDto.setSlug(team.getSlug());
		teamDto.setDescription(team.getDescription());
		teamDto.setUsers(UserGithubMapper.toListDTO(team.getUsers()));
		teamListDto.add(teamDto);
		}
		return teamListDto;
	}
	
	
}
