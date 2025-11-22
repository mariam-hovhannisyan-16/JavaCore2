package homework.library;

import homework.library.Storage.AuthorStorage;
import homework.library.Storage.BookStorage;
import homework.library.model.Author;
import homework.library.model.Book;

import java.util.Scanner;

public class LibraryDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();

            switch (command) {

                case EXIT:
                    isRun = false;
                    break;

                case ADD_AUTHOR:
                    addAuthor();
                    break;

                case ADD_BOOK:
                    addBook();
                    break;

                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;

                case SEARCH_BOOK_BY_AUTHOR:
                    searchBookByAuthor();
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
                    System.err.println("Wrong command! Try again.");
            }
        }
    }

    private static void searchBookByAuthor() {
        System.out.println("Please choose author by phone number");
        authorStorage.print();
        String phoneNumber = scanner.nextLine();

        Author author = authorStorage.getAuthorByPhoneNumber(phoneNumber);

        if (author != null) {
            bookStorage.searchBookByAuthor(author);
        } else {
            System.out.println("Wrong author's phone number, please try again!!!");
        }
    }

    private static void addAuthor() {
        System.out.println("Please input author's name");
        String name = scanner.nextLine();

        System.out.println("Please input author's surname");
        String surname = scanner.nextLine();

        System.out.println("Please input author's age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Please input author's phone number");
        String phoneNumber = scanner.nextLine();

        Author author = new Author(name, surname, age, phoneNumber);
        authorStorage.add(author);

        System.out.println("Author added successfully!!!");
    }

    private static void addBook() {
        System.out.println("Please choose author by phone number");
        authorStorage.print();

        String phoneNumber = scanner.nextLine();
        Author author = authorStorage.getAuthorByPhoneNumber(phoneNumber);

        if (author != null) {

            System.out.println("Please input book's title");
            String bookTitle = scanner.nextLine();

            System.out.println("Please input book's price");
            double price = Double.parseDouble(scanner.nextLine());

            Book book = new Book();
            book.setTitle(bookTitle);
            book.setPrice(price);
            book.setAuthor(author);

            bookStorage.add(book);
            System.out.println("Book added successfully!");

        } else {
            System.out.println("Wrong author's phone number, please try again!!!");
        }
    }
}

