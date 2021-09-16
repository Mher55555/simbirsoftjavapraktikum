package com.simbirsoft.christmastoysstore.service.helloworld;

import com.simbirsoft.christmastoysstore.entity.User;
import com.simbirsoft.christmastoysstore.entity.item;
import com.simbirsoft.christmastoysstore.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements  ItemService{

    public ItemRepository userRepository;

    @Autowired
    public ItemService (ItemService itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public String getHello() {
        return null;
    }

    @Override
    public item findById() {
        return   itemRepository.getOne(id);;
    }

    public List<item> findAll(){
        return itemRepository.findAll();
    }

    @Override
    public item saveUser() {
        return  itemRepository.save(item);;
    }

    @Override
    public void deleteById() {
        itemRepository.deleteById(id);
    }


}
