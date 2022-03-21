package com.github.workTimeMangementGithub.repositories;

import com.github.workTimeMangementGithub.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	//JPQL

}
