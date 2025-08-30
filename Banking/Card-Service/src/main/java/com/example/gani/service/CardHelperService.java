package com.example.gani.service;

import com.example.gani.client.AccountClient;
import com.example.gani.client.dto.Account;
import org.springframework.stereotype.Service;

@Service
public class CardHelperService {

    private final AccountClient accountClient;

    public CardHelperService(AccountClient accountClient) {
        this.accountClient = accountClient;
    }

    public Account fetchAccountDetails(Long accountId) {
        return accountClient.getAccountById(accountId);
    }
}
