package com.example.casestudymd6_be.repository.dinh;

import com.example.casestudymd6_be.model.Address;
import com.example.casestudymd6_be.model.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPostRepo extends PagingAndSortingRepository<Post, Long> {

    // tìm kiếm theo address
    @Query(nativeQuery = true, value = "select * from post where address_id = :id ")
    List<Post> findByAddress(@Param("id") long id);

    @Query(nativeQuery = true, value = "select * from post where type_of_work_id = :id ")
    List<Post> findByTypeOfWork(@Param("id") long id);

    @Query(nativeQuery = true, value = "select * from post where place LIKE %:place% ")
    List<Post> findByPlace(@Param("place") String place);

    List<Post> findAllById(long id);

    @Query(nativeQuery = true, value = "select * from post where place LIKE %:place% && type_of_work_id = :id")
    List<Post> findByTypeOfWorkAndPlace(@Param("place") String place, @Param("id") long id);
}
