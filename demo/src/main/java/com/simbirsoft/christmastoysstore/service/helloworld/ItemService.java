package com.simbirsoft.christmastoysstore.service.helloworld;

import com.simbirsoft.christmastoysstore.entity.Item;
import com.simbirsoft.christmastoysstore.entity.User;
import com.simbirsoft.christmastoysstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface ItemService {
    public Item findById(Long id);
    public List<Item> findAll();
    public Item saveItem(Item item);
    public void deleteById(Long id);
}