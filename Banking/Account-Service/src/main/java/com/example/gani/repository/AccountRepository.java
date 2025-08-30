package com.example.gani.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gani.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
