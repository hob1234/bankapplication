package com.yepp.bankapp;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Account {

    private User user;
    private IBAN IBAN;

    private List<BankStatement> bankStatements;

//    @Bean
    Account(User user) {
        this.user = user;
        this.IBAN = new IBAN();
    }

    public void addBankStatement(BankStatement bankStatement) {
        this.bankStatements.add(bankStatement);
    }
//
//    public float getBalance() {
//        return balance;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String setLastName() {
//        return lastName;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(final String name) {
//        this.name = name;


    private void deposit(){

    }

    private void transfer() {}

    public String getIBAN() {
        return this.IBAN.getIBAN();
    }
}
