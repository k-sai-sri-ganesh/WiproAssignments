package com.example;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Last3Searches {
    public static void main(String[] args) {
        ArrayDeque<String> searchHistory = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter search terms (type 'exit' to quit):");

        while (true) {
            System.out.print("Search: ");
            String term = scanner.nextLine();
            if (term.equalsIgnoreCase("exit")) break;

            if (searchHistory.size() == 3) {
                searchHistory.removeFirst(); // Remove oldest
            }
            searchHistory.addLast(term);

            System.out.println("Current search history: " + searchHistory);
        }

        scanner.close();
    }
}
