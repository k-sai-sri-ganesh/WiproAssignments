package com.example;


import java.util.*;

class Patient {
    String name;
    int severity;
    long timestamp;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
        this.timestamp = System.nanoTime(); // timestamp to break ties
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class EmergencyPatientTracker {
    public static void main(String[] args) {
        Comparator<Patient> comparator = (a, b) -> {
            if (a.severity != b.severity)
                return Integer.compare(a.severity, b.severity);
            return Long.compare(a.timestamp, b.timestamp); // older first
        };

        PriorityQueue<Patient> queue = new PriorityQueue<>(5, comparator);

        addPatient(queue, new Patient("Alice", 3));
        addPatient(queue, new Patient("Bob", 2));
        addPatient(queue, new Patient("Charlie", 1));
        addPatient(queue, new Patient("David", 2));
        addPatient(queue, new Patient("Eva", 3));
        addPatient(queue, new Patient("Frank", 1)); // will not be added (max 5)

        System.out.println("\nTreating patients:");
        while (!queue.isEmpty()) {
            System.out.println("Treated: " + queue.poll());
        }
    }

    static void addPatient(PriorityQueue<Patient> queue, Patient p) {
        if (queue.size() < 5) {
            queue.add(p);
            System.out.println("Added: " + p);
        } else {
            System.out.println("Queue full. Cannot add: " + p);
        }
    }
}
