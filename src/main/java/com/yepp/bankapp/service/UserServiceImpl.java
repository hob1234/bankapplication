package com.yepp.bankapp.service;

import com.yepp.bankapp.Persistance.UserPersistence;
import com.yepp.bankapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserPersistence userPersistence;

    @Override
    public List<User> findUsersById(final Integer id) {
        return userPersistence.findAllById(id);
    }
    @Override
    public List<User> findUsersByName(final String name) {
        return userPersistence.findAllByName(name);
    }

    @Override
    public User createUser(User user) {
        return userPersistence.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userPersistence.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userPersistence.deleteUserById(id);
    }


}
