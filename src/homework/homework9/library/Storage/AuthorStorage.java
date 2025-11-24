package homework.homework9.library.Storage;

import homework.homework9.library.model.Author;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class AuthorStorage implements Serializable {
    private List<Author> Authors = new LinkedList<>();

    public void add(Author author) {
        Authors.add(author);
    }

    public Author getAuthorByPhoneNumber(String phoneNumber) throws AuthorNotFoundException {
        for (Author author : Authors) {
            if (author.getPhoneNumber().equals(phoneNumber)) {
                return author;
            }
        }
        throw new AuthorNotFoundException("Author with " + phoneNumber + " does not exists!!!");
    }

    public void print() {
        for (Author author : Authors) {
            System.out.println(author);
        }

    }

    public class AuthorNotFoundException extends Exception {
        public AuthorNotFoundException(String message) {
            super(message);
        }
    }
}

