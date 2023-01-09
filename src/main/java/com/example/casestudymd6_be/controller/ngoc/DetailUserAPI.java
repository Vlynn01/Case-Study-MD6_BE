package com.example.casestudymd6_be.controller.ngoc;

import com.example.casestudymd6_be.service.ngoc.itf.IDetailUserService;
import com.example.casestudymd6_be.model.DetailUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/details")
public class DetailUserAPI {

    @Autowired
    IDetailUserService iDetailUserService;
    @GetMapping
    public ResponseEntity<List<DetailUser>> finAll(){
        return new ResponseEntity<>(iDetailUserService.finAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailUser> findById(@PathVariable long id){
        return new ResponseEntity<>(iDetailUserService.findById(id), HttpStatus.OK);
    }
    @PutMapping("/edit")
    public ResponseEntity<DetailUser> edit(@RequestBody DetailUser detailUser){
        iDetailUserService.save(detailUser);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
