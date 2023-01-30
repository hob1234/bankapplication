package com.yepp.bankapp.service;

import com.yepp.bankapp.Persistance.TransactionPersistance;
import com.yepp.bankapp.model.IBAN;
import com.yepp.bankapp.model.Transaction;

import java.util.List;

public class TransactionServiceImpl implements TransactionService {
    @Override
    public List<Transaction> listTransactions(final IBAN iban) {
        TransactionPersistance persistance = new TransactionPersistance();
        return persistance.listTransactions(iban);
    }

    @Override
    public void addTransaction() {

    }

    @Override
    public void removeTransaction() {

    }
}
