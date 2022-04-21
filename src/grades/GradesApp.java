package grades;

import java.util.ArrayList;

public class GradesApp {

    public static void main(String[] args) {

        ArrayList<Integer> grades1 = new ArrayList<>();
        grades1.add(100);
        grades1.add(90);
        grades1.add(80);
        grades1.add(70);
        grades1.add(60);
        grades1.add(85);
        grades1.add(92);

        Student student = new Student("Jordan", grades1);

        System.out.println(student.getGradeAverage());
    }
}
