package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int feet = 5;
        int inches = 9;

        double totalCM = calcFeetAndInchesToCentimeters(feet,inches);
        System.out.println(feet + " feet and " + inches + " inches is " + totalCM + "cm.");

        double inchesToFeet = calcFeetAndInchesToCentimeters(inches);
        System.out.println(inches + " inches in feet is " + inchesToFeet + " feet.");
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if((feet < 0) || (inches < 0)){
            return -1;
        } else {
            int totalInches = feet * 12 + inches;
            double centimeters = totalInches * 2.54;
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if (inches < 0 ){
            return -1;
        } else {
            double feet = inches / 12;
            return inches / 12;
        }
    }
}