import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println(add(20, 2));
        // System.out.println(sub(20, 2));
        // System.out.println(mult(20, 6));
        // System.out.println(div(20, 2));
        // System.out.println(mod(20, 2));
//
        // System.out.println("Please enter a number between 1 and 10: ");
        // getInteger(1, 10);

        System.out.println("Please enter a number between 1 and 10: ");
        int inputNumber = scanner.nextInt();
        System.out.println("Do you wish to continue? [y/n]");
        String answer = scanner.next();

        if (answer.equals("y")) {
            getFactorial(inputNumber);
        } else {
            System.out.println("Okay. Your loss!");
        }

    }

    public static int add (int num1, int num2) {
        return num1 + num2;
    }

    public static int sub (int num1, int num2) {
        return num1 - num2;
    }

    public static int mult (int num1, int num2) {
        int result = 0;

        for (int i = 1; i <= num2; i++) {
            result = result + num1;
        }
        return result;
    }

    public static int div (int num1, int num2) {
        return num1 / num2;
    }

    public static int mod (int num1, int num2) {
        return num1 % num2;
    }

    // public static int getInteger(int min, int max) {
    //     Scanner scanner = new Scanner(System.in);
    //     int userInput = scanner.nextInt();
    //     int result = userInput;
//
    //     if (userInput >= min && userInput <= max) {
    //         System.out.println("Success!");
    //     } else {
    //         System.out.println("ERROR. Please try again.");
    //         System.out.println("Please enter a number between 1 and 10: ");
    //         getInteger(min, max);
    //     }
    //     return result;
    // }

    public static long getFactorial(int num) {
        long fact = 1;

        if (num <= 10 && num >= 1) {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        } else {
            System.out.println("ERROR. Enter a number between 1 and 10.");
            Scanner sc = new Scanner(System.in);
            int newInputNumber = sc.nextInt();
            System.out.println("Do you wish to continue? [y/n]");
            String answer = sc.next();

            if (answer.equals("y")) {
                getFactorial(num);
            } else {
                System.out.println("Okay. Your loss!");
            }
        }
        return fact;
    }
}

