package com.projects.jp.services;

import java.util.List;

import com.projects.jp.entities.JobPostActivity;
import com.projects.jp.entities.JobSeekerApply;
import com.projects.jp.entities.JobSeekerProfile;

public interface JobSeekerApplyService {

    public List<JobSeekerApply> getCandidatesJobs(JobSeekerProfile userAccountId);

    public List<JobSeekerApply> getJobCandidates(JobPostActivity job);

    public void addNew(JobSeekerApply jobSeekerApply);
}
