package practice.SchoolExample;

public class Discipline {
    private String name;
    private int lectures;
    private int exercises;

    public Discipline(String name, int lectures, int exercises) {
        this.name = name;
        this.lectures = lectures;
        this.exercises = exercises;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + ", lectures: " + lectures + ", exercises: " + exercises;
    }
}
