package week3;
//14. Print all integer powers of two not exceeding N in ascending order.Input N from console. Example ` Input 50(You can not use Math.pow())
//        Output ` 1 2 4 8 16 32.
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int n = sc.nextInt();
        int a = 2;
        int result = 1;

        for (int i=1; i<n ; i++){
            result = result*a;
            System.out.println(result);
            if (result>n){
                result=result/2;
                break;
            }
        }
        System.out.println(result);
    }
}