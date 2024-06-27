package com.projects.jp.services;

import java.util.List;

import com.projects.jp.entities.JobPostActivity;
import com.projects.jp.entities.JobSeekerProfile;
import com.projects.jp.entities.JobSeekerSave;

public interface JobSeekerSaveService {

    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId);

     public List<JobSeekerSave> getJobCandidates(JobPostActivity job);

     public void addNew(JobSeekerSave jobSeekerSave);    
}
