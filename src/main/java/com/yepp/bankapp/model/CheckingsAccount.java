package com.yepp.bankapp.model;

import org.springframework.stereotype.Component;

@Component
public class CheckingsAccount extends Account {

    CheckingsAccount(final User user) {
        super(user);
    }
}
