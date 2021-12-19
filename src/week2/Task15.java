package week2;

//  15.    For a given natural N print the smallest integer k that`
//        Math.pow (2,k)≥N.(You can not use Math.pow())
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n/2; i++) {
            while (i * i < n) {
                i++;
            }
            System.out.println(i);
        }
    }
}