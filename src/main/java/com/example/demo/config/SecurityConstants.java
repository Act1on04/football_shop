package com.example.demo.config;

public class SecurityConstants {
    public static final String SECRET = "MySecretKey";
    public static final long EXPIRATION_TIME = 864_000_00; // 1 день
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}
