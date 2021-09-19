package com.simbirsoft.christmastoysstore.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Item")
public class Item {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    @Column(name="name")
    private String name;
    @Column(name="discription")
    public String discription;
    @Column(name="amount")
    public Integer amount;

    @OneToOne
    @JoinColumn (name ="parent", referencedColumnName = "id")
    public Parent parentID;




}
