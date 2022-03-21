package com.github.workTimeMangementGithub.mapper.github;

import java.util.ArrayList;
import java.util.List;


import com.github.workTimeMangementGithub.dto.github.NotificationGithubDTO;
import com.github.workTimeMangementGithub.entities.Notification;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NotificationGithubMapper {


	
	public static Notification toEntity(NotificationGithubDTO notificationDto) {
		Notification notification = new Notification();
		notification.setId(notificationDto.getId());
		notification.setTitle(notificationDto.getTitle());
		notification.setType(notificationDto.getType());
		notification.setBody(notificationDto.getBody());
		notification.setFrom(notificationDto.getFrom());
		notification.setUsers(UserGithubMapper.toListEntity(notificationDto.getUsers()));
		return notification;
	}
	
	public static List<Notification> toListEntity(List<NotificationGithubDTO> notificationListDto) {
		List<Notification> notificationList = new ArrayList<>();
		for(NotificationGithubDTO notificationDto : notificationListDto) {
		Notification notification = new Notification();
		notification.setId(notificationDto.getId());
		notification.setTitle(notificationDto.getTitle());
		notification.setType(notificationDto.getType());
		notification.setBody(notificationDto.getBody());
		notification.setFrom(notificationDto.getFrom());
		notification.setUsers(UserGithubMapper.toListEntity(notificationDto.getUsers()));
		notificationList.add(notification);
		}
		return notificationList;
	}
	
	public static NotificationGithubDTO toDTO(Notification notification) {
		NotificationGithubDTO notificationDto = new NotificationGithubDTO();
		notificationDto.setId(notification.getId());
		notificationDto.setTitle(notification.getTitle());
		notificationDto.setType(notification.getType());
		notificationDto.setBody(notification.getBody());
		notificationDto.setFrom(notification.getFrom());
		notification.setUsers(UserGithubMapper.toListEntity(notificationDto.getUsers()));
		return notificationDto;
	}
	
	public static List<NotificationGithubDTO> toListDTO(List<Notification> notificationList) {
		List<NotificationGithubDTO> notificationListDto = new ArrayList<>();
		for(Notification notification : notificationList) {
		NotificationGithubDTO notificationDto = new NotificationGithubDTO();
		notificationDto.setId(notification.getId());
		notificationDto.setTitle(notification.getTitle());
		notificationDto.setType(notification.getType());
		notificationDto.setBody(notification.getBody());
		notificationDto.setFrom(notification.getFrom());
		notification.setUsers(UserGithubMapper.toListEntity(notificationDto.getUsers()));
		notificationListDto.add(notificationDto);
		}
		return notificationListDto;
	}
	
}
