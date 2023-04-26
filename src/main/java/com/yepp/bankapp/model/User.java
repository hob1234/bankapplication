package com.yepp.bankapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Entity
@Table(name = "users")
//@Repository
//@Component
//@ConfigurationProperties(prefix = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //TODO add username (e.g. email) and use it instead of name
    private String name;
    private String lastName;
    private String password;

    @OneToMany
    private List<Account> accountList;
    public Integer getId() {
        return id;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
//    private float balance;
}
