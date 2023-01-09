package com.example.casestudymd6_be.service.ngoc.itf;

import com.example.casestudymd6_be.model.Post;

import java.util.List;

public interface IPostService {
    List<Post> finAll();
//    List<Post> getAll(Pageable pageable);



    List<Post> findAllById(long id);
    Post findById(long id);
    void save(Post post);

//    void edit(Post post);


}
