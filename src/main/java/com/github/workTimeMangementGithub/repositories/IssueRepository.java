package com.github.workTimeMangementGithub.repositories;

import com.github.workTimeMangementGithub.entities.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {
	//JPQL
	
}
