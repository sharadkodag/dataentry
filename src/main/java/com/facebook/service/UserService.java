package com.facebook.service;

import com.facebook.entity.UserEntity;

import java.util.Optional;

public interface UserService {

    void addUser(UserEntity user);
    Optional<UserEntity> findUser(String username, String password);

}
