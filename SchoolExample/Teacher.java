package practice.SchoolExample;

public class Teacher {
    private String name;
    private String title;

    public Teacher(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    Discipline istoria = new Discipline("history", 15, 2);

    public void teachHistory() {
        System.out.println(title + " " + name + " teaches " + istoria.getName());
    }

    Discipline fizika = new Discipline("physics", 4, 1);

    public void teachPhysics() {
        System.out.println(title + " " + name + " teaches " + fizika.getName());
    }
    Discipline geografia = new Discipline("geography", 501, 20);

    public void teachGeo() {
        System.out.println(title + " " + name + " teaches " + geografia.getName());
    }

    Discipline arts = new Discipline("arts", 4, 1);

    public void teachArts() {
        System.out.println(title + " " + name + " teaches " + arts.getName());
    }
}

