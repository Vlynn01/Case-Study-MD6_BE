package com.example.casestudymd6_be.service.luan.InterfaceService.All;

import com.example.casestudymd6_be.model.TypeOfWork;

import java.util.List;

public interface IFieldService {

    List<TypeOfWork> findAll();

    TypeOfWork findById(int id);
}
