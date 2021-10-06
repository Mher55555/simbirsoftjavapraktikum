package com.simbirsoft.christmastoysstore.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="item_category")
public class Parent {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="category_name")
    private String category_name;


}
