package com.example.gani.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gani.entity.Card;
import com.example.gani.repository.CardRepository;

@Service
public class CardService {

    @Autowired
    private CardRepository repository;

    public Card createCard(Card card) {
        return repository.save(card);
    }

    public List<Card> getCardsByAccount(Long accountId) {
        return repository.findByAccountId(accountId);
    }
}
