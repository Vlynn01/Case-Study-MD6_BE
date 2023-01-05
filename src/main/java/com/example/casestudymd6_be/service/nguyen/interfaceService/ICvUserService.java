package com.example.casestudymd6_be.service.nguyen.interfaceService;

import com.example.casestudymd6_be.model.CvUser;

public interface ICvUserService {

    void save(CvUser cvUser);

    CvUser findByIdApplyUser(int id);
}

