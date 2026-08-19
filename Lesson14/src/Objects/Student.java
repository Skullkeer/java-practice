package Objects;

import java.util.HashMap;

public class Student extends Person {

    private int studyID;

    public Student(String name, int studyID) {
        super(name);
        this.studyID = studyID;
    }

    public void study() {
        System.out.printf("%s is Studying...\n", this.name);
    }

    @Override
    public String toString() {
        return super.name + ", " + this.studyID;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return (s.studyID == this.studyID);
    }

    @Override
    public int hashCode() {
        return studyID;
    }

    public static void main() {
        Student w = new Student("willow", 1654313);
        w.study();

        System.out.println("My student: " + w);

        Student j = new Student("Jade", 2345673);
        Student w2 = new Student("willow", 1654313);


        if (w.equals(w2)) {
            System.out.println("Same!");
        }
        else {
            System.out.println("Not same!");
        }

        HashMap<Student, String> hm = new HashMap<>();
        hm.put(w, "Programming");
        hm.put(j, "Networking");

        System.out.printf("%s: %s\n", w, hm.get(w));
        System.out.printf("%s: %s\n", j, hm.get(j));
        System.out.printf("%s: %s\n", w2, hm.get(w2));

        Object d = new Student("Drew", 946583);
        Object d2 = new Person("Drew 2");

        if (d instanceof Student) {
            System.out.println("Drew MIGHT student...");
        }

        if (d2 instanceof Student) {
            System.out.println("Drew MIGHT student...");
        }

        System.out.println(d.getClass().getName());
        System.out.println(d2.getClass().getName());

        System.out.println(d.getClass().getSimpleName());
        System.out.println(d2.getClass().getSimpleName());

    }

}
