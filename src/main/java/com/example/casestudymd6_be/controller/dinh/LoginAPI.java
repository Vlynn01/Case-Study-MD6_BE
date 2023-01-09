package com.example.casestudymd6_be.controller.dinh;

import com.example.casestudymd6_be.model.DetailUser;
import com.example.casestudymd6_be.model.Users;
import com.example.casestudymd6_be.model.dto.DetailUserDTO;
import com.example.casestudymd6_be.model.dto.UserDTO;

import com.example.casestudymd6_be.repository.dinh.IUserRepo;
import com.example.casestudymd6_be.repository.ngoc.IDetailUserRepo;
import com.example.casestudymd6_be.service.JwtService;
import com.example.casestudymd6_be.service.dinh.UserService;
import com.example.casestudymd6_be.service.ngoc.impl.DetailUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class LoginAPI {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtService jwtService;

    @Autowired
    IUserRepo iUserRepo;

    @Autowired
    UserService userService;

    @Autowired
    IDetailUserRepo iDetailUserRepo;

    @Autowired
    DetailUserService detailUserService;

    @GetMapping("/getalluser")
    public List<Users> users(){
        return (List<Users>) iUserRepo.findAll();
    }

    @GetMapping("/getalldetailuser")
    public List<DetailUser> detailUsers(){
        return (List<DetailUser>) iDetailUserRepo.findAll();
    }

    @PostMapping("/login")
    public ResponseEntity<UserDTO> login(@RequestBody Users users){

            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(users.getUsername(), users.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);

            String token = jwtService.createToken(authentication);
            Users users1 = userService.findByUsername(users.getUsername());
            UserDTO userDTO = new UserDTO(users1.getId(), users.getUsername(), token, users1.getRoles() );
            return new ResponseEntity<>(userDTO, HttpStatus.OK);

    }


    @GetMapping("/findbyname/{name}")
    public ResponseEntity<Users> findByUserName(@PathVariable String name){
        return new ResponseEntity<>(userService.findByUsername(name),HttpStatus.OK);
    }
}
