package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {

    private static final EmployeeStorage storage = new EmployeeStorage();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printMenu();
            int choice = getChoice();

            switch (choice) {
                case 0 -> running = false;
                case 1 -> addEmployee();
                case 2 -> printAllEployees();
                case 3 -> searchById();
                case 4 -> searchByCompany();
                default -> System.out.println("Invalid choice, try again!");
            }
        }
        System.out.println("Program closed.");
    }

    private static void printMenu() {
        System.out.println("""
                ===== Employee Menu =====
                0 -> Exit
                1 -> Add Employee
                2 -> Print All Employee
                3 -> Search Employee by ID
                4 -> Search Employee by Company
                """);
        System.out.print("Enter your choice: ");
    }

    private static int getChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void addEmployee() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary;
        try {
            salary = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid salary, adding canceled!");
            return;
        }

        System.out.println("Enter company: ");
        String company = scanner.nextLine();

        System.out.print("Enter position: ");
        String position = scanner.nextLine();

        Employee employee = new Employee(name, surname, id, salary, company, position);
        storage.add(employee);
        System.out.println("Employee added successfully!\n");
    }

    private static void printAllEployees() {
        System.out.println("=== All Employees ===");
        storage.printAll();
        System.out.println();
    }

    private static void searchById() {
        System.out.print("Enter employee ID to search: ");
        String id = scanner.nextLine();
        Employee employee = storage.searchByID(id);
        if (employee != null) {
            System.out.println("Found: " + employee + "\n");
        } else {
            System.out.println("Employee not found!\n");
        }
    }
    private static void searchByCompany() {
        System.out.print("Enter compony name: ");
        String company = scanner.nextLine();
        System.out.println("=== Employee from " + company + " ===");
        storage.searchByCompany(company);
        System.out.println();
    }
}