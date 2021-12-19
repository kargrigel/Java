package week2;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        int count = 0;
            for (int i = 1; i<=x; i++){
                if (x % i ==0){
                    count+=1;
                    System.out.println("Your numbers is: "+ i);
                }
            }
    }
}
