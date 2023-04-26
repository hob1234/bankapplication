package com.yepp.bankapp.controller;

import com.yepp.bankapp.model.Account;
import com.yepp.bankapp.model.User;
import com.yepp.bankapp.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class BankAccountController {
    @Autowired
    AccountServiceImpl accountService;

    @GetMapping("/accounts/{id}")
    public Account listAccount(@PathVariable Integer id) throws Exception {
        return accountService.listAccount(id);
    }

    @DeleteMapping("/accounts/{id}")
    public ResponseEntity<Void> removeAccount(@PathVariable final Integer id) {
        accountService.removeAccount(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/accounts")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        User savedUser = accountService.addAccount(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
