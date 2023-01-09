package com.example.casestudymd6_be.model.dto;

import com.example.casestudymd6_be.model.Roles;
import lombok.Data;

@Data
public class DetailUserDTO {
    private long id;

    private String token;
    private Roles roles;

    private String email;

    public DetailUserDTO(long id, String token, Roles roles, String email) {
        this.id = id;
        this.token = token;
        this.roles = roles;
        this.email = email;
    }
}
