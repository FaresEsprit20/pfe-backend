package com.github.workTimeMangementGithub.mapper.github;

import java.util.ArrayList;
import java.util.List;


import com.github.workTimeMangementGithub.dto.github.LabelGithubDTO;
import com.github.workTimeMangementGithub.entities.Label;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LabelGithubMapper {


	
	public static Label toEntity(LabelGithubDTO labelDto) {
		Label label = new Label();
		label.setId(labelDto.getId());
		label.setLabelName(labelDto.getLabelName());
		label.setLabelColor(labelDto.getLabelColor());
		label.setIssues(IssueGithubMapper.toListEntity(labelDto.getIssues()));
		return label;
	}
	
	public static List<Label> toListEntity(List<LabelGithubDTO> labelListDto) {
		List<Label> labelList = new ArrayList<>();
		for(LabelGithubDTO labelDto : labelListDto) {
			Label label = new Label();
			label.setId(labelDto.getId());
			label.setLabelName(labelDto.getLabelName());
			label.setLabelColor(labelDto.getLabelColor());
			label.setIssues(IssueGithubMapper.toListEntity(labelDto.getIssues()));
		}
		return labelList;
	}
	
	public static LabelGithubDTO toDTO(Label label) {
		LabelGithubDTO labelDto = new LabelGithubDTO();
		labelDto.setId(label.getId());
		labelDto.setLabelName(label.getLabelName());
		labelDto.setLabelColor(label.getLabelColor());
		labelDto.setIssues(IssueGithubMapper.toListDTO(label.getIssues()));
		return labelDto;
	}
	
	public static List<LabelGithubDTO> toListDTO(List<Label> labelList) {
		List<LabelGithubDTO> labelListDto = new ArrayList<>();
		for(Label label : labelList) {
			LabelGithubDTO labelDto = new LabelGithubDTO();
			labelDto.setId(label.getId());
			labelDto.setLabelName(label.getLabelName());
			labelDto.setLabelColor(label.getLabelColor());
			labelDto.setIssues(IssueGithubMapper.toListDTO(label.getIssues()));
			labelListDto.add(labelDto);
		}
		return labelListDto;
	}
	
	
	
	
}
