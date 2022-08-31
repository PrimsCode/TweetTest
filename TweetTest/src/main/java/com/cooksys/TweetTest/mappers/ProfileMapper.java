package com.cooksys.TweetTest.mappers;

import com.cooksys.TweetTest.Dtos.ProfileDto;
import com.cooksys.TweetTest.entities.Profile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CredentialsMapper.class} )
public interface ProfileMapper {

    ProfileDto entityToDto(Profile entity);

    Profile requestDtoToEntity(ProfileDto profileDto);

}
