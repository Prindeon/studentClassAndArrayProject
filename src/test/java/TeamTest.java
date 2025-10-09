import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TeamTest {

    @Test
    void testAddAndGetStudents() {
        Team team = new Team("A-Team", "101");
        Student s1 = new Student("Bob", true);
        Student s2 = new Student("Alice", true);

        team.addStudent(s1);
        team.addStudent(s2);

        Student[] result = team.getStudents();

        assertEquals(2, result.length);
        assertEquals("Bob", result[0].getName());
        assertEquals("Alice", result[1].getName());
    }

    @Test
    void testRemoveStudent() {
        Team team = new Team("A-Team", "101");
        Student s1 = new Student("Alice", true);
        Student s2 = new Student("Bob", true);

        team.addStudent(s1);
        team.addStudent(s2);
        team.removeStudent("Alice");

        Student[] result = team.getStudents();
        assertEquals(1, result.length);
        assertEquals("Bob", result[0].getName());
    }

    @Test
    void testRemoveNonExistingStudent() {
        Team team = new Team("A-Team", "101");
        team.addStudent(new Student("Alice",  true));
        team.removeStudent("Charlie");

        assertEquals(1, team.getNoOfStudents());
    }

}
