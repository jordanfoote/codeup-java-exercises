import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class HighLow {

    public static void main (String[] args) {

        System.out.println("This is a number guessing game. You get 10 tries.");
        int number = (int)(Math.random() * 100);
        numGuess(number);
    }

    public static int numGuess (int num) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 100: ");
        int userNum = sc.nextInt();
        if (userNum < num) {
            System.out.println("HIGHER");
            numGuess(num);
        } else if (userNum > num) {
            System.out.println("LOWER");
            numGuess(num);
        } else {
            System.out.println("GOOD GUESS!");
        }
        return userNum;
    }
}
