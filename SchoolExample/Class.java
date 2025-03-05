package practice.SchoolExample;

import java.util.ArrayList;

public class Class {
    private String classNumber;
    private ArrayList<Student> uchenici;
    private ArrayList<Teacher> uchiteli;

    public Class(String textId, ArrayList<Student> uchenici, ArrayList<Teacher> uchiteli) {
        this.classNumber = textId;
        this.uchenici = uchenici;
        this.uchiteli = uchiteli;
    }

    public String getClassNumber() {
        return classNumber;
    }

}
