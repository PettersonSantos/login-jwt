package com.example.services;

import com.example.data.UsersDto;
import com.example.ports.in.UserServicePort;
import com.example.ports.on.UserPersistencePort;

public class UserServiceImpl implements UserServicePort {

    private final UserPersistencePort persistencePort;

    public UserServiceImpl(UserPersistencePort persistencePort) {
        this.persistencePort = persistencePort;
    }

    @Override
    public UsersDto addUsers(UsersDto dto) {
        return persistencePort.addUsers(dto);
    }

    @Override
    public UsersDto findByUsername(String username) {
        return persistencePort.findByUsername(username);
    }
}
