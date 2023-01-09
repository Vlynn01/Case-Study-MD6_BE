package com.example.casestudymd6_be.repository.luan;

import com.example.casestudymd6_be.model.Users;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface IAppUserRepo extends CrudRepository<Users, Long> {
    Users findByUsername(String username);


    // ĐỔi mật khẩu
    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "update  case_module_6.app_user set password=:password where email=:email")
    void changPassword(@Param("email") String gmail, @Param("password") String password);



}
