package com.cooksys.TweetTest.services.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import com.cooksys.TweetTest.entities.Hashtag;
import com.cooksys.TweetTest.entities.User;
import com.cooksys.TweetTest.repositories.HashtagRepository;
import com.cooksys.TweetTest.repositories.UserRepository;
import com.cooksys.TweetTest.services.ValidateService;

@Service
@RequiredArgsConstructor
public class ValidateServiceImpl implements ValidateService {
	
	private final HashtagRepository hashtagRepository;
	private final UserRepository userRepository;

	@Override
	public boolean checkTagExistence(String label) {
//		Optional<Hashtag> optionalHashtag = hashtagRepository.findByLabel(label);
//		
//		if(optionalHashtag != null) {
//			return true;
//		}
		return false;
	}

	//Checks whether a given username exists - boolean
	@Override
	public boolean checkUserExistence(String username) {
//		Optional<User> optionalUser = userRepository.findByUsername(username);
//		if(optionalUser != null) {
//			return true;
//		}
		return false;
	}
	
	
	//Checks whether a given username is available - boolean
	@Override
	public boolean checkUsernameAvailability(String username) {
//		Optional<User> optionalUser = userRepository.findByUsername(username);
//		if (optionalUser != null) {
//			return false;
//		}
		return true;
	}

}
