package com.example.gani.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.gani.client.dto.Account;

@FeignClient(name = "account-service")
public interface AccountClient {

    @GetMapping("/api/accounts/{id}")
    Account getAccountById(@PathVariable("id") Long id);

    // Define other calls you need
}
