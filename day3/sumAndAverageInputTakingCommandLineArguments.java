public class sumAndAverageInputTakingCommandLineArguments {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int sum = num1 + num2 + num3;
        float average = (float) sum/3;
        System.out.println("Sum of three numbers is :" + sum);
        System.out.println("Average of three numbers is:" + average);
    }
}
