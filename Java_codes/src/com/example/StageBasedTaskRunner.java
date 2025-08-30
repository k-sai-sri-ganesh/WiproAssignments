package com.example;

import java.util.concurrent.*;

class Task {
    int id;
    String name;

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean isEven() {
        return id % 2 == 0;
    }

    @Override
    public String toString() {
        return "Task[" + id + ": " + name + "]";
    }
}

public class StageBasedTaskRunner {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Task> stage1 = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<Task> stage2 = new LinkedBlockingQueue<>();

        // Add tasks to stage 1
        for (int i = 1; i <= 6; i++) {
            stage1.put(new Task(i, "Task_" + i));
        }

        // Move only even tasks to stage 2
        while (!stage1.isEmpty()) {
            Task t = stage1.take();
            if (t.isEven()) {
                stage2.put(t);
                System.out.println("Moved to Stage 2: " + t);
            } else {
                System.out.println("Discarded (odd ID): " + t);
            }
        }

        System.out.println("\nFinal Stage 2 Tasks:");
        for (Task t : stage2) {
            System.out.println(t);
        }
    }
}
