package week2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

            if (age>18){
                System.out.println("You can vote! ");
            }
            else {

            System.out.println("You are not eligible to vote! ");
        }
    }
}
