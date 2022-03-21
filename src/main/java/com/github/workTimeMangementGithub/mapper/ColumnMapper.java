package com.github.workTimeMangementGithub.mapper;

import java.util.ArrayList;
import java.util.List;


import com.github.workTimeMangementGithub.dto.ColumnDTO;
import com.github.workTimeMangementGithub.entities.ColumnP;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ColumnMapper {


	public static ColumnP toEntity(ColumnDTO columnDto) {
		ColumnP columnP = new ColumnP();
		columnP.setId(columnDto.getId());
		columnP.setColumnName(columnDto.getColumnName());
		columnP.setCards(CardMapper.toListEntity(columnDto.getCards()));
		return columnP;
		
	}
	
	public static List<ColumnP> toListEntity(List<ColumnDTO> columnListDto) {
		List<ColumnP> columnList = new ArrayList<>();
		for(ColumnDTO columnDto : columnListDto) {
			ColumnP columnP = new ColumnP();
			columnP.setId(columnDto.getId());
			columnP.setColumnName(columnDto.getColumnName());
			columnP.setCards( CardMapper.toListEntity(columnDto.getCards()));
		}
	    return columnList;
	}
	
	public static ColumnDTO toDTO(ColumnP columnP) {
		ColumnDTO columnDto = new ColumnDTO();
		columnDto.setId(columnP.getId());
		columnDto.setColumnName(columnP.getColumnName());
		columnDto.setCards(CardMapper.toListDTO(columnP.getCards()));
		return columnDto;
	}
	
	public static List<ColumnDTO> toListDTO(List<ColumnP> columnList) {
		List<ColumnDTO> columnListDto = new ArrayList<>();
		for(ColumnP columnP : columnList) { 
		ColumnDTO columnDto = new ColumnDTO();
		columnDto.setId(columnP.getId());
		columnDto.setColumnName(columnP.getColumnName());
		columnDto.setCards(CardMapper.toListDTO(columnP.getCards()));
		columnListDto.add(columnDto);
		}
		return columnListDto;
	}
	
}
