package com.projects.jp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projects.jp.entities.JobPostActivity;
import com.projects.jp.entities.JobSeekerProfile;
import com.projects.jp.entities.JobSeekerSave;

import java.util.List;

@Repository
public interface JobSeekerSaveRepo extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}
