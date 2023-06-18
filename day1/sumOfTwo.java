package day1;

import java.util.Scanner;

public class sumOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int num2 = scanner.nextInt();
        int num3 = num1 + num2;
        System.out.println("The Sum of two numbers is: " + num3);
    }
}
