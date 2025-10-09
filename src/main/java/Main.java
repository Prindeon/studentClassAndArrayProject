import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student Marius = new Student("Marius", true);
        Student Marty = new Student("Marty", false);
        Student Sam = new Student("Sam", true);

        Marius.addGrade(12);
        Marius.addGrade(10);
        System.out.println(Arrays.toString(Marius.getGrades()));

        // create school class
        Team Class1 = new Team("Datamatiker", "8.12");

        System.out.println("Name of class: " + Class1.getName());
        Class1.addStudent(Marius);
        Class1.addStudent(Marty);
        Class1.addStudent(Sam);
        System.out.println("Number of students: " + Class1.getNoOfStudents());

    }
}
