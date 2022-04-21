import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionFuntTime {

    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        Scanner scanner = new Scanner(System.in);
        method3(scanner);
    }

    // TODO: how can we handle the possible InputMismatchException and allow the user to enter their integer again?
    private static void method3(Scanner scanner) {
        try {
            System.out.println("enter an integer");
            int myInt = scanner.nextInt();
            System.out.println(myInt);
        } catch (InputMismatchException ex) {
            System.out.println("not an int comma fam");
            method2();
        }
    }
}