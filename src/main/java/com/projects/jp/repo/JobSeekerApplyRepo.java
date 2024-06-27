package com.projects.jp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projects.jp.entities.JobPostActivity;
import com.projects.jp.entities.JobSeekerApply;
import com.projects.jp.entities.JobSeekerProfile;

import java.util.List;

@Repository
public interface JobSeekerApplyRepo extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);
}
