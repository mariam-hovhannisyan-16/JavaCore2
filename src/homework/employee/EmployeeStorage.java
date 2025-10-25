package homework.employee;

import Homework1.Lesson3.Array;

import java.util.ArrayList;

public class EmployeeStorage {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void printAll() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public Employee searchByID(String id) {
        for (Employee e : employees) {
            if (e.getEmployeeID().equalsIgnoreCase(id)) {
                return e;
            }
        }
        return null;
    }
    public void searchByCompany(String company) {
        for (Employee e : employees) {
            if (e.getCompany().equalsIgnoreCase(company)) {
                System.out.println(e);
            }
        }
    }
}
