package com.example.casestudymd6_be.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public address() {
    }

    public address(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
