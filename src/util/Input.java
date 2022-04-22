package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input (){
        this.scanner = new Scanner(System.in);
    }

    String getString(String prompt) {
        String input = this.scanner.nextLine();
        System.out.println(input);
        return input;
    }

    boolean yesNo() {
        String answer = this.scanner.next();
        if (answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes")) {
            System.out.println("Let's continue.");
            return true;
        } else {
            System.out.println("Why not?");
            return false;
        }
    }

    int getInt(int min, int max) {
        int num = this.scanner.nextInt();
        if (num <= max && num >= min) {
            System.out.println("Success!");
        } else {
            System.out.println("ERROR. Please enter a number between 1 and 20: ");
            getInt(min, max);
        }
        return num;
    }

    // int getInt() {
    //     try {
    //         return Integer.valueOf(getString("Please enter an integer: "));
    //     } catch (NumberFormatException) {
    //
    //     }
//
    // }

    double getDouble(double min, double max) {
        double num = this.scanner.nextDouble();
        if (num <= max && num >= min) {
            System.out.println("Success!");
        } else {
            System.out.println("ERROR. Please enter a number between 0.001 and 0.999: ");
            getDouble(min, max);
        }
        return num;
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        String entry = scanner.next();
        try {
            return Double.valueOf(entry);
        } catch(NumberFormatException e) {
            System.out.println("Bro, do you know how to read.");
            return getDouble(prompt);
        }
    }

    public double getRadius() {
        System.out.println("Please Enter the radius: ");
        double radius = this.scanner.nextDouble();
        return radius;
    }
}
