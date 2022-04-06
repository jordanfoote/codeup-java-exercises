import java.util.Scanner;

public class ConsoleExercises {

    public static void main (String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f", pi);

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Please enter a whole number: ");
        // int userInput = scanner.nextInt();
        // System.out.println("You entered: " + userInput);

        // System.out.println("Please enter three words: ");
        // String word1 = scanner.next();
        // String word2 = scanner.next();
        // String word3 = scanner.next();
        // System.out.printf("You entered: %s %s %s", word1, word2, word3);

        // System.out.println("Please enter a sentence: ");
        // String sentence = scanner.nextLine();
        // System.out.printf("You entered: %s", sentence);

        scanner.useDelimiter("\n");
        System.out.println("Please enter the length of your room: ");
        double length = scanner.nextDouble();
        System.out.println("Please enter the width of your room: ");
        double width = scanner.nextDouble();
        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        System.out.printf("The area of your room is: %s.%n", area);
        System.out.printf("The perimeter of your room is: %s.%n", perimeter);
    }
}
