package com.simbirsoft.christmastoysstore.controller;

import com.simbirsoft.christmastoysstore.entity.Item;
import com.simbirsoft.christmastoysstore.service.helloworld.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;

    public Item getItem(Long id){
        return itemService.findById(id);
    }


}
