package com.example.casestudymd6_be.Repository.ngoc;

import com.example.casestudymd6_be.model.DetailUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IDetailUserRepo extends CrudRepository<DetailUser,Long> {
}
