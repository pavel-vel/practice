package practice.SchoolExample;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private String title;
    private ArrayList<Discipline> disciplines;

    public Teacher(String name, String title, ArrayList<Discipline> disciplines) {
        this.name = name;
        this.title = title;
        this.disciplines = disciplines;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    public void teach() {
        System.out.print(title + " " + name + " teaches: ");
        for (Discipline discipline : disciplines) {
            System.out.print(discipline.getName() + " ");
        }
        System.out.println();
    }
}



