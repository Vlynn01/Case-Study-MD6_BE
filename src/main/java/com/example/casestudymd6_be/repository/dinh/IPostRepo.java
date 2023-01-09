package com.example.casestudymd6_be.repository.dinh;
import com.example.casestudymd6_be.model.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPostRepo extends PagingAndSortingRepository<Post, Long> {

    // tìm kiếm theo address
    @Query(nativeQuery = true, value = "SELECT * FROM case_md6.post join address on post.address_id = address.id where name LIKE %:address%")
    List<Post> findByAddress(@Param("address") String address);

    @Query(nativeQuery = true, value = "SELECT * FROM case_md6.post join type_of_work on post.type_of_work_id = type_of_work.id where name like %:typeOfWork% ")
    List<Post> findByTypeOfWork(@Param("typeOfWork") String typeOfWork);

    @Query(nativeQuery = true, value = "select * from post where place LIKE %:place% ")
    List<Post> findByPlace(@Param("place") String place);

    List<Post> findAllById(long id);

    @Query(nativeQuery = true, value = "select * from post where place LIKE %:place% && type_of_work_id = :id")
    List<Post> findByTypeOfWorkAndPlace(@Param("place") String place, @Param("id") long id);

    @Query(nativeQuery = true, value = "SELECT * FROM case_md6.post join detail_user on post.detail_user_id = detail_user.id where name like %:name% ")
    List<Post> findByDetailUser(@Param("name") String name);

    @Query(nativeQuery = true, value = "SELECT * FROM case_md6.post join address on post.address_id = address.id where title like %:title% && name like %:address%")
    List<Post> findByAddressAndTitle(@Param("title") String title, @Param("address") String address);

    @Query(nativeQuery = true, value = "SELECT * FROM case_md6.post join address on post.address_id = address.id join type_of_work on post.type_of_work_id = type_of_work.id where address.name like %:address% && type_of_work.name like %:typeOfWork%")
    List<Post> findByAddressAndTypeOfWork(@Param("address") String address, @Param("typeOfWork") String typeOfWork);
}
