package com.github.workTimeMangementGithub.mapper;

import java.util.ArrayList;
import java.util.List;


import com.github.workTimeMangementGithub.dto.NotificationDTO;
import com.github.workTimeMangementGithub.entities.Notification;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NotificationMapper {

	/*private long id;
	private String title;
	private String type;
	private String body;
	private User from;
	private List<User> users = new ArrayList<>();*/
	
	public static Notification toEntity(NotificationDTO notificationDto) {
		Notification notification = new Notification();
		notification.setId(notificationDto.getId());
		notification.setTitle(notificationDto.getTitle());
		notification.setType(notificationDto.getType());
		notification.setBody(notificationDto.getBody());
		notification.setFrom(notificationDto.getFrom());
		notification.setUsers(UserMapper.toListEntity(notificationDto.getUsers()));
		return notification;
	}
	
	public static List<Notification> toListEntity(List<NotificationDTO> notificationListDto) {
		List<Notification> notificationList = new ArrayList<>();
		for(NotificationDTO notificationDto : notificationListDto) {
		Notification notification = new Notification();
		notification.setId(notificationDto.getId());
		notification.setTitle(notificationDto.getTitle());
		notification.setType(notificationDto.getType());
		notification.setBody(notificationDto.getBody());
		notification.setFrom(notificationDto.getFrom());
		notification.setUsers(UserMapper.toListEntity(notificationDto.getUsers()));
		notificationList.add(notification);
		}
		return notificationList;
	}
	
	public static NotificationDTO toDTO(Notification notification) {
		NotificationDTO notificationDto = new NotificationDTO();
		notificationDto.setId(notification.getId());
		notificationDto.setTitle(notification.getTitle());
		notificationDto.setType(notification.getType());
		notificationDto.setBody(notification.getBody());
		notificationDto.setFrom(notification.getFrom());
		notification.setUsers(UserMapper.toListEntity(notificationDto.getUsers()));
		return notificationDto;
	}
	
	public static List<NotificationDTO> toListDTO(List<Notification> notificationList) {
		List<NotificationDTO> notificationListDto = new ArrayList<>();
		for(Notification notification : notificationList) {
		NotificationDTO notificationDto = new NotificationDTO();
		notificationDto.setId(notification.getId());
		notificationDto.setTitle(notification.getTitle());
		notificationDto.setType(notification.getType());
		notificationDto.setBody(notification.getBody());
		notificationDto.setFrom(notification.getFrom());
		notification.setUsers(UserMapper.toListEntity(notificationDto.getUsers()));
		notificationListDto.add(notificationDto);
		}
		return notificationListDto;
	}
	
}
