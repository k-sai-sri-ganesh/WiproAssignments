package com.example.gani.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gani.entity.Transaction;
import com.example.gani.repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repository;

    public Transaction createTransaction(Transaction transaction) {
        return repository.save(transaction);
    }

    public List<Transaction> getTransactionsForAccount(Long accountId) {
        return repository.findByFromAccountIdOrToAccountId(accountId, accountId);
    }
}

