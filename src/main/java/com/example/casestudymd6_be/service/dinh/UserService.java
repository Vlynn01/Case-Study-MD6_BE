//package com.example.casestudymd6_be.service.dinh;
//
//import com.example.casestudymd6_be.model.Roles;
//import com.example.casestudymd6_be.model.Users;
//import com.example.casestudymd6_be.repository.dinh.IUserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//@Service
//public class UserService implements UserDetailsService {
//
//    @Autowired
//    IUserRepo iUserRepo;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Users users = iUserRepo.findByUsername(username);
//        List<Roles> roles = new ArrayList<>();
//        roles.add(users.getRoles());
//        if (users != null) {
//            return new User(users.getEmail(), users.getPassword(), roles);
//        }
//        return null;
//    }
//
//    public List<Users> getAll() {
//        return (List<Users>) iUserRepo.findAll();
//    }
//
//    public Users findByUsername(String username) {
//        return iUserRepo.findByUsername(username);
//    }
//
//    public Users save(Users users) {
//        return iUserRepo.save(users);
//    }
//}
