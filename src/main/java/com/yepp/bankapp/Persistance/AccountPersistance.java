package com.yepp.bankapp.Persistance;

import com.yepp.bankapp.model.Account;
import com.yepp.bankapp.model.IBAN;
import com.yepp.bankapp.model.User;

import java.util.ArrayList;

public class AccountPersistance {

    private static ArrayList<Account> accountList = new ArrayList<>();

    public Account listAccount(final IBAN iban) {
        return accountList.stream().filter(account -> account.getIBAN().equals(iban.toString())).findFirst().orElse(null);
    }

    public void removeAccount(final IBAN iban) {
        accountList.removeIf(acc -> acc.getIBAN().equals(iban.toString()));
    }

    public void addAccount(final User user) {
        accountList.add(new Account(user));
    }
}
