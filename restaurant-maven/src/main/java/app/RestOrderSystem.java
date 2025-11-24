package app;

import service.CustomerService;
import service.DishService;
import service.OrderService;

import java.util.Scanner;

public class RestOrderSystem implements Commands {
    
    private static final CustomerService customerService = new CustomerService();
    private static final Scanner scanner = new Scanner(System.in);
    private static final OrderService orderService = new OrderService();
    private static final DishService dishService = new DishService();
    
    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printMainManu();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT -> isRun = false;
                case ADD_DISH -> addDish();
                case REMOVE_DISH -> removeDish();
                case CHANGE_DISH -> changeDish();
                case ADD_CUSTOMER -> addCustomer();
                case PRINT_CUSTOMER -> printCustomer();
                case CREATE_NEW_ORDERS -> createNewOrders();
                case PRINT_ALL_ORDERS -> printAllOrders();
                case PRINT_ALL_ORDERS_BY_CUSTOMER -> printAllOrdersByCustomer();
                case ORDER_INFORMATION -> orderInformation();
                case CHANGE_ORDER_STATUS -> changeOrderStatus();
                case PRINT_MENU_BY_CATEGORY -> printMenuByCategory();  
            }
        }
    }

    private static void printMenuByCategory() {
    }


    private static void changeOrderStatus() {
        
    }

    private static void orderInformation() {
    }

    private static void printAllOrdersByCustomer() {
    }

    private static void printAllOrders() {
    }

    private static void createNewOrders() {
    }

    private static void printCustomer() {
    }

    private static void addCustomer() {
    }

    private static void changeDish() {
    }

    private static void removeDish() {
    }

    private static void addDish() {
    }


}
