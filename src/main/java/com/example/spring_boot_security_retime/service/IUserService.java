package com.example.spring_boot_security_retime.service;

import com.example.spring_boot_security_retime.model.User;

import java.util.Optional;

public interface IUserService {
    Optional<User> findByUsername(String name);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    User save(User user);
}
