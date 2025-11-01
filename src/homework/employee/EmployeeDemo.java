package homework.employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeDemo {

    private static final EmployeeStorage storage = new EmployeeStorage();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            String command = scanner.nextLine();

            if (command.equals("0")) {
                System.out.println("Exiting...");
                break;
            }
            handleCommand(command);
        }
    }

    private static void printMenu() {
        System.out.println("\n0 - Exit");
        System.out.println("1 - Add Employee");
        System.out.println("2 - Print All Employees");
        System.out.println("3 - Search Employee by ID");
        System.out.println("4 - Search Employee by Company");
        System.out.println("5 - Search Employees by Position Level");
        System.out.print("Enter command: ");
    }

    private static void handleCommand(String command) {
        switch (command) {
            case "1" -> addEmployee();
            case "2" -> printAllEmployees();
            case "3" -> searchEmployeeByID();
            case "4" -> searchEmployeeByCompany();
            case "5" -> searchEmployeeByPositionLevel();
            default -> System.out.println("Unknown command");
        }
    }

    private static void addEmployee() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter employee ID (e.g., A0001): ");
        String id = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter company: ");
        String company = scanner.nextLine();

        System.out.print("Enter position: ");
        String position = scanner.nextLine();

        System.out.print("Enter position level (JUNIOR, MIDDLE, SENIOR, LEAD): ");
        String levelStr = scanner.nextLine();

        try {
            PositionLevel positionLevel = PositionLevel.valueOf(levelStr.toUpperCase());
            Employee employee = new Employee(name, surname, id, salary, company, position, positionLevel);
            storage.add(employee);
            System.out.println("Employee added!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid position level!");
        }
    }

    private static void printAllEmployees() {
        List<Employee> allEmployees = storage.getAllEmployees();
        if (allEmployees.isEmpty()) {
            System.out.println("No employees available.");
        } else {
            for (Employee e : allEmployees) {
                System.out.println(e);
            }
        }
    }

    private static void searchEmployeeByID() {
        System.out.print("Enter employee ID: ");
        String searchID = scanner.nextLine();
        Employee found = storage.searchByID(searchID);
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Employee not found!");
        }
    }

    private static void searchEmployeeByCompany() {
        System.out.print("Enter company name: ");
        String searchCompany = scanner.nextLine();
        List<Employee> companyEmployees = storage.searchByCompany(searchCompany);
        if (companyEmployees.isEmpty()) {
            System.out.println("No employees found for this company.");
        } else {
            for (Employee e : companyEmployees) {
                System.out.println(e);
            }
        }
    }

    private static void searchEmployeeByPositionLevel() {
        System.out.print("Enter position level (JUNIOR, MIDDLE, SENIOR, LEAD): ");
        String searchLevelStr = scanner.nextLine();
        try {
            PositionLevel level = PositionLevel.valueOf(searchLevelStr.toUpperCase());
            List<Employee> levelEmployees = storage.searchByPositionLevel(level);
            if (levelEmployees.isEmpty()) {
                System.out.println("No employees found with this position level.");
            } else {
                for (Employee e : levelEmployees) {
                    System.out.println(e);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid position level!");
        }
    }
}