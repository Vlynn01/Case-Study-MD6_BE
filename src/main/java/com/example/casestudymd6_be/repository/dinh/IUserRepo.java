package com.example.casestudymd6_be.repository.dinh;

import com.example.casestudymd6_be.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<Users, Long> {
    Users findByUsername(String name);

}
