package com.github.workTimeMangementGithub.repositories;

import com.github.workTimeMangementGithub.entities.GithubRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface GithubRepositoryRepository extends JpaRepository<GithubRepository, Long> {
	//JPQL
	
}
