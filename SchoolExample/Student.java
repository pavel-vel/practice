package practice.SchoolExample;

public class Student {
    private String name;
    private int classNumber;

    public Student(String name, int classNumber) {
        this.name = name;
        this.classNumber = classNumber;
    }

    public String getName() {
        return name;
    }

    public int getClassNumber() {
        return classNumber;
    }
}
