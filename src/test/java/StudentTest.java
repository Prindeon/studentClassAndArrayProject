import model.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testGetGradeAverageWithMultipleGrades() {
        Student s = new Student("Marius", true);
        s.addGrade(10);
        s.addGrade(7);
        s.addGrade(12);

        int result = s.getGradeAverage();
        assertEquals(9, result); // (10 + 7 + 12) / 3 = 9
    }

    @Test
    void testGetGradeAverageWithSingleGrade() {
        Student s = new Student("Marius", true);
        s.addGrade(12);

        assertEquals(12, s.getGradeAverage());
    }

    @Test
    void testGetGradeAverageWithNoGrades() {
        Student s = new Student("Marius", true);
        assertThrows(NullPointerException.class, s::getGradeAverage);
    }
}