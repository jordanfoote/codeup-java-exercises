package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Double> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (Double grade : this.grades) {
            sum += grade;
        }
        return (sum / this.grades.size());
    }

    public static void main(String[] args) {

        Student student = new Student("Fred");
        student.addGrade(100);
        student.addGrade(75);
        student.addGrade(90);

        System.out.println(student.getGradeAverage());
    }
}
