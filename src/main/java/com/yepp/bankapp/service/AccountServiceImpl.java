package com.yepp.bankapp.service;

import com.yepp.bankapp.Persistance.AccountPersistance;
import com.yepp.bankapp.model.Account;
import com.yepp.bankapp.model.IBAN;
import com.yepp.bankapp.model.User;

public class AccountServiceImpl implements AccountService {

    @Override
    public Account listAccount(final IBAN iban) throws Exception {
        AccountPersistance client = new AccountPersistance();
        if (client.listAccount(iban) != null) {
            client.listAccount(iban);
        }
        throw new Exception("No account exists for this user.");
    }

    @Override
    public void removeAccount(final IBAN iban) {
        AccountPersistance client = new AccountPersistance();
        client.removeAccount(iban);
    }

    @Override
    public void addAccount(final User user) {
        AccountPersistance client = new AccountPersistance();
        client.addAccount(user);
    }

    @Override
    public float getAmount(final IBAN iban) {
        return 0;
    }

    @Override
    public void updateAmount(final IBAN iban) {
    }
}
