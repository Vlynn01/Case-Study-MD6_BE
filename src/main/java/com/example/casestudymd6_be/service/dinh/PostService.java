package com.example.casestudymd6_be.service.dinh;

import com.example.casestudymd6_be.model.Address;
import com.example.casestudymd6_be.model.Post;
import com.example.casestudymd6_be.repository.dinh.IPostRepo;
import com.example.casestudymd6_be.service.dinh.imp.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostService implements IPostService {
    @Autowired
    IPostRepo iPostRepo;

    public List<Post> findByAddress(long id) {
        return iPostRepo.findByAddress(id);
    }

    public List<Post> findByTyOfWork(long id){
        return iPostRepo.findByTypeOfWork(id);
    }

    public List<Post> findByPlace(String place){
        return iPostRepo.findByPlace(place);
    }

    public List<Post> findByTypeOfWorkAndPlace(String place, long id){
        return iPostRepo.findByTypeOfWorkAndPlace(place, id);
    }
}
