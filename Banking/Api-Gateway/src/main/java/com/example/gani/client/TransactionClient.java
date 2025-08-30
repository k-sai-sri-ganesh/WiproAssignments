package com.example.gani.client;

import com.example.gani.client.dto.Transaction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "transaction-service")
public interface TransactionClient {
    @GetMapping("/api/transactions/{id}")
    Transaction getTransactionById(@PathVariable("id") Long id);
}
