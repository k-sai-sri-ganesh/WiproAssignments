package com.example;

public class AverageConfusion {
    public static void main(String[] args) {
        int[] numbers = {5, 15, 7, 20, 8}; // Example input
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 10) {
                numbers[i] *= 2;
            }
            sum += numbers[i];
        }

        double average = sum / (double) numbers.length;
        System.out.println("Average: " + average);
    }
}
