package com.example.casestudymd6_be.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    Users users;

    public DetailUser() {
    }

    public DetailUser(long id, String name, String email, String password, String img, long quantity, String place, long phone, String website, String city, Address address, Users users) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.img = img;
        this.quantity = quantity;
        this.place = place;
        this.phone = phone;
        this.website = website;
        this.city = city;
        this.address = address;
        this.users = users;
    }
}
