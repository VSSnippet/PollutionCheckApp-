package com.pollutionapp.user.service;

import com.pollutionapp.user.model.User;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public Optional<User> getByEmail(String email);

    public User updatePassword(User user,String password);

    public User save(User user);
}
