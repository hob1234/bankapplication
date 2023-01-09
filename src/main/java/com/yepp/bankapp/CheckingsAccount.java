package com.yepp.bankapp;

import org.springframework.stereotype.Component;

@Component
public class CheckingsAccount extends Account{

    CheckingsAccount(final User user) {
        super(user);
    }
}
