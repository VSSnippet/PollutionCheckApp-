package com.pollutionapp.user.repository;

import com.pollutionapp.user.model.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findUserByEmailAndPassword(String email, String password);

    public Optional<User> findByEmail(String email);

}
