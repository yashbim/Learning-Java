package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int addTwo = addNumbers(a,b);
        System.out.println(addTwo);

        int addThree = addNumbers(a,b,c);
        System.out.println(addThree);

        int addFour = addNumbers(a,b,c,d);
        System.out.println(addFour);

    }

    public static int addNumbers (int a, int b){
        return a+b;
    }

    public static int addNumbers (int a, int b, int c){
        return a+b+c;
    }

    public static int addNumbers (int a, int b, int c, int d){
        return a+b+c+d;
    }


}