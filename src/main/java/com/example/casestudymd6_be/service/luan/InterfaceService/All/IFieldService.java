package com.example.casestudymd6_be.service.luan.InterfaceService.All;

import com.example.casestudymd6_be.model.Field;

import java.util.List;

public interface IFieldService {

    List<Field> findAll();

    Field findById(int id);
}
