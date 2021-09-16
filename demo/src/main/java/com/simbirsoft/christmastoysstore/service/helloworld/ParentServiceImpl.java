package com.simbirsoft.christmastoysstore.service.helloworld;

import com.simbirsoft.christmastoysstore.entity.Parent;
import com.simbirsoft.christmastoysstore.entity.User;
import com.simbirsoft.christmastoysstore.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class ParentServiceImpl implements  ParentService{

        public ParentRepository parentRepository;

        @Autowired
        public ParentServiceImpl (ParentService parentRepository) {
            this.parentRepository = (ParentRepository) parentRepository;
        }

        @Override
        public String getHello() {
            return null;
        }

        @Override
        public Parent findById() {
            return  parentRepository.getOne(id);;
        }

        public List<Parent> findAll(){
            return parentRepository.findAll();
        }

        @Override
        public Parent saveUser() {
            return  parentRepository.save(Parent);;
        }

        @Override
        public void deleteById() {
            parentRepository.deleteById(id);
        }


    }
}
