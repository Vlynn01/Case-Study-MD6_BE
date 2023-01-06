package com.example.casestudymd6_be.service.ngoc.impl;

import com.example.casestudymd6_be.repository.ngoc.IPostRepo;
import com.example.casestudymd6_be.service.ngoc.itf.IPostService;
import com.example.casestudymd6_be.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostService implements IPostService {
    @Autowired
    IPostRepo iPostRepo;
    @Override
    public List<Post> finAll() {

        return (List<Post>) iPostRepo.findAll();
    }

//    @Override
//    public List<Post> getAll(Pageable pageable) {
//        return iPostRepo.getAll(pageable);
//    }




    @Override
    public List<Post> findAllById(long id){
        return iPostRepo.findAllById(id);
    }

    @Override
    public Post findById(long id) {
        return iPostRepo.findById(id).get();
    }

    @Override
    public void save(Post post) {
     iPostRepo.save(post);
    }


//
//    @Override
//    public void edit(Post post) {
////     iPostRepo.
//    }
}