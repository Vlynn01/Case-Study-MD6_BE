package com.example.casestudymd6_be.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private double salary;

    private String level;

    private long experience;

    private String place;
    private String gender;

    private String description;

    private Date expirationDatePost;

    private boolean status;

    @ManyToOne
    private Address address;

    @ManyToOne
    private TypeOfWork typeOfWork;

    @OneToOne
    private WorkTime workTime;


}
