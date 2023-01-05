package com.example.casestudymd6_be.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class WorkTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public WorkTime() {
    }

    public WorkTime(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
