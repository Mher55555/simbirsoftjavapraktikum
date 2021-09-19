package com.simbirsoft.christmastoysstore.service.helloworld;

import com.simbirsoft.christmastoysstore.entity.Parent;
import com.simbirsoft.christmastoysstore.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentServiceImpl implements ParentService {
    @Autowired
    public ParentRepository parentRepository;

    @Override
    public Parent findById(Long id) {
        return parentRepository.findById(id).get();
    }

    @Override
    public List<Parent> findAll() {
        return parentRepository.findAll();
    }

    @Override
    public Parent saveParent(Parent parent) {
        return parentRepository.save(parent);
    }

    @Override
    public void deleteById(Long id) {
        parentRepository.deleteById(id);
    }
}
