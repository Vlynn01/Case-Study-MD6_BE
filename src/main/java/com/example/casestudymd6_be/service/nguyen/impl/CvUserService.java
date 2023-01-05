package com.example.casestudymd6_be.service.nguyen.impl;

import com.example.casestudymd6_be.model.CvUser;
import com.example.casestudymd6_be.repository.nguyen.ICvUserRepo;
import com.example.casestudymd6_be.service.nguyen.interfaceService.ICvUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CvUserService implements ICvUserService {
    @Autowired
    ICvUserRepo cvUserRepo;
    @Override
    public void save(CvUser cvUser) {
        cvUserRepo.save(cvUser);
    }

    @Override
    public CvUser findByIdApplyUser(int id) {
        return cvUserRepo.findCvByApplyUser(id);
    }
}
