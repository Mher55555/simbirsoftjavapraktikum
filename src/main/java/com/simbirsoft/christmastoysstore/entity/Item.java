package com.simbirsoft.christmastoysstore.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="item")
public class Item {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    @Column(name="item_name")
    private String item_name;
    @Column(name="description")
    public String description;
    @Column(name="price")
    public Integer price;

    @OneToOne
    @JoinColumn (name ="category_id", referencedColumnName = "id")
    public Parent item_category;




}
