package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 0; // initial number
        String status = null; // inital state for 0

        number = numberInput(number);
        status = checkNumber(number);
        printNumberStatus(status);
//        System.out.printf("Number is %s", status);

    }

    public static int numberInput(int number){
        System.out.println(number);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        number = scanner.nextInt();
        return number;
    }

    public static String checkNumber(int number){
        if(number == 0){
            return "zero";
        } else if(number > 0){
            return "positive";
        } else if(number < 0 ) {
            return "negative";
        } else {
            return "error";
        }
    }

    public static void printNumberStatus(String status){
        System.out.printf("Number is %s", status);
    }
}