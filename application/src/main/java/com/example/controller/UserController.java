package com.example.controller;

import com.example.common.RequestMappings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.ports.in.UserServicePort;
import com.example.data.UsersDto;

@RestController
@RequestMapping(RequestMappings.USER)
public class UserController {
    @Autowired
    private UserServicePort userServicePort;

    @PostMapping(path = RequestMappings.CREATE_USER)
    @ResponseBody
    public ResponseEntity<?> createUser(
            @RequestBody UsersDto usersDto
    ) {
        UsersDto resp = userServicePort.addUsers(usersDto);
        if (resp == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
