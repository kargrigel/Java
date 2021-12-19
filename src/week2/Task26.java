package week2;

//  26.    Calculate the sum of the given 10 natural numbers.
//      Input integers from console

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i <10; i++) {
            int num = input.nextInt();
            while (num < 0) {
                num = input.nextInt();
            }
            sum += num;
        }
        System.out.println(sum);
    }
}