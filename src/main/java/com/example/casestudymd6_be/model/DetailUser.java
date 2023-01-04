package com.example.casestudymd6_be.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class DetailUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String email;

    private String password;

    private String img;
    private long quantity;
    private String place;
    private long phone;

    private String website;
    private String city;

    @ManyToOne
    private Address address;
    @OneToOne
    User user;
}
