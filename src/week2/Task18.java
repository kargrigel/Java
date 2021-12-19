package week2;

import java.util.Scanner;

//18. Write a java program to print all even numbers from a given range, from a to b. Input a and b from console.Example`
//        Input ` 2 Output ` 2 4
//        5
public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();
        if (a>b){
            for (int i=b; i<a; i++){
                if (i%2==0){
                    System.out.println(i);
                }
            }
        }else if (a<b){
            for (int i=a; i<b; i++){
                if (i%2==0){
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("Not have a range: ");
        }
    }
}
