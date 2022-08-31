package com.cooksys.TweetTest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cooksys.TweetTest.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
//	Optional<User> findByUsername(String credentials.getUsername());

}