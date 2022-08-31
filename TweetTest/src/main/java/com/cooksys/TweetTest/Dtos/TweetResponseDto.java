package com.cooksys.TweetTest.Dtos;

import com.cooksys.TweetTest.entities.Tweet;
import com.cooksys.TweetTest.entities.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class TweetResponseDto {

    private long id;

    private User author;

    private Timestamp posted;

    private String content;

    private Tweet inReplyTo;

    private Tweet repostOf;

}
