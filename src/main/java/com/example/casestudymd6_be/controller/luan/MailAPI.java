package com.example.casestudymd6_be.controller.luan;

import com.example.casestudymd6_be.model.AppUser;
import com.example.casestudymd6_be.service.luan.impl.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/mail")
public class MailAPI {
    @Autowired
    SendMailService sendMailService;

    @PostMapping ("/send")
    public boolean send(@RequestBody AppUser appUser){
        return sendMailService.sendMail(appUser.getEmail(),"Hello bạn nhỏ !", appUser.getUsername()+"Mã xác nhận của bạn là: ");
    }
    @GetMapping("/confirm")
    public String confirm(@RequestParam("code") String code){
        return sendMailService.confirmCode(code);
    }
    @GetMapping("/resetcode")
    public void resetcode(){
        sendMailService.rsCode();
    }
}
