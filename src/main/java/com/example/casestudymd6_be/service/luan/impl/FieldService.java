package com.example.casestudymd6_be.service.luan.impl;


import com.example.casestudymd6_be.model.TypeOfWork;
import com.example.casestudymd6_be.repository.luan.IFieldRepo;
import com.example.casestudymd6_be.service.luan.InterfaceService.All.IFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldService implements IFieldService {
    @Autowired
    IFieldRepo fieldRepo;
    @Override
    public List<TypeOfWork> findAll() {
        return (List<TypeOfWork>) fieldRepo.findAll();
    }

    @Override
    public TypeOfWork findById(int id) {
        return  fieldRepo.findById(id);
    }
}
