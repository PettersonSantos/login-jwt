package com.example.mappers;

import com.example.data.UsersDto;
import com.example.entity.Users;
import org.mapstruct.Mapper;

@Mapper
public interface Mappers {
    UsersDto userToUserDto(Users users);
    Users userDtoToUser(UsersDto dto);
}
