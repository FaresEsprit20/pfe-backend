package com.github.workTimeMangementGithub.repositories;

import com.github.workTimeMangementGithub.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

	//JPQL
	
}
