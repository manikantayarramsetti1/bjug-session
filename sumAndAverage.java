import java.util.Scanner;

public class sumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter number3: ");
        int num3 = scanner.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("The sum of three numbers is: " + sum);
        int average = sum/3;
        System.out.println("The average of three numbers is: " + average);
    }
}
