package com.yepp.bankapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    Integer id;

    @Embedded
    private IBAN iban;

    private float balance;

    @JsonBackReference
    @ManyToOne()
    private User user;

    public Account(User user) {
        this.iban = new IBAN();
        this.user = user;
    }

    public Account() {}

    public Integer getId() {
        return id;
    }

    public float getBalance() {
        return balance;
    }
//    private List<Transaction> transactions;

//    @Bean

//    public void addBankStatement(Transaction transaction) {
//        this.transactions.add(transaction);
//    }
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


//    private void deposit(){
//
//    }
//
//    private void transfer() {}

    public User getUser() {return this.user;}
    public String getIban() {
        return this.iban.getIban();
    }
}
