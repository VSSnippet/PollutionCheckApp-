package com.pollutionapp.user.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.pollutionapp.user.model.User;

@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
    
    private User user;

    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private UserRepository repo;

    @BeforeEach
    public void setUp() {
       
       // user = new User("sanjay@gmail.com", "sanjay", "123456","123456");

        
    }
    @AfterEach
    public void tearDown(){

     user= null;
   
        
    }
 

    
    @Test
    void testFindUserByEmailAndPassword() throws Exception{
        User savedUser = repo.save(user);
        
     //   User fetchUser = UserRepository.findById(saveduser.getEmail(),saveduser.getPassword()).get();
       // assertThat(user.getEmail(), is(fetchUser.getEmail()));
    }




    }

