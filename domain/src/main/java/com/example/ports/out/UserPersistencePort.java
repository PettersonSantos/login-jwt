package com.example.ports.out;

import com.example.data.UsersDto;

public interface UserPersistencePort {
    UsersDto addUsers(UsersDto dto);
    UsersDto findByUsername(String username);
}
