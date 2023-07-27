package kz.bitlab.springboot.springsprinttask1.controller;

import kz.bitlab.springboot.springsprinttask1.db.Student;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Student> students = new ArrayList<>();


    private static Long id = 9L;

    static {

        students.add(new Student(1L, "Iliyas", "Zhuanyshev", 88, "B"));
        students.add(new Student(2L, "Aday", "Korzhik", 49, "F"));
        students.add(new Student(3L,"Hitler","Adolf",87,"B"));
        students.add(new Student(4L,"Joseph","Stalin",88,"B"));
        students.add(new Student(5L,"Johnny","Depp",20,"F"));
        students.add(new Student(6L,"Sponge","Bob",35,"F"));
        students.add(new Student(7L,"Patrick","Star",32,"F"));
        students.add(new Student(8L,"Kobe","Bryant",77,"B"));

    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void addStudent(Student student) {

        if (student.getExam() >= 90)
            student.setMark("A");

        else if (student.getExam() >= 75)
            student.setMark("B");

        else if (student.getExam() >= 60)
            student.setMark("C");

        else if (student.getExam() >= 50)
            student.setMark("D");

        else
            student.setMark("F");


        student.setId(id);
        id++;
        students.add(student);

    }


}
