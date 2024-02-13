package org.example.OOPJava.SchoolManagementOOP;

import java.util.List;

public class School {

    private List<Student> students;
    private List<Teacher> teachers;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public void setStudents(Student student) {
        students.add(student);
    }

    public void setTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned){
          totalMoneyEarned += MoneyEarned;
    }

    public static void updateTotalMoneySpent(int moneySpent){
        totalMoneyEarned -= moneySpent;
    }

    public School (List<Student> students, List<Teacher> teachers){
        this.students = students;
        this.teachers = teachers;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }


}
