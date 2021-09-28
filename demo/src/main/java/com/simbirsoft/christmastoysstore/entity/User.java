package com.simbirsoft.christmastoysstore.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="user")
public class User {



      @Id
      @GeneratedValue(strategy= GenerationType.IDENTITY)
      private Long id;

      @Column(name="user_name")
      private String user_name;
      @Column(name="password")
      private String password;
      @Column(name="email")
      private String email;

      @Enumerated(value=EnumType.STRING)
      @Column(name="role")
      private Role role;
      @Enumerated(value=EnumType.STRING)
      @Column(name="status")
      private Status status;



}