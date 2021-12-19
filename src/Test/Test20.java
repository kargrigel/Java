package Test;

import java.util.Scanner;

public class Test20 {
    public  static int countOfDigitsSeven(int number){
        if (number<=9){
            if (number==7){
                return 1;
            }else {
                return 0;
            }
        }
       return countOfDigitsSeven(number%10) + countOfDigitsSeven(number/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        countOfDigitsSeven(number);

        System.out.println(countOfDigitsSeven(number));
    }
}
