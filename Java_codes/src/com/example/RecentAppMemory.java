package com.example;

import java.util.LinkedList;
import java.util.Scanner;

public class RecentAppMemory {
    public static void main(String[] args) {
        LinkedList<String> recentApps = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 app names:");

        for (int i = 0; i < 5; i++) {
            String app = scanner.nextLine();

            // Remove if already exists
            recentApps.remove(app);

            // Add to top
            recentApps.addFirst(app);
        }

        System.out.println("Final app list (most recent first):");
        for (String app : recentApps) {
            System.out.println(app);
        }

        scanner.close();
    }
}
