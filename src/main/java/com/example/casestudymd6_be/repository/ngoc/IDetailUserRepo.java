package com.example.casestudymd6_be.repository.ngoc;

import com.example.casestudymd6_be.model.DetailUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IDetailUserRepo extends CrudRepository<DetailUser,Long> {
    @Query(nativeQuery = true, value = "select * from detail_user where detail_user.name LIKE concat('%',:name,'%')")
    List<DetailUser> findDetailUserByName(@Param("name") String name);
}
