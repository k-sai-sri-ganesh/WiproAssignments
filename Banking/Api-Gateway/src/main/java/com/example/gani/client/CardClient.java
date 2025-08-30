package com.example.gani.client;

import com.example.gani.client.dto.Card;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "card-service")
public interface CardClient {
    @GetMapping("/api/cards/{id}")
    Card getCardById(@PathVariable("id") Long id);
}
