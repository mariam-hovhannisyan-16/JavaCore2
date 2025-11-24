package homework.homework9.library.Storage;

import homework.homework9.library.model.Author;
import homework.homework9.library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookStorage {

    private List<Book> books = new ArrayList<>();
    private int size = 0;

    public void add(Book book) {
        books.add(book);

    }

    public void print() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void search(String keyword) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(book);
            }

        }
    }

    public void searchBookByAuthor(Author author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
            }
        }

    }

    public Book getBookByMaxPrice() {
        double price = 0;
        Book result = null;
        for (Book book : books) {
            if (book.getPrice() > price) {
                price = book.getPrice();
                result = book;
            }
        }
        return result;
    }
}
