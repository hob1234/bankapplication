package com.yepp.bankapp.model;

import org.springframework.stereotype.Component;

@Component
public class Transaction {
    private Category category;
    private IBAN sender;
    private IBAN receiver;
    private float amount;

    public IBAN getReceiver() {
        return receiver;
    }

    public float getAmount() {
        return amount;
    }

    public IBAN getSender() {
        return sender;
    }
}
