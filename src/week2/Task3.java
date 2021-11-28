package week2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p = 3.14159;
        double r = scanner.nextDouble();
        double perimetr = 2*p*r;
        System.out.println(perimetr);
        double area = p*r*r;
        System.out.println(area);

    }

}
