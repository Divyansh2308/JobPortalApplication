package com.projects.jp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.jp.entities.UserType;
import com.projects.jp.repo.UserTypeRepo;

@Service
public class UserTypeServiceImpl implements UserTypeService{

    @Autowired
    private UserTypeRepo userTypeRepo;

    @Override
    public List<UserType> getAll() {
        return userTypeRepo.findAll();    
    }

}
