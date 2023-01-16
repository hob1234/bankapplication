package com.yepp.bankapp.config;

import com.yepp.bankapp.model.User;
import com.yepp.bankapp.model.Account;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(User.class)
public class AccountConfiguration {

    @Bean
    public Account createAccount(User user) {
        return new Account(user);
    }

//    public Account createCheckingAccount(User user) {
//        return new SavingsAccount(user);
//    }



}
