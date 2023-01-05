package com.example.casestudymd6_be.service.luan.impl;


import com.example.casestudymd6_be.model.Field;
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
    public List<Field> findAll() {
        return (List<Field>) fieldRepo.findAll();
    }

    @Override
    public Field findById(int id) {
        return  fieldRepo.findById(id);
    }
}
