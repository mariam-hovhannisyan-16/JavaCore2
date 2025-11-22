package homework.library.model;

import java.util.Objects;

public class Book {

    private String title;
    private Author author;
    private double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public Book() {
    }

    public  String getTitle(){
        return title;
    }

    public  void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author authorName) {
        this.author = authorName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return  Double.compare(price, book.price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public  int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return  "Book{" +
                "title='" + title + '\'' +
                "author='" + author + '\'' +
                "price=" + price +
                '}';

    }
}