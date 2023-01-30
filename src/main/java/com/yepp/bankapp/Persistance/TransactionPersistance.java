package com.yepp.bankapp.Persistance;

import com.yepp.bankapp.model.IBAN;
import com.yepp.bankapp.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionPersistance {

    final ArrayList<Transaction> transactions = new ArrayList<>();
    public List<Transaction> listTransactions(final IBAN iban) {
        return transactions.stream().filter(transaction -> transaction.getReceiver().equals(iban)).toList();
    }
}
