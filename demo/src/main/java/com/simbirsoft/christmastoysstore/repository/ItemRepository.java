package com.simbirsoft.christmastoysstore.repository;

import com.simbirsoft.christmastoysstore.entity.Parent;
import com.simbirsoft.christmastoysstore.entity.item;
import org.elasticsearch.action.search.MultiSearchResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<item, Long> {
}