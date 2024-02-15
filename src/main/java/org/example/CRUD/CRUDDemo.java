package org.example.CRUD;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CRUDDemo {
    public static void main(String[] args) {
        Collection<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "mesud", 500));
        employees.add(new Employee(2, "erdal", 700));
        employees.add(new Employee(3, "meki", 800));
        Scanner scanner = new Scanner(System.in);
        int ch;
        do{
              System.out.println("1. INSERT");
              System.out.println("2. DISPLAY");
              System.out.println("3. SEARCH");
              System.out.println("4. DELETE");
              System.out.println("5. UPDATE");
              System.out.println("Enter your choice : ");
              ch = scanner.nextInt();
              switch (ch){
                  case 1:
                      System.out.println("Enter Employee number: ");
                      int empNum = scanner.nextInt();
                      scanner.nextLine();
                      System.out.println("Enter Employee name: ");
                      String empName = scanner.nextLine();
                      System.out.println("Enter Employee salary: ");
                      int empSalary = scanner.nextInt();
                      employees.add(new Employee(empNum, empName, empSalary));
                      break;
                  case 2:
                  System.out.println("Employee " + employees);
                      break;
                  case 3:
                      boolean found = false;
                      System.out.println("Enter emp to search: ");
                      System.out.println("Enter Employee number: ");
                      int empNumSearch = scanner.nextInt();
                      scanner.nextLine();
                      System.out.println("Enter Employee name: ");
                      String empNameSearch = scanner.nextLine();
                      System.out.println("Enter Employee salary: ");
                      int empSalarySearch = scanner.nextInt();
                      List<Employee> employeeList = employees.stream()
                              .filter(emps -> emps.getEmpno() == empNumSearch
                                           && emps.getEname().equals(empNameSearch)
                                           && emps.getSalary() == empSalarySearch)
                              .collect(Collectors.toList());
                      if (!employeeList.isEmpty()) {
                          found = true;
                          System.out.println("Employee found: " + employeeList.get(0));
                      } else {
                          System.out.println("Employee not found.");
                      }
                      break;
                  case 4:
                      System.out.println("Delete by id : ");
                      int employeeDeleteById = scanner.nextInt();
                      employees = employees.stream()
                              .filter(emps -> emps.getEmpno() != employeeDeleteById)
                              .collect(Collectors.toList());
                      System.out.println("All employees :" + employees);
                      break;
                  case 5:
                      System.out.println("Update salary across Employee Name : ");
                      scanner.nextLine();
                      String employeeName = scanner.nextLine();

                      List<Employee> employeeList1 = employees.stream()
                              .filter(emps -> emps.getEname().equals(employeeName))
                              .peek(emp -> {
                                  System.out.println("Enter new salary for " + emp.getEname() + ": ");
                                  int newSalary = scanner.nextInt();
                                  emp.setSalary(newSalary);
                              })
                              .collect(Collectors.toList());
                      if(!employeeList1.isEmpty()){
                          System.out.println("Salaries updated for employees with name " + employeeName);
                      } else{
                          System.out.println("No employees found with name: " + employeeName);
                      }
              }
        } while (ch != 0);
    }
}
