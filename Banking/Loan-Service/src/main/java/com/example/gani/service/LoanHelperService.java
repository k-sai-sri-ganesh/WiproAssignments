package com.example.gani.service;

import com.example.gani.client.AccountClient;
import com.example.gani.client.CardClient;
import com.example.gani.client.dto.Account;
import com.example.gani.client.dto.Card;
import org.springframework.stereotype.Service;

@Service
public class LoanHelperService {

    private final AccountClient accountClient;
    private final CardClient cardClient;

    public LoanHelperService(AccountClient accountClient, CardClient cardClient) {
        this.accountClient = accountClient;
        this.cardClient = cardClient;
    }

    public Account fetchAccount(Long id) {
        return accountClient.getAccountById(id);
    }

    public Card fetchCard(Long id) {
        return cardClient.getCardById(id);
    }
}
