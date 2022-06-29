package com.example.adapters;

import com.example.data.UsersDto;
import com.example.entity.Users;
import com.example.mappers.UserMappers;
import com.example.ports.on.UserPersistencePort;
import com.example.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPersistenceAdapter implements UserPersistencePort {

    @Autowired
    private UsersRepository repository;

    @Override
    public UsersDto addUsers(UsersDto dto) {
        Users us= UserMappers.INSTANCE.userDtoToUser(dto);
        return UserMappers.INSTANCE.userToUserDto(repository.save(us));
    }

    @Override
    public UsersDto findByUsername(String username) {
        return UserMappers.INSTANCE.userToUserDto(repository.findByUsername(username));
    }
}
