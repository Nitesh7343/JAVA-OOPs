import java.util.*;

class Student {
    String name;
    int rollNo;
    double marks;

    void greeting() {
        System.out.println("Hello my name is "+ name);
    }

    Student () {
        this.name = "Nitesh";
        this.rollNo = 39;
        this.marks = 98;
    }

    Student(String name, int rollNo,double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }


    Student(Student other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }

    void changeName(String newName) {
        this.name = newName;
    }
}

public class Main {

    public static void main(String[] args) {

        Student stu1 = new Student();
        Student stu2 = new Student("Ashu",02,99);
        Student frontend = new Student(stu2);
        Student backend = new Student(stu1);

        System.out.println(stu1.name);
        System.out.println(stu2.name);
        System.out.println(frontend.name);
        System.out.println(backend.name);

        System.out.println("-------------------------------------------------");

        Student me = stu1;

        System.out.println(stu1.name);
        System.out.println(me.name);
        me.name = "paandaa";
        System.out.println(stu1.name);
        System.out.println(me .name);



    }
}
