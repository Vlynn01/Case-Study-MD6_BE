package com.example.casestudymd6_be.controller.dinh;

import com.example.casestudymd6_be.model.Address;
import com.example.casestudymd6_be.model.Post;
import com.example.casestudymd6_be.service.dinh.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/findjob")
public class FindJobAPI {

    @Autowired
    PostService postService;

    @GetMapping("/findaddress/{id}")
    public ResponseEntity<List<Post>> findByAddress(@PathVariable long id){
        return new ResponseEntity<>(postService.findByAddress(id), HttpStatus.OK);
    }

    @GetMapping("/findtypeofwork/{id}")
    public ResponseEntity<List<Post>> findByTypeOfWork(@PathVariable long id){
        return new ResponseEntity<>(postService.findByTyOfWork(id), HttpStatus.OK);
    }

    @GetMapping("/findplace/{place}")
    public ResponseEntity<List<Post>> findByPlace(@PathVariable String place){
        return new ResponseEntity<>(postService.findByPlace(place), HttpStatus.OK);
    }

//    @GetMapping("/findplaceandwork/")
//    public ResponseEntity<List<Post>> findByTypeOfWorkAndPlace(@RequestBody ){
//        return new ResponseEntity<>(postService.findByPlace(place), HttpStatus.OK);
//    }
}
