package com.github.sgblug.app.Service.impl;

/**
 * @author 20312
 * @author 2022/8/17 12:14
 */
import com.github.sgblug.app.model.entity.User;
import com.github.sgblug.app.repository.UserRepository;
import com.github.sgblug.app.Service.UserService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Inject
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User newUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userRepository.save(user);
    }
}
