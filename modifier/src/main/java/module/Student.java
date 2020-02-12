package module;

public class Student {
    private final String name;
    private int grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
