package com.cooksys.TweetTest.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class NotFoundException extends RuntimeException{


	/**
	 * 
	 */
	private static final long serialVersionUID = 8846516272852478216L;

	private String message;
}
