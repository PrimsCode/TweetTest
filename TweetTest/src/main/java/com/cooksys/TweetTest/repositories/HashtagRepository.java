package com.cooksys.TweetTest.repositories;

import com.cooksys.TweetTest.entities.Hashtag;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HashtagRepository extends JpaRepository<Hashtag, Long> {
	
	Optional<Hashtag> findByLabel(String label);

}
