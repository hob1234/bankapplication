package com.yepp.bankapp.service;

import com.yepp.bankapp.model.Account;
import com.yepp.bankapp.model.User;

interface AccountService {
    public Account listAccount(Integer id) throws Exception;
    public void removeAccount(Integer id);
    public User addAccount(User user);
    public float getAmount(Integer id);
//    public void updateBalance(final IBAN iban, Account acc, float newBalance);
}
