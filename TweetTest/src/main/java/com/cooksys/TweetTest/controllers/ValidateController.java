package com.cooksys.TweetTest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import com.cooksys.TweetTest.services.ValidateService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/validate")
public class ValidateController {
	
	private final ValidateService validateService;
	
	//GET validate/tag/exists/{label} - Checks whether or not a given hashtag exists.
	@GetMapping("/username/exists/{label}")
	public boolean checkTagExistence(@PathVariable String label) {
		return validateService.checkTagExistence(label);
	}
		
	//GET validate/username/exists/@{username} - Checks whether or not a given username exists.
	@GetMapping("/username/exists/{username}")
	public boolean checkUserExistence(@PathVariable String username) {
		return validateService.checkUserExistence(username);
	}
	
	//GET validate/username/available/@{username} - Checks whether or not a given username is available.
	@GetMapping("/username/available/{username}")
	public boolean checkUsernameAvailability(@PathVariable String username) {
		return validateService.checkUsernameAvailability(username);
	}

}
