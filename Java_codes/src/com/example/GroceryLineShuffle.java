package com.example;

import java.util.ArrayDeque;
import java.util.Scanner;

public class GroceryLineShuffle {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 customer names:");

        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            if (name.length() % 2 == 0) {
                queue.addFirst(name); // even length
            } else {
                queue.addLast(name); // odd length
            }
        }

        System.out.println("\nServing order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.removeFirst());
        }

        scanner.close();
    }
}

