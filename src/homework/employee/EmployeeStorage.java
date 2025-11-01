package homework.employee;

import Homework1.Lesson3.Array;

import java.util.ArrayList;
import java.util.List;

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
    public List<Employee> searchByCompany(String company) {
        List<Employee> result  = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getCompany().equalsIgnoreCase(company)) {
               result.add(e);
            }
        }
        return result;
    }

    public List<Employee> searchByPositionLevel(PositionLevel level) {
        List<Employee> result = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getLevel() == level) {
                result.add(e);
            }
        }
        return result;
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
