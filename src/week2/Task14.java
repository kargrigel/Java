package week2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 2;
        int result = 1;

        for (int i=1; i<n ; i++){
            result = result*a;
            if (result>n){
                result=result/2;
                break;
            }
        }
        System.out.println(result);
    }
}
