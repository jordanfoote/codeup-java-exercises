import java.util.Scanner;

public class Bob {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! This is Bob. How are you?");
        String userinput = scanner.nextLine();

        if (userinput.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userinput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if ((userinput.equals(""))) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }

    }
}
