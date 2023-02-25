package org.example.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Employee> employeesList = new ArrayList<>();
        Employee emp1 = new Employee(23, "Ivan", "Abramov", 780);
        Employee emp2 = new Employee(45, "Petr", "Ivanov", 456);
        Employee emp3 = new Employee(12, "Pavel", "Dudorev", 900);
        Employee emp4 = new Employee(87, "Stas", "Vladov", 300);
        employeesList.add(emp1);
        employeesList.add(emp2);
        employeesList.add(emp3);
        employeesList.add(emp4);
        System.out.println("Before sorting \n " + employeesList);
        Collections.sort(employeesList, new IdComparator());
        System.out.println("After sorting \n " + employeesList);
        }
    }

    class Employee {
        int id;
        String name;
        String surname;
        int salary;

        public Employee(int id, String name, String surname, int salary) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    class IdComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee emp1, Employee emp2) {
            if (emp1.id == emp2.id) {
                return 0;
            } else if (emp1.id < emp2.id) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    class NameComparator implements Comparator<Employee> {
            @Override
            public int compare(Employee emp1, Employee emp2) {
               int res = emp1.name.compareTo(emp2.name);
               if(res == 0){
                  res = emp1.surname.compareTo(emp2.surname);
               }
                return res;
            }
        }

    class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.salary - emp2.salary;
        }
    }


