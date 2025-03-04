package com.pollutionapp.user.service;

import com.pollutionapp.user.model.User;
import com.pollutionapp.user.util.exception.UserAlreadyExistsException;
import com.pollutionapp.user.util.exception.UserNotFoundException;
import com.pollutionapp.user.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class UserAuthServiceImpl implements UserAuthService {
  
	@Autowired
	private UserRepository userAuthRepo;

	public UserAuthServiceImpl(UserRepository userAuthRepo) {
		super();
		this.userAuthRepo = userAuthRepo;
	}


	@Override
    public User findUserByEmailAndPassword(String userEmail, String password) throws UserNotFoundException {
		User user = userAuthRepo.findUserByEmailAndPassword(userEmail, password);
		if(user != null)
			return user;
		return null;
    }


    @Override
    public boolean saveUser(User user) throws UserAlreadyExistsException {
    	Optional<User> isUserExists = userAuthRepo.findByEmail(user.getEmail());
    	if(isUserExists.isEmpty()) {
    		userAuthRepo.save(user);
    		return true;
    	}
    	else{
    		throw new UserAlreadyExistsException("User Already Exists.");
    	}
    }
}
