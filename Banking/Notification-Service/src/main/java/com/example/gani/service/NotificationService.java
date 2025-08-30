package com.example.gani.service;

import org.springframework.stereotype.Service;

import com.example.gani.entity.NotificationRequest;

@Service
public class NotificationService {

    public void sendNotification(NotificationRequest request) {
        // Simulate sending email/SMS
        System.out.println("Sending notification to: " + request.getRecipient());
        System.out.println("Subject: " + request.getSubject());
        System.out.println("Message: " + request.getMessage());
    }
}
