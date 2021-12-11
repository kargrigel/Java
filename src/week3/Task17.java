package week3;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum_of_digits = 0;
        while (n > 0) {
            sum_of_digits = sum_of_digits + n % 10;
            n/= 10;
        }
        System.out.println(sum_of_digits);
    }
}
