package com.example.casestudymd6_be.repository.luan;

import com.example.casestudymd6_be.model.TypeOfWork;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IFieldRepo extends CrudRepository<TypeOfWork,Integer> {



    @Query(nativeQuery = true,value = "select * from case_module_6.field where id_field=:id")
    TypeOfWork findById(@Param("id") int id);
}
