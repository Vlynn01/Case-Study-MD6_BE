package com.example.casestudymd6_be.repository.ngoc;

import com.example.casestudymd6_be.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPostRepo extends CrudRepository<Post , Long> {
//    List<Post> getAll(Pageable pageable);
    List<Post> findAllById(long id);

}
