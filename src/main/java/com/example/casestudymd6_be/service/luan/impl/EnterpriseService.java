package com.example.casestudymd6_be.service.luan.impl;

import com.example.casestudymd6_be.model.DetailUser;
import com.example.casestudymd6_be.repository.luan.IAppUserRepo;
import com.example.casestudymd6_be.repository.luan.IEnterpriseRepo;
import com.example.casestudymd6_be.service.luan.InterfaceService.All.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseService implements IEnterpriseService {

    @Autowired
    IEnterpriseRepo enterpriseRepo;

    @Autowired
    IAppUserRepo iAppUserRepo;


    @Override
    public void save(DetailUser detailUser) {

    }


    // Đổi mật khẩu
    @Override
    public void changPassword(String email, String password) {
        iAppUserRepo.changPassword(email, password);
    }

    @Override
    public List<DetailUser> getAllEnterprise() {
        return (List<DetailUser>) enterpriseRepo.findAll();
    }


}
