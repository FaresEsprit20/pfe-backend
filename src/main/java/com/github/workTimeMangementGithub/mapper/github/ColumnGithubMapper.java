package com.github.workTimeMangementGithub.mapper.github;

import java.util.ArrayList;
import java.util.List;

import com.github.workTimeMangementGithub.dto.github.ColumnGithubDTO;
import com.github.workTimeMangementGithub.entities.ColumnP;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ColumnGithubMapper {


    
	public static ColumnP toEntity(ColumnGithubDTO columnDto) {
		ColumnP columnP = new ColumnP();
		columnP.setId(columnDto.getId());
		columnP.setColumnName(columnDto.getColumnName());
		columnP.setCards(CardGithubMapper.toListEntity(columnDto.getCards()));
		return columnP;
		
	}
	
	public static List<ColumnP> toListEntity(List<ColumnGithubDTO> columnListDto) {
		List<ColumnP> columnList = new ArrayList<>();
		for(ColumnGithubDTO columnDto : columnListDto) {
			ColumnP columnP = new ColumnP();
			columnP.setId(columnDto.getId());
			columnP.setColumnName(columnDto.getColumnName());
			columnP.setCards( CardGithubMapper.toListEntity(columnDto.getCards()));
		}
	    return columnList;
	}
	
	public static ColumnGithubDTO toDTO(ColumnP columnP) {
		ColumnGithubDTO columnDto = new ColumnGithubDTO();
		columnDto.setId(columnP.getId());
		columnDto.setColumnName(columnP.getColumnName());
		columnDto.setCards(CardGithubMapper.toListDTO(columnP.getCards()));
		return columnDto;
	}
	
	public static List<ColumnGithubDTO> toListDTO(List<ColumnP> columnList) {
		List<ColumnGithubDTO> columnListDto = new ArrayList<>();
		for(ColumnP columnP : columnList) { 
		ColumnGithubDTO columnDto = new ColumnGithubDTO();
		columnDto.setId(columnP.getId());
		columnDto.setColumnName(columnP.getColumnName());
		columnDto.setCards(CardGithubMapper.toListDTO(columnP.getCards()));
		columnListDto.add(columnDto);
		}
		return columnListDto;
	}

	
}
