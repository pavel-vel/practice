package practice.SchoolExample;

public class Demo {
    public static void main(String[] args) {

        School tumba = new School("Tumba");

//      Ученици
        Student susela = new Student("Susela", 1);
        Student chichev = new Student("Chichev", 2);
        Student joro = new Student("Jorkata", 3);
        Student traycho = new Student("Traycho", 4);
        Student mitko = new Student("Mitaka", 1);
        Student svetlio = new Student("Svetlio", 2);

//      Учители
        Teacher petko = new Teacher("Petko", "Mr.");
        Teacher stanka = new Teacher("Stanka", "Ms.");
        Teacher stelian = new Teacher("Stelian", "Mr.");
        Teacher martin = new Teacher("Martin", "Mr.");
        Teacher spasova = new Teacher("Spasova", "Ms.");

//      Класове
        Class fiveA = new Class("5A");
        Student[] klas5A = new Student[4];
        klas5A[0] = susela;
        klas5A[1] = chichev;
        klas5A[2] = joro;
        klas5A[3] = traycho;

        Teacher[] uchiteli5A = new Teacher[3];
        uchiteli5A[0] = petko;
        uchiteli5A[1] = stanka;
        uchiteli5A[2] = stelian;

        Teacher[] uchiteli5B = new Teacher[2];
        uchiteli5B[0] = spasova;
        uchiteli5B[1] = martin;

        Class fiveB = new Class("5B");
        Student[] klas5B = new Student[3];
        klas5B[0] = mitko;
        klas5B[1] = svetlio;

//      Демо
        System.out.println("The name of this school is " + tumba.getName() + " and there are two classes in it: " + fiveA.getTextId() + " and " + fiveB.getTextId() + "\n");

        System.out.println("This is the list of students in " + fiveA.getTextId() + ":");
        for (Student student : klas5A) {
            if (student != null) {
                System.out.println(student.getClassNumber() + ". " + student.getName());
            }
        }
        System.out.println();

        System.out.println("And the teachers in class " + fiveA.getTextId() + " are: ");
        for (Teacher teacher : uchiteli5A) {
            if (teacher != null) {
                System.out.println(teacher.getTitle() + teacher.getName());
            }
        }
        System.out.println();
        petko.teachHistory();
        stanka.teachPhysics();
        stelian.teachArts();
        System.out.println();

        System.out.println("This is the list of students in " + fiveB.getTextId() + ":");
        for (Student student : klas5B) {
            if (student != null) {
                System.out.println(student.getClassNumber() + ". " + student.getName());
            }
        }

        System.out.println();
        System.out.println("And the teachers in class " + fiveB.getTextId() + " are: ");
        for (Teacher teacher : uchiteli5B) {
            if (teacher != null) {
                System.out.println(teacher.getTitle() + teacher.getName());
            }
        }
        System.out.println();
        spasova.teachHistory();
        martin.teachGeo();
        System.out.println();
    }
}