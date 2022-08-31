package com.cooksys.TweetTest.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class NotAuthorizedException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5073607775524307536L;

	private String message;

}
