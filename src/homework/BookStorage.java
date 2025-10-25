package homework;

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
        System.arraycopy(books, 0, tmp, 0, size);
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
            if (books[i].getPrice() > price) {
                price = books[i].getPrice();
                maxIndex = i;
            }
        }
        return books[maxIndex];
    }

    public void deleteBYIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("No book with such index!");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            System.out.println("Book deleted successfully!");
        }
    }

    public void searchByPriceRange(double minPrice, double maxPrice) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            double price = books[i].getPrice();
            if (price >= minPrice && price <= maxPrice) {
                System.out.println(books[i]);
                found = true;
            }
        }
        if (! found) {
            System.out.println("No books found in price range " + minPrice + " - " + maxPrice);

        }

    }
}

