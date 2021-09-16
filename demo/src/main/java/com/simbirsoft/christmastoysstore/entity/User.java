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

      @Column(name="login")
      private String login;
      @Column(name="password")
      private String password;
      @Column(name="role")
      private String role;

}