package com.yepp.bankapp.service;

import com.yepp.bankapp.model.IBAN;
import com.yepp.bankapp.model.Transaction;

import java.util.List;

interface TransactionService {
    public List<Transaction> listTransactions(IBAN iban);
    public void addTransaction();
    public void removeTransaction();
}
