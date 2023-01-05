//package com.example.casestudymd6_be.service.dinh;
//
//import com.example.casestudymd6_be.model.DetailUser;
//import com.example.casestudymd6_be.repository.dinh.IDetailUserRepo;
//import com.example.casestudymd6_be.service.dinh.imp.IDetailUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class DetailUserService implements IDetailUserService {
//
//    @Autowired
//    IDetailUserRepo iDetailUserRepo;
//
//
//    public void save(DetailUser detailUser) {
//        iDetailUserRepo.save(detailUser);
//    }
//
//    public DetailUser findByEmail(String email){
//        return iDetailUserRepo.findDetailUserByEmail(email);
//    }
//}
