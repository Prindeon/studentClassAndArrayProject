package test;

import model.Student;
import model.Team;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Team t1 = new Team("Team1", "101");
        Team t2 = new Team("Team2", "102");

        Student s1 = new Student("Billy", true);
        Student s2 = new Student("Rob", true);
        Student s3 = new Student("Joe", true);
        Student s4 = new Student("Jane", true);
        Student s5 = new Student("Marge", true);
        Student s6 = new Student("Kenneth", true);

        t1.addStudent(s1);
        t1.addStudent(s2);
        t1.addStudent(s3);
        t2.addStudent(s4);
        t2.addStudent(s5);
        t2.addStudent(s6);

        System.out.println(Arrays.toString(t1.getStudents()));
        System.out.println(Arrays.toString(t2.getStudents()));

        t1.removeStudent("Rob");
        System.out.println(Arrays.toString(t1.getStudents()));

        t2.addStudent(s2);
        System.out.println(Arrays.toString(t2.getStudents()));
        t1.addStudent(s3);
        System.out.println(Arrays.toString(t1.getStudents()));
    }
}
