package com.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.Scanner;

public class PrintManager {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> printQueue = new ArrayBlockingQueue<>(3);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter print jobs. Type 'print' to print next job or 'exit' to stop.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) break;

            if (input.equalsIgnoreCase("print")) {
                String job = printQueue.poll();
                if (job != null) {
                    System.out.println("Printing: " + job);
                } else {
                    System.out.println("Queue is empty.");
                }
            } else {
                if (!printQueue.offer(input)) {
                    System.out.println("Queue full! Job skipped: " + input);
                } else {
                    System.out.println("Added to queue: " + input);
                }
            }
        }

        scanner.close();
    }
}
