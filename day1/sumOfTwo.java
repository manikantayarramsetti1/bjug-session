//Assume, the parent directory named BJUG-SESSION has the `sumOfTwo.class` file and day1 folder has `sumOfTwo.java` file. You need to execute the command `java sumOfTwo` from the day1 directory (child directory) 
// and the JVM should correctly load the class without any errors, and run it. 
// we can use classpath to acheive if the class file out of directory (java -cp .. sumOfTwo)

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
