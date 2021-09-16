package com.simbirsoft.christmastoysstore.service.helloworld;

import com.simbirsoft.christmastoysstore.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public String getHello();
    public User findById();
    public List<User> findAll();
    public User saveUser();
    public void deleteById();
}
