package com.github.workTimeMangementGithub.mapper;

import java.util.ArrayList;
import java.util.List;

import com.github.workTimeMangementGithub.dto.AttachementDTO;
import com.github.workTimeMangementGithub.entities.Attachement;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AttachementMapper {


	public static Attachement toEntity(AttachementDTO attachementDto) {
		Attachement attachement = new Attachement();
		attachement.setId(attachementDto.getId());
		attachement.setAttachementName(attachementDto.getAttachementName());
		//attachement.setIssue(IssueMapper.toEntity(attachementDto.getIssue()));
		return attachement;
	}
	
	public static List<Attachement> toListEntity(List<AttachementDTO> attachementListDto) {
		List<Attachement> attachementList = new ArrayList<>();
		for(AttachementDTO attachementDto : attachementListDto) {
		Attachement attachement = new Attachement();
		attachement.setId(attachementDto.getId());
		attachement.setAttachementName(attachementDto.getAttachementName());
		//attachement.setIssue(IssueMapper.toEntity(attachementDto.getIssue()));
		attachementList.add(attachement);
		}
       return attachementList;
	}
	
	public static AttachementDTO toDTO(Attachement attachement) {
		AttachementDTO attachementDto = new AttachementDTO();
		attachementDto.setId(attachement.getId());
		attachementDto.setAttachementName(attachement.getAttachementName());
		//attachementDto.setIssue(IssueMapper.toDTO(attachement.getIssue()));
		return attachementDto;
	}
	
	public static List<AttachementDTO> toListDTO(List<Attachement> attachementList) {
		List<AttachementDTO> attachementListDto = new ArrayList<>();
		AttachementDTO attachementDto = new AttachementDTO();
		for(Attachement attachement : attachementList) {
			attachementDto.setId(attachement.getId());
			attachementDto.setAttachementName(attachement.getAttachementName());
			//attachementDto.setIssue(IssueMapper.toDTO(attachement.getIssue()));
			attachementListDto.add(attachementDto);
		}
		return attachementListDto;
	}
	
}
