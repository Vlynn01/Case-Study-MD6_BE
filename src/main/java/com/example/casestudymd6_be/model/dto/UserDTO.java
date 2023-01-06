package com.example.casestudymd6_be.model.dto;

import com.example.casestudymd6_be.model.Roles;
import lombok.Data;

@Data
public class UserDTO {
    private long id;
    private String username;
    private String token;
    private Roles roles;

    private String email;

    public UserDTO(long id, String username, String token, Roles roles) {
        this.id = id;
        this.username = username;
        this.token = token;
        this.roles = roles;
    }


}
