package com.projects.jp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.projects.jp.entities.JobSeekerProfile;
import com.projects.jp.entities.User;
import com.projects.jp.repo.JobSeekerProfileRepo;
import com.projects.jp.repo.UserRepo;

@Service
public class JobSeekerProfileServiceImpl implements JobSeekerProfileService {

    @Autowired
    private JobSeekerProfileRepo jobSeekerProfileRepo;

    @Autowired
    private UserRepo userRepo;

    public Optional<JobSeekerProfile> getOne(Integer id) {
        return jobSeekerProfileRepo.findById(id);
    }

    public JobSeekerProfile addNew(JobSeekerProfile jobSeekerProfile) {
        return jobSeekerProfileRepo.save(jobSeekerProfile);
    }

    public JobSeekerProfile getCurrentSeekerProfile() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            String currentUsername = authentication.getName();
            User users = userRepo.findByEmail(currentUsername).orElseThrow(() -> new UsernameNotFoundException("User not found"));
            Optional<JobSeekerProfile> seekerProfile = getOne(users.getUserId());
            return seekerProfile.orElse(null);
        } else return null;
    }
}
