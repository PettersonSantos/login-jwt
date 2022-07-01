package com.example.configuration;

import com.example.services.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.ports.in.UserServicePort;
import com.example.ports.out.UserPersistencePort;
import com.example.adapters.UserPersistenceAdapter;
@Configuration
public class ServicesConfiguration {

    @Bean
    public UserPersistencePort userPersistencePort() {
        return new UserPersistenceAdapter();
    }

    @Bean
    public UserServicePort userServicePort(){
        return new UserServiceImpl(userPersistencePort());
    }
}
