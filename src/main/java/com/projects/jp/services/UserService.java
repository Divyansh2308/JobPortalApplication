package com.projects.jp.services;

import com.projects.jp.entities.User;

import java.util.Optional;

public interface UserService {

    public User addNew(User user);

    public Object getCurrentUserProfile();

     public Optional<User> getUserByEmail(String email);

     public User getCurrentUser();

     public User findByEmail(String currentUsername);
}
