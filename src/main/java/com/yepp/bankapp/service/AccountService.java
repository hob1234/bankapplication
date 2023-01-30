package com.yepp.bankapp.service;

import com.yepp.bankapp.model.Account;
import com.yepp.bankapp.model.IBAN;
import com.yepp.bankapp.model.User;

import java.util.List;

interface AccountService {
    public Account listAccount(IBAN iban) throws Exception;
    public void removeAccount(IBAN iban);
    public void addAccount(User user);
    public float getAmount(IBAN iban);
    public void updateAmount(IBAN iban);
}
