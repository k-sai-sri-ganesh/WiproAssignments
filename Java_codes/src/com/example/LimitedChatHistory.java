package com.example;

import java.util.ArrayDeque;
import java.util.Scanner;

public class LimitedChatHistory {
    public static void main(String[] args) {
        ArrayDeque<String> chatBox = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter chat messages. Type 'exit' to stop.");

        while (true) {
            String msg = scanner.nextLine();
            if (msg.equalsIgnoreCase("exit")) break;

            if (chatBox.size() == 4) {
                chatBox.removeFirst(); // remove oldest
            }

            chatBox.addLast(msg); // add newest
            System.out.println("Current Chat History: " + chatBox);
        }

        scanner.close();
    }
}
