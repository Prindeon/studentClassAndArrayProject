public class Student {
    private String name;
    private boolean active;
    private int[] grades;

    public Student (String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int[] getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        if (grades == null) {
            grades = new int[1];
            grades[0] = grade;
        } else {
            int[] updatedGrades = new int[grades.length + 1];
            for (int i = 0; i < grades.length; i++) {
                updatedGrades[i] = grades[i];
            }
            updatedGrades[grades.length] = grade;
            grades = updatedGrades;
        }
    }

    // til at printe getStudents arrayet korrekt
    @Override
    public String toString() {
        return name;
    }
}
