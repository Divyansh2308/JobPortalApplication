package com.projects.jp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.jp.entities.JobPostActivity;
import com.projects.jp.entities.JobSeekerApply;
import com.projects.jp.entities.JobSeekerProfile;
import com.projects.jp.repo.JobSeekerApplyRepo;

@Service
public class JobSeekerApplyServiceImpl implements JobSeekerApplyService {

    @Autowired
    private JobSeekerApplyRepo jobSeekerApplyRepo;

    public List<JobSeekerApply> getCandidatesJobs(JobSeekerProfile userAccountId) {
        return jobSeekerApplyRepo.findByUserId(userAccountId);
    }

    public List<JobSeekerApply> getJobCandidates(JobPostActivity job) {
        return jobSeekerApplyRepo.findByJob(job);
    }

    public void addNew(JobSeekerApply jobSeekerApply) {
        jobSeekerApplyRepo.save(jobSeekerApply);
    }
}
