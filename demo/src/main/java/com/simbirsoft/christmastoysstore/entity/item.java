package com.simbirsoft.christmastoysstore.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="item")
public class item {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn (name ="parent", referencedColumnName = "name")

    @Column(name="name")
    private String name;
    @Column(name="discription")
    public String discription;
    @Column(name="description")
    public Integer amount;
    @Column(name="parentID")
    public String parentID;




}
