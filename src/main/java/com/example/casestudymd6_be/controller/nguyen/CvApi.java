package com.example.casestudymd6_be.controller.nguyen;


import com.example.casestudymd6_be.model.CvUser;
import com.example.casestudymd6_be.repository.nguyen.ICvUserRepo;
import com.example.casestudymd6_be.service.nguyen.interfaceService.ICvUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin("*")
@RequestMapping("/cv")
public class CvApi {

    @Autowired
    ICvUserService cvUserService;


    //    Tạo Cv
    @PostMapping()
    public ResponseEntity<CvUser> saveCvUser(@RequestBody CvUser cvUser) {
        cvUserService.save(cvUser);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //    Lưu Cv
    @GetMapping("/findCvByIdUser/{id}")
    public ResponseEntity<CvUser> findCvByIdUser(@PathVariable int id) {
        return new ResponseEntity<>(cvUserService.findByIdApplyUser(id), HttpStatus.OK);
    }
}
