package com.yepp.bankapp.Persistance;

import com.yepp.bankapp.model.Account;
import com.yepp.bankapp.model.IBAN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;


@Repository
public interface AccountPersistance extends JpaRepository<Account, Integer> {

    Account findAccountByIban(final long id);
    Account save(Account account);

//    void updateBalance(final IBAN iban, Account acc, BigInteger newBalance);

//    float getBalanceByIban();
//    int findBalanceByUserAndIBAN();
}

//public class AccountPersistance {
//
//    private static ArrayList<Account> accountList = new ArrayList<>();
//
//    public Account listAccount(final IBAN iban) {
//        return accountList.stream().filter(account -> account.getIBAN().equals(iban.toString())).findFirst().orElse(null);
//    }
//
//    public void removeAccount(final IBAN iban) {
//        accountList.removeIf(acc -> acc.getIBAN().equals(iban.toString()));
//    }
//
//    public Account addAccount(final User user) {
//        Account nwAcc = new Account(user);
//        accountList.add(nwAcc);
//        return nwAcc;
//    }
//}
