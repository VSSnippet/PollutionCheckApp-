package com.pollutionapp.user.service;

import org.springframework.stereotype.Service;

import com.pollutionapp.user.model.User;
import com.pollutionapp.user.util.exception.UserAlreadyExistsException;
import com.pollutionapp.user.util.exception.UserNotFoundException;

@Service
public interface UserAuthService {
	


    public User findUserByEmailAndPassword(String userEmail, String password) throws UserNotFoundException;

    boolean saveUser(User user) throws UserAlreadyExistsException;
}
