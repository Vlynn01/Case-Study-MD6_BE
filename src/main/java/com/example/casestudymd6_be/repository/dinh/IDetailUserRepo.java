package com.example.casestudymd6_be.repository.dinh;

import com.example.casestudymd6_be.model.DetailUser;
import org.springframework.data.repository.CrudRepository;

public interface IDetailUserRepo extends CrudRepository<DetailUser, Long> {
    DetailUser findDetailUserByEmail(String email);
}
