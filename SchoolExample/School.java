package practice.SchoolExample;

import java.util.ArrayList;

public class School {
    private String name;
    private ArrayList<Class> klasove;

    public School(String name, ArrayList klasove) {
        this.name = name;
        this.klasove = klasove;
    }

    public String getName() {
        return name;
    }
}
