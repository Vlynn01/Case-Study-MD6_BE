package com.example.casestudymd6_be.controller.luan;

import com.example.casestudymd6_be.model.Users;
import com.example.casestudymd6_be.model.DetailUser;
import com.example.casestudymd6_be.model.Field;
import com.example.casestudymd6_be.model.Roles;
import com.example.casestudymd6_be.service.luan.InterfaceService.All.IEnterpriseService;
import com.example.casestudymd6_be.service.luan.InterfaceService.All.IFieldService;
import com.example.casestudymd6_be.service.luan.impl.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/register")
public class RegisterAPI {

    @Autowired
    AppUserService appUserService;

    @Autowired
    IEnterpriseService enterpriseService;

    @Autowired
    IFieldService fieldService;

    @PostMapping("/user")
    public ResponseEntity<Users> register(@RequestBody Users users){
        Roles roles = new Roles();
        roles.setId(3);
        users.setRoles(roles);
        return new ResponseEntity<>(appUserService.save(users), HttpStatus.OK);
//
    }
    @GetMapping("/findAllField")
    public ResponseEntity<List<Field>> findAllField(){
        return new ResponseEntity<>(fieldService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Field> findById(@PathVariable int id){
        return new ResponseEntity<>(fieldService.findById(id),HttpStatus.OK);
    }
    @PostMapping("/enterprise")
    public ResponseEntity<DetailUser> registerEnterprise(@RequestBody DetailUser detailUser){
        detailUser.setTimeRegisterEnterprise(Time.valueOf(java.time.LocalTime.now()));
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        detailUser.setDateRegisterEnterprise(date);
        enterpriseService.save(detailUser);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
    //    @GetMapping("/enterprise")
//
    @GetMapping("/checkEnterprise")
    public ResponseEntity<List<DetailUser>> findAllEnterprise(){
        return new ResponseEntity<>(enterpriseService.getAllEnterprise(), HttpStatus.OK);
    }
    //
    @GetMapping("/checkUser")
    public ResponseEntity<List<Users>> findAllUser(){
        return new ResponseEntity<>(appUserService.getAll(), HttpStatus.OK);
    }
}
