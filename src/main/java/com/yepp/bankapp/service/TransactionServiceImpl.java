package com.yepp.bankapp.service;

import com.yepp.bankapp.Persistance.TransactionPersistance;
import com.yepp.bankapp.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionPersistance transactionPersistance;

//    @Query(
//            value = "SELECT * FROM project_generation_result r WHERE r.request_id = :requestId",
//            nativeQuery = true
//    )
//    fun findByRequestId(requestId: Long): Optional<ProjectGenerationResultSucceededDAO>

    @Override
//    @Query(
//            value = "SELECT * FROM transactions r WHERE r.request_id = :requestId",
//            nativeQuery = true
//    )
    public List<Transaction> listTransactions(final Integer userId) {
        return transactionPersistance.findTransactionsBySenderId(userId);
    }

    @Override
    public void addTransaction() {

    }

    @Override
    public void removeTransaction() {

    }

    public Transaction findTransactionById(Integer transactionId) {
        return transactionPersistance.findTransactionById(transactionId);
    }
}
