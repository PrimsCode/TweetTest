package com.cooksys.TweetTest.mappers;

import com.cooksys.TweetTest.Dtos.UserResponseDto;
import com.cooksys.TweetTest.entities.User;

import java.util.List;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ProfileMapper.class} )
public interface UserMapper {
    UserResponseDto entityToDto(User entity);

    List<UserResponseDto> entitiesToDtos(List<User> entities);

}
