package homework.library.Storage;

import homework.library.model.Author;
import homework.library.model.Book;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }
    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = books[i];
        }
        books = tmp;
    }
    public void print() {
     for (int i = 0; i < size; i++) {
        System.out.println(books[i]);
    }
}
public void search(String keyword) {
    for (int i = 0; i < size; i++) {
        if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println(books[i]);
        }
    }
}
public Book getBookByMaxPrice() {
        double price = 0;
        int maxIndex = -1;
        for (int i = 0; i < size; i++) {
            if (size == 0) {
                return null;
            }
            return books[maxIndex];
            }
    return null;
}

    public void searchBookByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.println(books[i]);
            }
        }
    }
}
