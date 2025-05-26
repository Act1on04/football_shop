package com.example.demo.services;

import com.example.demo.models.User;

public interface AuthService {
    String generateToken(User user);
    boolean validatePassword(String rawPassword, String hashedPassword);
}
