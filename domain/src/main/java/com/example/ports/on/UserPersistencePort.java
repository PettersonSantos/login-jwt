package com.example.ports.on;

import com.example.data.UsersDto;

public interface UserPersistencePort {
    UsersDto addUsers(UsersDto dto);
    UsersDto findByUsername(String username);
}
