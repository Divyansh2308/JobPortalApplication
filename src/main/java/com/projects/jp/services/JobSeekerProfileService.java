package com.projects.jp.services;

import java.util.Optional;

import com.projects.jp.entities.JobSeekerProfile;

public interface JobSeekerProfileService {

    public Optional<JobSeekerProfile> getOne(Integer id);

    public JobSeekerProfile addNew(JobSeekerProfile jobSeekerProfile);

    public JobSeekerProfile getCurrentSeekerProfile();
}
