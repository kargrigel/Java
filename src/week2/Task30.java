package week2;

//30.  Write a Java program by using two for loops to produce the output shown below:
//    Input N natural number, print picture like below in size N*N***********


import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        for(int i = 0; i < number; i++) {
            for(int j = 0; j < number; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}