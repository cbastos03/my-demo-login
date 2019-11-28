package com.challenge.auth.service;

import com.challenge.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}