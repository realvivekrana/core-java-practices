package chapter8;

import java.util.Scanner;

public abstract class arrays {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        for(int i = 0; i < marks.length; i++){
            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
        }

        System.out.println("\nMarks");

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }




        // int [] marks = {65,89,58,98,74};

        // for(int i = 0; i < marks.length; i++){
        //     System.out.println(marks[i]);
        // }




        // System.out.println(marks[0]);
        // System.out.println(marks[4]);
        // System.out.println(marks[2]);

        // marks[1] = 100;
        // // System.out.println(marks[1]);
        // System.out.println(marks.length);
    }
}
