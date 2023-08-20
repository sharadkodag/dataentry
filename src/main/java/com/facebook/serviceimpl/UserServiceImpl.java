package com.facebook.serviceimpl;

import com.facebook.entity.UserEntity;
import com.facebook.repository.UserRepository;
import com.facebook.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public void addUser(UserEntity user) {
        userRepository.add(user);
    }

    @Override
    public Optional<UserEntity> findUser(String username, String password) {
        return userRepository.findByEmailOrMobileAndPassword(username, password);
    }
}
