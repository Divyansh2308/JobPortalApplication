package com.projects.jp.services;

import java.util.Optional;

import com.projects.jp.entities.RecruiterProfile;

public interface RecruiterProfileService {

    public Optional<RecruiterProfile> getOne(Integer id);

    public RecruiterProfile addNew(RecruiterProfile recruiterProfile);

    public RecruiterProfile getCurrentRecruiterProfile();
}
