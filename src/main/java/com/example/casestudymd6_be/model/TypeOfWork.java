package com.example.casestudymd6_be.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data

public class TypeOfWork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    public TypeOfWork() {
    }

    public TypeOfWork(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
