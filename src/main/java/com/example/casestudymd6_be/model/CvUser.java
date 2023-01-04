package com.example.casestudymd6_be.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CvUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String mail;

    private String imgCV;
    private long phoneNumber;

}
