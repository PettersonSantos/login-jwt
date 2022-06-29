package com.example.ports.in;

import com.example.data.UsersDto;

public interface UserServicePort {
    UsersDto addUsers(UsersDto dto);
    UsersDto findByUsername(String username);
}
