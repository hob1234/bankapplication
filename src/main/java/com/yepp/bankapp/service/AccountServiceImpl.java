package com.yepp.bankapp.service;

import com.yepp.bankapp.Persistance.AccountPersistance;
import com.yepp.bankapp.model.Account;
import com.yepp.bankapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountPersistance accountPersistance;

    @Override
    public Account listAccount(Integer id) throws Exception {
        if (accountPersistance.findAccountByIban(id) != null) {
            return accountPersistance.findAccountByIban(id);
        }
        throw new Exception("No account exists for this user.");
    }

    @Override
    public void removeAccount(final Integer id) {
        accountPersistance.deleteAllById(Collections.singleton(1));
    }

    @Override
    public User addAccount(final User user) {
        accountPersistance.save(new Account(user));
        return user;
    }

    @Override
    public float getAmount(final Integer id) {
        Account acc = accountPersistance.findAccountByIban(id);
        return acc.getBalance();
    }

    public List<Account> findAllAccounts() {
        return accountPersistance.findAll();

    }

//    @Override
//    public void updateBalance(final IBAN iban, Account acc, BigInteger newBalance) {
////        float curBalance = acc.getBalance();
//        accountPersistance.updateBalance(iban, acc, newBalance);
//    }
}
