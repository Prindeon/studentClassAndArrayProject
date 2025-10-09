public class Team {
    String name;
    String room;
    Student[] students;

    public Team(String name, String room) {
        this.name = name;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void addStudent(Student student) {
        if (students == null) {
            students = new Student[1];
            students[0] = student;
        } else {
            Student[] newStudent = new Student[students.length + 1];
            for (int i = 0; i < students.length; i++) {
                newStudent[i] = students[i];
            }
            newStudent[students.length] = student;
            students = newStudent;
        }
    }

    public int getNoOfStudents() {
        if (students == null) {
            return 0;
        }
        return students.length;
    }

    // Udvid klassen Team med en metode, der returnerer et array med alle de studerende, der er
    // tilknyttet teamet (arrayet må ikke indeholde null). (Arrays klassen må ikke bruges!)
    public Student[] getStudents() {
        Student[] result;

        if (students == null) {
            result = new Student[0];
        } else {

            // definerer længden på det nye array baseret på hvor mange Students objekter, som ikke er null
            int count = 0;
            for (Student student : students) {
                if (student != null) {
                    count++;
                }
            }
            result = new Student[count];

            // indsætter Student objekerne i det nye array
            int index = 0;
            for (Student student : students) {
                if (student != null) {
                    result[index] = student;
                    index++;
                }
            }
        }
        return result;
    }

    public void removeStudent(String name) {
        Student[] newStudents;


        // sæt størrelse på nye array
        if (students == null) {
            newStudents = new Student[0];
        } else {
            int count = 0;
            for (Student student : students) {
                if (student != null && !student.getName().equals(name)) {
                    count++;
                }
            }
            newStudents = new Student[count];

            int index = 0;
            for (Student student : students) {
                if (student != null && !student.getName().equals(name)) {
                    newStudents[index] = student;
                    index++;
                }
            }
        }
        students = newStudents;
    }


}
