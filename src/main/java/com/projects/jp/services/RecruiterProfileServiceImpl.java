package com.projects.jp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.projects.jp.entities.RecruiterProfile;
import com.projects.jp.entities.User;
import com.projects.jp.repo.RecruiterProfileRepo;
import com.projects.jp.repo.UserRepo;

@Service
public class RecruiterProfileServiceImpl implements RecruiterProfileService{

    @Autowired
    private RecruiterProfileRepo recruiterProfileRepo;

    @Autowired
    private UserRepo userRepo;
    
    public Optional<RecruiterProfile> getOne(Integer id) {
        return recruiterProfileRepo.findById(id);
    }

    public RecruiterProfile addNew(RecruiterProfile recruiterProfile) {
        return recruiterProfileRepo.save(recruiterProfile);
    }

    public RecruiterProfile getCurrentRecruiterProfile() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            String currentUsername = authentication.getName();
            User users = userRepo.findByEmail(currentUsername).orElseThrow(() -> new UsernameNotFoundException("User not found"));
            Optional<RecruiterProfile> recruiterProfile = getOne(users.getUserId());
            return recruiterProfile.orElse(null);
        } else return null;
    }
}
