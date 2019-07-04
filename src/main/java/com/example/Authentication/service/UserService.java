package com.example.Authentication.service;



import com.example.Authentication.model.User;

import java.util.List;

public interface UserService {

    User save(User user);
    List<User> findAll();

}
