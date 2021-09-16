package com.simbirsoft.christmastoysstore.service.helloworld;

import com.simbirsoft.christmastoysstore.entity.User;
import com.simbirsoft.christmastoysstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserServiceImpl implements  UserService{

    public UserRepository userRepository;

    @Autowired
    public UserService (UserService userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String getHello() {
        return null;
    }

    @Override
    public User findById() {
        return  return userRepository.getOne(id);;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    public User saveUser() {
        return  userRepository.save(user);;
    }

    @Override
    public void deleteById() {
        userRepository.deleteById(id);
    }


}
