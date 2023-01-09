package com.example.casestudymd6_be.controller.dinh;

import com.example.casestudymd6_be.model.DetailUser;
import com.example.casestudymd6_be.model.Post;
import com.example.casestudymd6_be.model.dto.FindMultiple;
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

    @GetMapping("/findaddress/{address}")
    public ResponseEntity<List<Post>> findByAddress(@PathVariable String address){
        return new ResponseEntity<>(postService.findByAddress(address), HttpStatus.OK);
    }

    @GetMapping("/findtypeofwork/{typeOfWork}")
    public ResponseEntity<List<Post>> findByTypeOfWork(@PathVariable String typeOfWork){
        return new ResponseEntity<>(postService.findByTyOfWork(typeOfWork), HttpStatus.OK);
    }

    @GetMapping("/findplace/{place}")
    public ResponseEntity<List<Post>> findByPlace(@PathVariable String place){
        return new ResponseEntity<>(postService.findByPlace(place), HttpStatus.OK);
    }

//    @GetMapping("/findplaceandwork/")
//    public ResponseEntity<List<Post>> findByTypeOfWorkAndPlace(@RequestBody ){
//        return new ResponseEntity<>(postService.findByPlace(place), HttpStatus.OK);
//    }

    @GetMapping("/findbydetailuser/{name}")
    public ResponseEntity<List<Post>> findByDetailUser(@PathVariable String name){
        return new ResponseEntity<>(postService.findByDetailUser(name),HttpStatus.OK);
    }

    @GetMapping("/finddetailuserbyname/{name}")
    public ResponseEntity<List<DetailUser>> findDetailUserByName(@PathVariable String name){
        return new ResponseEntity<>(postService.findDetailUserByName(name),HttpStatus.OK);
    }

    @PostMapping("/findbytitleandaddress")
    public ResponseEntity<List<Post>> findByTitleAndAddress(@RequestBody FindMultiple findMultiple){
        return new ResponseEntity<>(postService.findByTitleAndAddress(findMultiple.getTitle(), findMultiple.getAddress()), HttpStatus.OK);
    }

    @PostMapping("/findbyaddressandtypeofwork")
    public ResponseEntity<List<Post>> findbyaddressandtypeofwork(@RequestBody FindMultiple findMultiple){
        return new ResponseEntity<>(postService.findByAddressAndTypeOfWork(findMultiple.getAddress(), findMultiple.getTypeOfWork()), HttpStatus.OK);
    }


}
