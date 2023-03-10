package com.example.casestudymd6_be.service.luan.impl;

import com.example.casestudymd6_be.model.Roles;
import com.example.casestudymd6_be.model.Users;
import com.example.casestudymd6_be.repository.luan.IAppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class AppUserService implements UserDetailsService {
    @Autowired
    IAppUserRepo iAppUserRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = iAppUserRepo.findByUsername(username);
        List<Roles> roles =new ArrayList<>();
        roles.add(users.getRoles());
        if (users != null){
            return new User(users.getUsername(), users.getPassword(),  roles);
        }
        return null;
    }
    public List<Users> getAll(){
        return (List<Users>) iAppUserRepo.findAll();
    }

    public Users findByUserName(String username){
        return  iAppUserRepo.findByUsername(username);
    }
    public Users save(Users users){
        return iAppUserRepo.save(users);
    }


}
