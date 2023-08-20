package com.facebook.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.facebook.entity.UserEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class UserRepository {
    private static List<UserEntity> userList = new ArrayList<>();

    static {
        userList.add(UserEntity.builder()
                .id(1L)
                .userType("Admin")
                .name("Sharad")
                .email("kodagsharad99@gmail.com")
                .gender("Male")
                .mobileNumber("7756084732")
                .password("admin")
                .build());
    }

    public List<UserEntity> findAll() {
        return new ArrayList<>(userList);
    }

    public void add(UserEntity user) {
        userList.add(user);
    }

    public Optional<UserEntity> findByEmailOrMobileAndPassword(String mobile, String password) {
        return userList.stream().filter(e -> (e.getEmail().equals(mobile) || e.getMobileNumber().equals(mobile))
                && e.getPassword().equals(password)).findFirst();
    }
}
