package week3;

import java.util.Scanner;
//8. Input int values a and b from console
//        if one of them is multiple of 7, and both positive, and a greater than b, print all odd values between them
//        else print all even values between them
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();

        if ((a % 7 == 0 || b % 7 == 0) && (a > 0 && b > 0) && a > b) {
            for (int i = b + 1; i < a; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd numbers is: " + i);
                }
            }
        } else {
            if (a == b) {
                System.out.println("A is equal B");
            }
            if (a > b) {
                for (int i = b + 1; i < a; i++) {
                    if (i % 2 == 0) {
                        System.out.println("Even numbers between B to A  is: " + i);
                    }
                }
            } else {
                for (int i = a + 1; i < b; i++) {
                    if (i % 2 == 0) {
                        System.out.println("Even numbers between A to B  is: " + i);
                    }
                }
            }
        }
    }
}
