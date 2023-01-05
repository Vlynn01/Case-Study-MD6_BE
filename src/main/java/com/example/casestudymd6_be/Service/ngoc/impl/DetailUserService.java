package com.example.casestudymd6_be.Service.ngoc.impl;

import com.example.casestudymd6_be.Repository.ngoc.IDetailUserRepo;
import com.example.casestudymd6_be.Service.ngoc.itf.IDetailUserService;
import com.example.casestudymd6_be.model.DetailUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetailUserService implements IDetailUserService {
    @Autowired
    IDetailUserRepo iDetailUserRepo;
    @Override
    public List<DetailUser> finAll() {
        return (List<DetailUser>) iDetailUserRepo.findAll();
    }



    @Override
    public DetailUser findById(long id) {
        return iDetailUserRepo.findById(id).get();
    }

    @Override
    public void save(DetailUser detailUser) {
     iDetailUserRepo.save(detailUser);
    }
}
