package com.example.gani.service;

import org.springframework.stereotype.Service;

import com.example.gani.client.AccountClient;
import com.example.gani.client.CardClient;
import com.example.gani.client.LoanClient;
import com.example.gani.client.dto.Account;
import com.example.gani.client.dto.Card;
import com.example.gani.client.dto.Loan;

@Service
public class TransactionHelperService {

    private final AccountClient accountClient;
    private final LoanClient loanClient;
    private final CardClient cardClient;

    public TransactionHelperService(AccountClient accountClient, LoanClient loanClient, CardClient cardClient) {
        this.accountClient = accountClient;
        this.loanClient = loanClient;
        this.cardClient = cardClient;
    }

    public Account getAccount(Long id) {
        return accountClient.getAccountById(id);
    }

    public Loan getLoan(Long id) {
        return loanClient.getLoanById(id);
    }

    public Card getCard(Long id) {
        return cardClient.getCardById(id);
    }
}

