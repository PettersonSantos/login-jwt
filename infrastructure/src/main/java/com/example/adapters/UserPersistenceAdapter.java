package com.example.adapters;

import com.example.data.UsersDto;
import com.example.ports.on.UserPersistencePort;

public class UserPersistenceAdapter implements UserPersistencePort {
    @Override
    public UsersDto addUsers(UsersDto dto) {
        return null;
    }

    @Override
    public UsersDto findByUsername(String username) {
        return null;
    }
}
