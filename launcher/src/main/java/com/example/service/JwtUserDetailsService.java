package com.example.service;

import com.example.data.UsersDto;
import com.example.ports.in.UserServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private UserServicePort port;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        UsersDto user = port.findByUsername(s);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + s);
        }

        return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
    }
}
