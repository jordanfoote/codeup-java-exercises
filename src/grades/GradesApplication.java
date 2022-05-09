package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Jordan");
        student1.addGrade(100);
        student1.addGrade(100);
        student1.addGrade(100);

        Student student2 = new Student("Jason");
        student2.addGrade(90);
        student2.addGrade(70);
        student2.addGrade(85);

        Student student3 = new Student("James");
        student3.addGrade(100);
        student3.addGrade(95);
        student3.addGrade(90);

        Student student4 = new Student("John");
        student4.addGrade(70);
        student4.addGrade(80);
        student4.addGrade(75);

        students.putIfAbsent("jordanfoote", student1);
        students.putIfAbsent("McJason", student2);
        students.putIfAbsent("Jamerson", student3);
        students.putIfAbsent("Johnothy", student4);

        printPrompt(students);
        printStudentData(students);
    }

    public static void printPrompt(HashMap<String, Student> students){
        System.out.println("Welcome!");
        System.out.println("\nHere are the GitHub usernames of our students:\n");
        System.out.print("| ");
        for (String username : students.keySet()){
            System.out.printf("%s | ", username);
        }
        System.out.println("\n\nWhat student would you like to see more information on?");
    }

    public static void printStudentData(HashMap<String, Student> students) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Student foundStudent;
        for (String key : students.keySet()) {
            if (!students.containsKey(key)) {
                System.out.printf("Sorry, unable to find username of %s", key);
            } else if (input.equalsIgnoreCase(key)){
                foundStudent = students.get(key);
                System.out.printf("Name: %s - GitHub username - %s\n"
                + "Current Grade Average = %.2f\n", foundStudent.getName(), key, foundStudent.getGradeAverage());
            }
        }
    }
}
