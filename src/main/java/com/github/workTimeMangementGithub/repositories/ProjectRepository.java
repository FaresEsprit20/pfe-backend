package com.github.workTimeMangementGithub.repositories;

import com.github.workTimeMangementGithub.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
	//JPQL
	
}
