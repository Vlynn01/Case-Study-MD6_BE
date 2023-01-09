package com.example.casestudymd6_be.controller.luan;

import com.example.casestudymd6_be.model.Users;
import com.example.casestudymd6_be.model.ChangePassWord;
import com.example.casestudymd6_be.model.luan.ot.UserToken;
import com.example.casestudymd6_be.service.JwtService;
import com.example.casestudymd6_be.service.luan.InterfaceService.All.IEnterpriseService;
import com.example.casestudymd6_be.service.luan.impl.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class LoginAPI {
    @Autowired
    JwtService jwtService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    AppUserService appUserService;

    @Autowired
    IEnterpriseService enterpriseService;
    @PostMapping("/login")
    public ResponseEntity<UserToken> login(@RequestBody Users users){
        try{
            // Tạo ra 1 đối tượng Authentication.
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(users.getUsername(), users.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String token = jwtService.createToken(authentication);
            Users users1 = appUserService.findByUserName(users.getUsername());
            UserToken userToken= new UserToken(users1.getId(), users1.getUsername(),token, users1.getRoles());
            return new ResponseEntity<>(userToken,HttpStatus.OK);
        }catch (Exception e) {
            return null;
        }
    }
    @GetMapping("/findByName/{name}")
    public ResponseEntity<Users> findByUserName(@PathVariable String name){
        return new ResponseEntity<>(appUserService.findByUserName(name),HttpStatus.OK);
    }
    @PostMapping("/changePassword")
    public ResponseEntity<Users> changePassword(@RequestBody ChangePassWord changePassWord ) {
        enterpriseService.changPassword(changePassWord.getGmail(), changePassWord.getPassword());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
