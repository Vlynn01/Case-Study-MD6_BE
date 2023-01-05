package com.example.casestudymd6_be.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class ApplyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUser;

    private Date dateApply;
    private boolean status;

    @ManyToOne
    private Users users;

    @ManyToOne
    private Post post;
}
