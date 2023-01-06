package com.example.casestudymd6_be.controller.ngoc;

import com.example.casestudymd6_be.service.ngoc.itf.IPostService;
import com.example.casestudymd6_be.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/post")
public class PostAPI {
@Autowired
    IPostService iPostService;

@GetMapping("listPost")
    public ResponseEntity<List<Post>> findAll(){
    return new ResponseEntity<>(iPostService.finAll(),HttpStatus.OK);
}
  @GetMapping("/findAllById/{id}")
    public ResponseEntity<List<Post>> findAllById(@PathVariable long id){
    return new ResponseEntity<>(iPostService.findAllById(id), HttpStatus.OK);
}
    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable long id){
        return new ResponseEntity<>(iPostService.findById(id), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Post post){
        iPostService.save(post);
    return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/edit")
    public ResponseEntity<?> edit(@RequestBody Post post) {
        iPostService.save(post);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
