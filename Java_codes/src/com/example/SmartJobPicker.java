package com.example;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;

class Job {
    String name;
    int urgency;

    public Job(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return name + " (Urgency: " + urgency + ")";
    }
}

public class SmartJobPicker {
    public static void main(String[] args) {
        // Custom comparator: lower urgency first, tie → shorter name
        PriorityQueue<Job> jobQueue = new PriorityQueue<>(new Comparator<Job>() {
            public int compare(Job a, Job b) {
                if (a.urgency != b.urgency)
                    return Integer.compare(a.urgency, b.urgency);
                return Integer.compare(a.name.length(), b.name.length());
            }
        });

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 jobs with their urgency (1-5):");

        for (int i = 0; i < 5; i++) {
            System.out.print("Job name: ");
            String name = scanner.nextLine();
            System.out.print("Urgency (1-5): ");
            int urgency = scanner.nextInt();
            scanner.nextLine(); // consume newline
            jobQueue.add(new Job(name, urgency));
        }

        System.out.println("\nJobs in execution order (most urgent first):");
        while (!jobQueue.isEmpty()) {
            System.out.println(jobQueue.poll());
        }

        scanner.close();
    }
}
