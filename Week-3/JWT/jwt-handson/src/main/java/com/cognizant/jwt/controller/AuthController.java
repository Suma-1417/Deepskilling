package com.cognizant.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwt.model.JwtResponse;
import com.cognizant.jwt.util.JwtUtil;

@RestController
public class AuthController {

    @GetMapping("/authenticate")
    public JwtResponse authenticate() {

        String token = JwtUtil.generateToken("cognizant");

        return new JwtResponse(token);
    }
}