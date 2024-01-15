package com.ecomerceApi.Priscila.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class AuthenticationController {
    @RestController
    @RequestMapping("/ap1/v1/auth")
    @RequiredArgsConstructor
    public static class AuthenticationController {
        private final AuthenticationService service;

        public AuthenticationController(AuthenticationService service) {
            this.service = service;
        }

        @PostMapping("/register")
        public ResponseEntity<AuthenticationResponse> register(
                @RequestBody RegisterRequest request
        ){
            return ResponseEntity.ok(service.register (request));
        }
        @PostMapping("/authenticate")
        public ResponseEntity<AuthenticationResponse> register(
                @RequestBody AuthenticationRequest request
        ) {

        }
    }
}
