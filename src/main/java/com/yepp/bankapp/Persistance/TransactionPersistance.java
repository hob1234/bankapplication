package com.yepp.bankapp.Persistance;

import com.yepp.bankapp.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionPersistance extends JpaRepository<Transaction, Integer> {
    List<Transaction> findTransactionsBySenderId(final Integer id);

    Transaction findTransactionById(final Integer id);
}