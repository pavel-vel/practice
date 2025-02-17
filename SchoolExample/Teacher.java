package practice.SchoolExample;

public class Teacher {
       private String name;
        private String title;

        public Teacher(String name, String title) {
            this.name = name;
            this.title = title;
        }
    Discipline istoria = new Discipline("history", 15, 2);
        public void teach() {
            System.out.println(title + " " + name + " teaches " + istoria.getName());
        }

    }

