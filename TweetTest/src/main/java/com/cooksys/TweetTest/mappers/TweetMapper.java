package com.cooksys.TweetTest.mappers;

import java.util.List;
import com.cooksys.TweetTest.Dtos.TweetRequestDto;
import com.cooksys.TweetTest.Dtos.TweetResponseDto;
import com.cooksys.TweetTest.entities.Tweet;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {UserMapper.class} )
public interface TweetMapper {

//    TweetRequestDto entityToDto(Tweet entity);
    TweetResponseDto entityToDto(Tweet entity);
    Tweet requestDtoToEntity(TweetRequestDto tweetRequestDto);

    //THEORY: Grabs List of replies, other tweets, ect...
    List<TweetResponseDto> entitiesToDtos(List<Tweet> entities);

}
