package com.kafka.consumer.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.kafka.consumer.entity.User;
import com.kafka.consumer.repository.UserRepository;
@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User getUserById(UUID id) {
       return userRepository.findById(id).orElse(null);
    }
}
