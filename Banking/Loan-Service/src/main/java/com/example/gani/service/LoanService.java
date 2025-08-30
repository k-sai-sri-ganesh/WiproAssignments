package com.example.gani.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gani.entity.Loan;
import com.example.gani.repository.LoanRepository;

@Service
public class LoanService {

    @Autowired
    private LoanRepository repository;

    public Loan applyLoan(Loan loan) {
        return repository.save(loan);
    }

    public List<Loan> getLoansByAccount(Long accountId) {
        return repository.findByAccountId(accountId);
    }
}
