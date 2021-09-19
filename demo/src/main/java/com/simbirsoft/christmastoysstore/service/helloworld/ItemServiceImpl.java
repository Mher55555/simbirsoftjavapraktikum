package com.simbirsoft.christmastoysstore.service.helloworld;



import com.simbirsoft.christmastoysstore.entity.Item;
import com.simbirsoft.christmastoysstore.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements  ItemService{
@Autowired
    public ItemRepository itemRepository;

    @Override
    public Item findById(Long id) {
        return itemRepository.findById(id).get();
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void deleteById(Long id) {
             itemRepository.deleteById(id);
    }
}


