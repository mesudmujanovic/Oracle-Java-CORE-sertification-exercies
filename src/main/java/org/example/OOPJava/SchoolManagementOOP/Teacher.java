package org.example.OOPJava.SchoolManagementOOP;

public class Teacher {

    private int id;
    private String name;
    private int salary;

    private int salaryEarned;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public void receiveSalary(int salary){
        this.salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
}
