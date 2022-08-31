package com.cooksys.TweetTest.mappers;

import com.cooksys.TweetTest.Dtos.CredentialsDto;
import com.cooksys.TweetTest.entities.Credentials;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CredentialsMapper {

    CredentialsDto entityToDto(Credentials entity);

    Credentials requestDtoToEntity(CredentialsDto credentialsDto);
}
