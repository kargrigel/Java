package Test;

import java.util.Scanner;
//3
public class TestTask3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x = scanner.nextInt();
        int[] arr = new int[10];
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println(arr[i]);
                }
    }
}