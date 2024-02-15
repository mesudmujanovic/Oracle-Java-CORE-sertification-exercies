package org.example.CRUD;

public class Employee {

    private int empNumber;
    private String eName;
    private int salary;

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int empNumber, String eName, int salary) {
        this.empNumber = empNumber;
        this.eName = eName;
        this.salary = salary;
    }

    public int getEmpno() {
        return empNumber;
    }

    public String getEname() {
        return eName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empNumber +
                ", ename='" + eName + '\'' +
                ", salary=" + salary +
                '}';
    }

}
