package org.example;

public class Main {
    public static void main(String[] args) {
        int test_number = 75;
        int findMark1 = calculateMark("Bimsara",test_number);
        System.out.println(findMark1);
        int findmark2 = calculateMark(test_number);
        System.out.println(findmark2);
        int findmark3 = calculateMark();
        System.out.println(findmark3);
    }

    public static int calculateMark(String studentName, int studentMark){
        System.out.println("Student " + studentName + " scored " + studentMark + " marks. ");
        System.out.println("Here is the mark + 1");
        return studentMark+1;
    }

    public static int calculateMark(int studentMark){
        System.out.println("Mark " +  studentMark);
        System.out.println("Here is the mark + 2");
        return studentMark+2;
    }

    public static int calculateMark(){
        System.out.println("I don't know the mark");
        return 0;
    }

}