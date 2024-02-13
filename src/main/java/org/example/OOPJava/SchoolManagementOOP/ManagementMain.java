package org.example.OOPJava.SchoolManagementOOP;

import java.util.ArrayList;
import java.util.List;

public class ManagementMain {

    public static void main(String[] args) {

        Student student = new Student(1, "Mesud", 10);
        Student student1 = new Student(2, "Ensar", 11);
        Student student2 = new Student(3, "Erdal", 12);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(student);
        studentsList.add(student1);
        studentsList.add(student2);

        Teacher teacher = new Teacher(1, "Teacher1", 600);
        Teacher teacher1 = new Teacher(2, "Teacher2", 500);
        Teacher teacher2 = new Teacher(3, "Teacher3", 700);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher);
        teachers.add(teacher1);
        teachers.add(teacher2);

        School school = new School(studentsList, teachers);

        student.payFess(5000);
        student1.payFess(6000);
        System.out.println("school earned " + school.getTotalMoneyEarned());

        teacher.receiveSalary(teacher.getSalary());
        System.out.println("School has spent for salary to " + teacher.getName() + " and now has " + school.getTotalMoneyEarned());
    }
}
