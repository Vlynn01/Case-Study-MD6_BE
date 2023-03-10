package com.example.casestudymd6_be.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @ManyToOne
    private DetailUser detailUser;

    public Post() {
    }

    public Post(long id, String title, double salary, String level, long experience, String place, String gender, String description, Date expirationDatePost, boolean status, Address address, TypeOfWork typeOfWork, WorkTime workTime, DetailUser detailUser) {
        this.id = id;
        this.title = title;
        this.salary = salary;
        this.level = level;
        this.experience = experience;
        this.place = place;
        this.gender = gender;
        this.description = description;
        this.expirationDatePost = expirationDatePost;
        this.status = status;
        this.address = address;
        this.typeOfWork = typeOfWork;
        this.workTime = workTime;
        this.detailUser = detailUser;
    }
}
