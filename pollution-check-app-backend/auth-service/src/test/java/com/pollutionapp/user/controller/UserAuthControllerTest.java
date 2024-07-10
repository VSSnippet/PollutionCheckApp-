package com.pollutionapp.user.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import static org.assertj.core.api.Assertions.assertThat;

import com.pollutionapp.user.model.User;
import com.pollutionapp.user.repository.UserRepository;
import com.pollutionapp.user.service.UserService;

@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserAuthControllerTest {

    private User user;

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserService service;

    @Autowired
    private UserRepository repo;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @AfterEach
    public void tearDown() {
        user = null;
    }

    @Test
    void testRegisterUser() throws Exception {
        User user = new User();
        user.setEmail("ravikumar@gmail.com");
        user.setPassword("ravi2020");
        user.setName("Ravi");

        User savedUser = service.save(user);

        User existUser = entityManager.find(User.class, savedUser.getId());

        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
    }

    @Test
    void testAuthenticateUser() {}

    @Test
    void testGetToken() {}

    @Test
    void testLogin() {}

    @Test
    void testValidateToken() {}
}

