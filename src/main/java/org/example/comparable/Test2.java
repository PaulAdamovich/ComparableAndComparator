package org.example.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee(23, "Ivan", "Abramov", 780);
        Employee emp2 = new Employee(45, "Petr", "Ivanov", 456);
        Employee emp3 = new Employee(12, "Pavel", "Dudorev", 900);
        Employee emp4 = new Employee(87, "Stas", "Vladov", 300);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        System.out.println("Before sorting \n " + employeeList);
        Collections.sort(employeeList);
        System.out.println("After sorting \n " + employeeList);
    }
}

class Employee implements Comparable<Employee>{
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

    @Override
    public int compareTo(Employee anotherEmp) {
        //Classical method
        if (this.id == anotherEmp.id){
            return 0;
        }
        else if (this.id < anotherEmp.id){
            return -1;
        }
        else {
            return 1;
        }
    }

    //Another method
    // return this.id - anotherEmp.id;

    // If need compare by two field
    // int res = this.name.compareTo(another.name);
    // if (res == 0){
    //   res = this.surname.compareTo(another.surname);
    //   }
    // return res;
}