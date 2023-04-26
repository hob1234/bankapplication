package com.yepp.bankapp.service;

import com.yepp.bankapp.model.IBAN;
import com.yepp.bankapp.model.Transaction;

import java.util.List;

public
interface TransactionService {
    public List<Transaction> listTransactions(Integer id);

    public void addTransaction();

    public void removeTransaction();
    public Transaction findTransactionById(Integer id);


}
