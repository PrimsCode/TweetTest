package com.cooksys.TweetTest.Dtos;

import com.cooksys.TweetTest.entities.Tweet;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class ContextDto {

    private Tweet target;

    private List<Tweet> before;

    private List<Tweet> after;

}
