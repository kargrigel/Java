package week2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");

        double num = scanner.nextDouble();
        System.out.println("duble num is:" + num);

        float num1 = (float) num;
        System.out.println("float num is: " + num1);

        long num2 = (long) num1;
        System.out.println("long num is: " + num2);

        int num3 = (int) num2;
        System.out.println("int num is:" + num3);

        short num4 = (short) num3;
        System.out.println("short num is: " + num4);
    }
}
