package com.example.casestudymd6_be.repository.nguyen;

import com.example.casestudymd6_be.model.CvUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ICvUserRepo  extends CrudRepository<CvUser, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM Case_MD6.cv_user where id=:id")
    CvUser findCvByApplyUser(@Param("id") int id);



}

