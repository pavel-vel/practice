package practice.SchoolExample;

import java.util.ArrayList;

public class Class {
    private String classNumber;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public Class(String textId, ArrayList<Student> students, ArrayList<Teacher> teachers) {
        this.classNumber = textId;
        this.students = students;
        this.teachers = teachers;
    }

    public String getClassNumber() {
        return classNumber;
    }

}
