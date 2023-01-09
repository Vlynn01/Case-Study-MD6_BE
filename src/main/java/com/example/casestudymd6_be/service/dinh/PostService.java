package com.example.casestudymd6_be.service.dinh;

import com.example.casestudymd6_be.model.DetailUser;
import com.example.casestudymd6_be.model.Post;
import com.example.casestudymd6_be.repository.dinh.IPostRepo;
import com.example.casestudymd6_be.repository.ngoc.IDetailUserRepo;
import com.example.casestudymd6_be.service.dinh.imp.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostService implements IPostService {
    @Autowired
    IPostRepo iPostRepo;

    @Autowired
    IDetailUserRepo iDetailUserRepo;

    public List<Post> findByAddress(String address) {
        return iPostRepo.findByAddress(address);
    }

    public List<Post> findByTyOfWork(String typeOfWork){
        return iPostRepo.findByTypeOfWork(typeOfWork);
    }

    public List<Post> findByPlace(String place){
        return iPostRepo.findByPlace(place);
    }

    public List<Post> findByTypeOfWorkAndPlace(String place, long id){
        return iPostRepo.findByTypeOfWorkAndPlace(place, id);
    }

    public List<Post> findByDetailUser(String name){
       return iPostRepo.findByDetailUser(name);
    }

    public List<DetailUser> findDetailUserByName(String name){
        return iDetailUserRepo.findDetailUserByName(name);
    }

    public List<Post> findByTitleAndAddress(String title, String address){
        return iPostRepo.findByAddressAndTitle(title, address);
    }

    public List<Post> findByAddressAndTypeOfWork(String address, String typeOfWork){
        return iPostRepo.findByAddressAndTypeOfWork(address, typeOfWork);
    }

    public List<Post> finAll() {

        return (List<Post>) iPostRepo.findAll();
    }
    public List<Post> findAllById(long id){
        return iPostRepo.findAllById(id);
    }


    public Post findById(long id) {
        return iPostRepo.findById(id).get();
    }

    public void save(Post post) {
        iPostRepo.save(post);
    }


}
