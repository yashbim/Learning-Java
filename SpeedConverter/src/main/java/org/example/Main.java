package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num = 0;
        double input_speed = input_speed(num);
        double new_speed = toMilesPerHour(input_speed);
        printMilesPerHour(new_speed);
    }

    public static double input_speed(double input_speed) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speed in Kmh");
        input_speed = scanner.nextDouble();
        return input_speed;
    }

    public static double toMilesPerHour(double input_speed){
        if (input_speed < 0){
            return -1;
        } else {
            double new_speed = input_speed*0.621371192 ;
            double new_speed_rounded = Math.round(new_speed);
            return new_speed_rounded;
        }
    }

    public static void printMilesPerHour(double new_speed){
        if (new_speed < 0 ){
            System.out.println("Invalid speed");
        } else {
            System.out.print(new_speed);
        }
    }
}