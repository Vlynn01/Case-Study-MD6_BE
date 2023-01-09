package com.example.casestudymd6_be.model.dto;

import com.example.casestudymd6_be.model.TypeOfWork;

public class FindMultiple {
    private String nameDetailUser;
    private String address;
    private String typeOfWork;
    private String title;


//    public FindMultiple(String nameDetailUser, long address, TypeOfWork typeOfWork, String title) {
//        this.nameDetailUser = nameDetailUser;
//        this.address = address;
//        this.typeOfWork = typeOfWork;
//        this.title = title;
//    }
//
//    public FindMultiple(long address, String title) {
//        this.address = address;
//        this.title = title;
//    }

    public String getNameDetailUser() {
        return nameDetailUser;
    }

    public void setNameDetailUser(String nameDetailUser) {
        this.nameDetailUser = nameDetailUser;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeOfWork() {
        return typeOfWork;
    }

    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
