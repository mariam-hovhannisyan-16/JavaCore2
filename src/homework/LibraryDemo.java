package homework;

import java.util.Scanner;

public class LibraryDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_BOOK = "1";
    private static final String PRINT_ALL_BOOKS = "2";
    private static final String SEARCH_BOOK_BY_TITLE = "3";
    private static final String PRINT_EXPENSIVE_BOOK = "4";

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {

            printCommands();

            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case PRINT_EXPENSIVE_BOOK:
                    System.out.println(bookStorage.getBookByMaxPrice());
                    break;
                default:
                    System.err.println("Wrong command ! try again");
            }
        }
    }

    private static void addBook() {
        System.out.println("Please input book's title");
        String bookTitle = scanner.nextLine();
        System.out.println("Please input book's authorName");
        String authorName = scanner.nextLine();
        System.out.println("Please input book's price");
        double price = Double.parseDouble(scanner.nextLine());
//                    Book book = new Book(bookTitle, authorName, price);
        Book book = new Book();
        book.setTitle(bookTitle);
        book.setPrice(price);
        book.setAuthorName(authorName);
        bookStorage.add(book);
        System.out.println("Book added successfully");
    }


    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_BOOK + " for ADD BOOK");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for PRINT ALL BOOKS");
        System.out.println("Please input " + SEARCH_BOOK_BY_TITLE + " for SEARCH BOOK BY TITLE");
        System.out.println("Please input " + PRINT_EXPENSIVE_BOOK + " for PRINT EXPENSIVE BOOK");
        System.out.println("============================");
    }
}
