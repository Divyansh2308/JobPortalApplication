package com.projects.jp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.jp.entities.JobPostActivity;
import com.projects.jp.entities.JobSeekerProfile;
import com.projects.jp.entities.JobSeekerSave;
import com.projects.jp.repo.JobSeekerSaveRepo;

@Service
public class JobSeekerSaveServiceImpl implements JobSeekerSaveService{

    @Autowired
    private JobSeekerSaveRepo jobSeekerSaveRepo;
    
    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId) {
        return jobSeekerSaveRepo.findByUserId(userAccountId);
    }

    public List<JobSeekerSave> getJobCandidates(JobPostActivity job) {
        return jobSeekerSaveRepo.findByJob(job);
    }

    public void addNew(JobSeekerSave jobSeekerSave) {
        jobSeekerSaveRepo.save(jobSeekerSave);
    }
}
