package com.example.casestudymd6_be.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String email;
    private String password;
    private String name;

    @ManyToOne
    private Roles roles;

    @ManyToOne
    private CvUser cvUser;

}
