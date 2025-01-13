package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Bimsara", 20000);
        Customer customer2 = new Customer("Yashasshree", 30000);
        Customer customer3;
        customer3 = customer1;
        customer3.setBalance(50000);
        System.out.println("Balance for customer1" + customer1.getBalance() + "\n");

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(100);
        intList.add(200);
        intList.add(300);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + " : " +intList.get(i));
        }


        intList.add(12000);
        intList.add(700);


        System.out.println("===========");

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + " : " +intList.get(i));
        }
    }
}