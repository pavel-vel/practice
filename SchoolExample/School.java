package practice.SchoolExample;

import java.util.ArrayList;

public class School {
    private String name;
    private ArrayList<Class> classes;

    public School(String name, ArrayList classes) {
        this.name = name;
        this.classes = classes;
    }
    public String getName() {
        return name;
    }
}
