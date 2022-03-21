package com.github.workTimeMangementGithub.mapper;

import java.util.ArrayList;
import java.util.List;


import com.github.workTimeMangementGithub.dto.LabelDTO;
import com.github.workTimeMangementGithub.entities.Label;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LabelMapper {


	
	public static Label toEntity(LabelDTO labelDto) {
		Label label = new Label();
		label.setId(labelDto.getId());
		label.setLabelName(labelDto.getLabelName());
		label.setLabelColor(labelDto.getLabelColor());
		label.setIssues(IssueMapper.toListEntity(labelDto.getIssues()));
		return label;
	}
	
	public static List<Label> toListEntity(List<LabelDTO> labelListDto) {
		List<Label> labelList = new ArrayList<>();
		for(LabelDTO labelDto : labelListDto) {
			Label label = new Label();
			label.setId(labelDto.getId());
			label.setLabelName(labelDto.getLabelName());
			label.setLabelColor(labelDto.getLabelColor());
			label.setIssues(IssueMapper.toListEntity(labelDto.getIssues()));
		}
		return labelList;
	}
	
	public static LabelDTO toDTO(Label label) {
		LabelDTO labelDto = new LabelDTO();
		labelDto.setId(label.getId());
		labelDto.setLabelName(label.getLabelName());
		labelDto.setLabelColor(label.getLabelColor());
		labelDto.setIssues(IssueMapper.toListDTO(label.getIssues()));
		return labelDto;
	}
	
	public static List<LabelDTO> toListDTO(List<Label> labelList) {
		List<LabelDTO> labelListDto = new ArrayList<>();
		for(Label label : labelList) {
			LabelDTO labelDto = new LabelDTO();
			labelDto.setId(label.getId());
			labelDto.setLabelName(label.getLabelName());
			labelDto.setLabelColor(label.getLabelColor());
			labelDto.setIssues(IssueMapper.toListDTO(label.getIssues()));
			labelListDto.add(labelDto);
		}
		return labelListDto;
	}
	
	
	
	
}
