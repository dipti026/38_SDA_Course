package com.example.onlinebidding.repository;

import com.example.onlinebidding.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByUsername() {
        User user = new User();
        user.setUsername("testUser");
        user.setPassword("password");
        userRepository.save(user);

        Optional<User> found = userRepository.findByUsername("testUser");
        assertTrue(found.isPresent());
    }
}
