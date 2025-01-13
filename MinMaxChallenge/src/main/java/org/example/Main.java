package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");

        while (true) {
            int[] numbers = new int[5];

            // Input numbers
            for (int i = 1; i <= 5; i++) {
                while (true) {
                    try {
                        System.out.println("Please enter number " + i + ":");
                        numbers[i - 1] = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next(); // Clear invalid input
                    }
                }
            }

            // Display numbers
            System.out.println("Your Numbers:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Number " + (i + 1) + ": " + numbers[i]);
            }

            // Sort numbers
            int[] sortedNumbers = numbers.clone();
            for (int i = 0; i < sortedNumbers.length; i++) {
                for (int j = i + 1; j < sortedNumbers.length; j++) {
                    if (sortedNumbers[i] > sortedNumbers[j]) {
                        int temp = sortedNumbers[i];
                        sortedNumbers[i] = sortedNumbers[j];
                        sortedNumbers[j] = temp;
                    }
                }
            }

            // Display sorted numbers
            System.out.println("Sorted Numbers:");
            for (int i = 0; i < sortedNumbers.length; i++) {
                System.out.println("Number " + (i + 1) + ": " + sortedNumbers[i]);
            }

            System.out.println("----------------");
            System.out.println("Max = " + sortedNumbers[sortedNumbers.length - 1]);
            System.out.println("Min = " + sortedNumbers[0]);

            // Ask if the user wants to continue
            scanner.nextLine(); // Consume leftover newline
            while (true) {
                System.out.println("Another? (y/n):");
                String another = scanner.nextLine().trim();
                if (another.equalsIgnoreCase("y")) {
                    break; // Continue the outer loop
                } else if (another.equalsIgnoreCase("n")) {
                    System.out.println("Goodbye!");
                    scanner.close();
                    return; // Exit the program
                } else {
                    System.out.println("Invalid input. Please enter 'y' or 'n'.");
                }
            }
        }
    }
}
