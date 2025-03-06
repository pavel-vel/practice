package practice.SchoolExample;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

//      Students
        Student susela = new Student("Susela", 1);
        Student chichev = new Student("Chichev", 2);
        Student joro = new Student("Jorkata", 3);
        Student traycho = new Student("Traycho", 4);
        Student mitko = new Student("Mitaka", 1);
        Student svetlio = new Student("Svetlio", 2);

//      Subjects
        Discipline istoria = new Discipline("history", 15, 2);
        Discipline arts = new Discipline("arts", 42, 5411);
        Discipline fizika = new Discipline("physics", 4, 1);
        Discipline geografia = new Discipline("geography", 501, 20);

        ArrayList<Discipline> petkoSubjects = new ArrayList<>(Arrays.asList(istoria, arts));
        ArrayList<Discipline> stankaSubjects = new ArrayList<>(Arrays.asList(geografia, istoria));
        ArrayList<Discipline> stelianSubjects = new ArrayList<>(Arrays.asList(arts));
        ArrayList<Discipline> martinSubjects = new ArrayList<>(Arrays.asList(fizika, geografia));
        ArrayList<Discipline> spasovaSubjects = new ArrayList<>(Arrays.asList(istoria, fizika));

//      Teachers
        Teacher petko = new Teacher("Petko", "Mr.", petkoSubjects);
        Teacher stanka = new Teacher("Stanka", "Ms.", stankaSubjects);
        Teacher stelian = new Teacher("Stelian", "Mr.", stelianSubjects);
        Teacher martin = new Teacher("Martin", "Mr.", martinSubjects);
        Teacher spasova = new Teacher("Spasova", "Ms.", spasovaSubjects);

//      School Classes
        ArrayList<Student> klas5A = new ArrayList<>();
        klas5A.add(susela);
        klas5A.add(chichev);
        klas5A.add(joro);
        klas5A.add(traycho);

        ArrayList<Discipline> predmeti5A = new ArrayList<>();
        predmeti5A.add(istoria);
        predmeti5A.add(fizika);
        predmeti5A.add(arts);

        ArrayList<Teacher> uchiteli5A = new ArrayList<>();
        uchiteli5A.add(petko);
        uchiteli5A.add(martin);
        uchiteli5A.add(stelian);

        Class fiveA = new Class("5A", klas5A, uchiteli5A);

        ArrayList<Student> klas5B = new ArrayList<>();
        klas5B.add(mitko);
        klas5B.add(svetlio);

        ArrayList<Discipline> predmeti5B = new ArrayList<>();
        predmeti5B.add(geografia);
        predmeti5B.add(istoria);
        predmeti5B.add(fizika);

        ArrayList<Teacher> uchiteli5B = new ArrayList<>();
        uchiteli5B.add(stanka);
        uchiteli5B.add(spasova);
        uchiteli5B.add(martin);

        Class fiveB = new Class("5B", klas5B, uchiteli5B);

        ArrayList<Class> petiKlasove = new ArrayList<>();
        petiKlasove.add(fiveA);
        petiKlasove.add(fiveB);

        School tumba = new School("Tumba", petiKlasove);

//      Demo
        System.out.println("The name of this school is " + tumba.getName() + " and there are two classes in it: " + fiveA.getClassNumber() + " and " + fiveB.getClassNumber() + "\n");

        System.out.println("This is the list of students in " + fiveA.getClassNumber() + ":");
        for (Student student : klas5A) {
            if (student != null) {
                System.out.println(student.getClassNumber() + ". " + student.getName());
            }
        }
        System.out.println();

        System.out.println("These are the subjects the students in 5A study:");
        for (Discipline discipline : predmeti5A) {
            System.out.println(discipline);
        }
        System.out.println();

        System.out.println("These are the teachers in 5A and their disciplines:");
        for (Teacher teacher : uchiteli5A) {
            teacher.teach();
        }
        System.out.println();

        System.out.println("This is the list of students in " + fiveB.getClassNumber() + ":");
        for (Student student : klas5B) {
            if (student != null) {
                System.out.println(student.getClassNumber() + ". " + student.getName());
            }
        }
        System.out.println();

        System.out.println("These are the subjects the students in 5B study:");
        for (Discipline discipline : predmeti5B) {
            System.out.println(discipline);
        }

        System.out.println();

        System.out.println("These are the teachers in 5B and their disciplines:");
        for (Teacher teacher : uchiteli5B) {
            teacher.teach();
        }

    }
}
