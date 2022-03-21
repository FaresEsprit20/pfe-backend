package com.github.workTimeMangementGithub.repositories;

import com.github.workTimeMangementGithub.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
	//JPQL
	
}
