package util;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();

        input.getString("Please enter a String: ");

        System.out.println("Do you want to continue? [Yes(y)/No(n)]");
        input.yesNo();

        System.out.println("Please enter a number between 1 and 20: ");
        input.getInt(1, 20);

        System.out.println("Please enter a number: ");
        input.getInt();

        System.out.println("Please enter a number between 0.001 and 0.999: ");
        input.getDouble(0.001, 0.999);

        System.out.println("Please enter any decimal number: ");
        input.getDouble("");


    }
}
