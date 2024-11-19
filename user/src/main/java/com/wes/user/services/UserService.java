package com.wes.user.services;

import com.wes.user.models.UserModel;
import com.wes.user.repositories.UserRepository;

import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public UserModel save(UserModel userModel) {
        return userRepository.save(userModel);
    }

}
