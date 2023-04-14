package com.berat.mapper;

import com.berat.dto.request.MovieCommentCreateRequestDto;
import com.berat.dto.request.UserResgisterRequestDto;
import com.berat.dto.response.LoginResponseDto;
import com.berat.repository.entity.MovieComment;
import com.berat.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {

    IUserMapper INSTANCE= Mappers.getMapper(IUserMapper.class);

    User toUser(final UserResgisterRequestDto dto);

    LoginResponseDto toLoginResponseDto(final User user);

    MovieComment toMovieComment(final MovieCommentCreateRequestDto dto);
}
