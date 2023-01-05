package com.example.casestudymd6_be.Service.ngoc.itf;

import com.example.casestudymd6_be.model.Post;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IPostService {
    List<Post> finAll();
//    List<Post> getAll(Pageable pageable);



    List<Post> findAllById(long id);
    Post findById(long id);
    void save(Post post);

//    void edit(Post post);


}
