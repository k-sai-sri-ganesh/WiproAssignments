package com.example;

import java.util.concurrent.LinkedBlockingQueue;

public class ChatProcessor {
    private static final LinkedBlockingQueue<String> messageQueue = new LinkedBlockingQueue<>(5);

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            int count = 1;
            try {
                while (count <= 10) {
                    String message = "Message " + count;
                    messageQueue.put(message);  // blocks if full
                    System.out.println("Sent: " + message);
                    count++;
                    Thread.sleep(300);  // simulate delay
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    String received = messageQueue.take();  // blocks if empty
                    System.out.println("Received: " + received);
                    Thread.sleep(500);  // simulate processing
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
