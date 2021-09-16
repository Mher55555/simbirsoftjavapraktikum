package com.simbirsoft.christmastoysstore.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="parent")
public class Parent {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;


}
