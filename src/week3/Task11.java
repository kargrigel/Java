package week3;

import java.util.Scanner;
//11. Write a java program to find maximum from a given 3 integer numbers using ternary operator.Input numbers from console.
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;

        max = (a>b ? a:b);
        max= a>c ? a:c;
        System.out.println(max);

    }
}
