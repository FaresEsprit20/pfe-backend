package com.github.workTimeMangementGithub.repositories;

import com.github.workTimeMangementGithub.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
	//JPQL
	
}
