package week2;

//  31.    Write a program that prompts the user for the size
//      (a non-negative integer in int); and prints the following
//      checkerboard pattern.# # # # # # # N * N
//        # # # # # # #
//        # # # # # # #
//        # # # # # # #
//        # # # # # # #
//        # # # # # # ##


import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int nonNegativeNumber = input.nextInt();
        while(nonNegativeNumber < 0) {
            System.out.print("Enter a non negative number: ");
            nonNegativeNumber = input.nextInt();
        }
        for(int i = 0; i < nonNegativeNumber; i++) {
            for(int j = 0; j < nonNegativeNumber; j++) {
                System.out.print(" # ");
            }
            System.out.println();
        }
    }
}