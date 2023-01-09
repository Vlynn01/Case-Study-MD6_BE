package com.example.casestudymd6_be.controller.dinh;

import com.example.casestudymd6_be.model.DetailUser;
import com.example.casestudymd6_be.model.Roles;
import com.example.casestudymd6_be.model.Users;
import com.example.casestudymd6_be.repository.dinh.IUserRepo;
import com.example.casestudymd6_be.service.dinh.UserService;
import com.example.casestudymd6_be.service.ngoc.impl.DetailUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/register")
public class RegisterAPI {
    @Autowired
    IUserRepo iUserRepo;

    @Autowired
    UserService userService;

    @Autowired
    DetailUserService detailUserService;

    @PostMapping("/user")
    public ResponseEntity<Users> registerUser(@RequestBody Users users){
        Roles roles = new Roles();
        roles.setName("ROLE_USER");
        roles.setId(3);
        users.setRoles(roles);
        iUserRepo.save(users);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }


    @PostMapping("/detailuser")
    public ResponseEntity<DetailUser> registerDetailUser(@RequestBody DetailUser detailUser){
        detailUserService.save(detailUser);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
