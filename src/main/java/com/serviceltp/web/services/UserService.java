package com.serviceltp.web.services;

import com.serviceltp.web.models.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findUserByUsername(String username);
}
