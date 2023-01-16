package com.yepp.bankapp.model;

public class SavingsAccount extends Account {
    private float interestRate;
    private float interestAmount;
    SavingsAccount(final User user) {
        super(user);
    }
}
