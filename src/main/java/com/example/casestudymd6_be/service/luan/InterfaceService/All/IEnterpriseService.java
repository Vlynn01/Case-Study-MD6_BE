package com.example.casestudymd6_be.service.luan.InterfaceService.All;

import com.example.casestudymd6_be.model.DetailUser;

import java.util.List;

public interface IEnterpriseService {

    void save(DetailUser detailUser);

    void changPassword(String email, String password);
    List<DetailUser> getAllEnterprise();

}
