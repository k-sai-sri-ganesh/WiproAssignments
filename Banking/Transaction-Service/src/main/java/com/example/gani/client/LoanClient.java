package com.example.gani.client;

import com.example.gani.client.dto.Loan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "loan-service")
public interface LoanClient {
    @GetMapping("/api/loans/{id}")
    Loan getLoanById(@PathVariable("id") Long id);
}