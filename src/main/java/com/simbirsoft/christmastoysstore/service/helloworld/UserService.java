package com.simbirsoft.christmastoysstore.service.helloworld;

import com.simbirsoft.christmastoysstore.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface UserService {
        public User findById(Long id);
        public List<User> findAll();
        public User saveUser(User user);
        public void deleteById(Long id);
    }

