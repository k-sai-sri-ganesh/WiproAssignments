package com.example.gani.client;

import com.example.gani.client.dto.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "account-service") // service name from Eureka
public interface AccountClient {

    @GetMapping("/api/accounts/{id}")
    Account getAccountById(@PathVariable("id") Long id);
}
