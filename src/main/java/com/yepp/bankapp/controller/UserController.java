package com.yepp.bankapp.controller;

import com.yepp.bankapp.model.User;
import com.yepp.bankapp.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @GetMapping("/user/{id}")
    public List<User> listAccount(@PathVariable Integer id) {
        return userService.findUsersById(id);
    }

    @PostMapping("/user/{id}")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return null;
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Integer id) {
        return null;
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable final String id) {
        return null;
    }
}
