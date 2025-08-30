package com.example;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ReversedTaskQueue {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 4 tasks:");
        for (int i = 0; i < 4; i++) {
            String task = scanner.nextLine();
            if (task.endsWith("!")) {
                tasks.addFirst(task);
            } else {
                tasks.addLast(task);
            }
        }

        // Print in reverse
        System.out.println("\nTasks in reverse:");
        ListIterator<String> iterator = tasks.listIterator(tasks.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        scanner.close();
    }
}
