package com.ecomerceApi.Priscila.controller;

import com.ecomerceApi.Priscila.exception.UserExistsExecption;
import com.ecomerceApi.Priscila.exception.UserNotFoundException;
import com.ecomerceApi.Priscila.model.User;
import com.ecomerceApi.Priscila.requestModels.UserRegistrationRequest;
import com.ecomerceApi.Priscila.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/register")  // /user/register
    public ResponseEntity<Void> registerUser(@RequestBody UserRegistrationRequest request) throws UserExistsExecption {
        userService.register(request);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/{email}")
    public ResponseEntity<User> userByEmail(@PathVariable("email") String email) throws UserNotFoundException {
        User user = userService.getUserByEmail(email);
        return ResponseEntity.ok(user);
    }

}

