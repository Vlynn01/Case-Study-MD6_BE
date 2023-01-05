package com.example.casestudymd6_be.Repository.ngoc;

import com.example.casestudymd6_be.model.Post;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IPostRepo extends CrudRepository<Post , Long> {
//    List<Post> getAll(Pageable pageable);
    List<Post> findAllById(long id);

}
