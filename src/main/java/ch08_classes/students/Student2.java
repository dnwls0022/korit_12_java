package ch08_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;

    public int getStudentCode() {
        return studentCode;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public Student2(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student2(int studentCode) {
        this.studentCode = studentCode;
    }
}

