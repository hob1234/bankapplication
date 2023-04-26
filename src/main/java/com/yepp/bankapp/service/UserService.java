package com.yepp.bankapp.service;

import com.yepp.bankapp.model.User;

import java.util.List;

public interface UserService {
    List<User> findUsersById(Integer id);

    List<User> findUsersByName(String name);

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(Integer id);
}
