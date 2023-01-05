package com.example.casestudymd6_be.Service.ngoc.itf;

import com.example.casestudymd6_be.model.DetailUser;

import java.util.List;

public interface IDetailUserService {
    List<DetailUser> finAll();

    DetailUser findById(long id);
    void save(DetailUser detailUser);
}
