package com.example.gani.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gani.entity.NotificationRequest;
import com.example.gani.service.NotificationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    private NotificationService service;

    @PostMapping
    public ResponseEntity<String> sendNotification(@Valid @RequestBody NotificationRequest request) {
        service.sendNotification(request);
        return ResponseEntity.ok("Notification sent.");
    }
}
