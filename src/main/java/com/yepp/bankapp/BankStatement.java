package com.yepp.bankapp;

import org.springframework.stereotype.Component;

@Component
public class BankStatement {
    private Category category;
    private IBAN sender;
    private IBAN receiver;
    private float amount;
}
