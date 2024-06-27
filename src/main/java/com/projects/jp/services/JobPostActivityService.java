package com.projects.jp.services;

import java.time.LocalDate;
import java.util.List;

import com.projects.jp.entities.JobPostActivity;
import com.projects.jp.entities.RecruiterJobsDto;

public interface JobPostActivityService {

    public JobPostActivity addNew(JobPostActivity jobPostActivity);

    public List<RecruiterJobsDto> getRecruiterJobs(int recruiter);

    public JobPostActivity getOne(int id);

    public List<JobPostActivity> getAll();

    public List<JobPostActivity> search(String job, String location, List<String> type, List<String> remote, LocalDate searchDate);
}
