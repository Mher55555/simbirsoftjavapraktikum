package com.simbirsoft.christmastoysstore.service.helloworld;

import com.simbirsoft.christmastoysstore.entity.User;
import com.simbirsoft.christmastoysstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface ItemService {
    public String getHello();
    public item findById();
    public List<item> findAll();
    public item saveItem();
    public void deleteById();
}
