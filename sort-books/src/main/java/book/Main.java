package book;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Book> bookSet = new HashSet<>();

        bookSet.add(new Book("Lord of the Rings", 600, "Tolkien", 1976));
        bookSet.add(new Book("Little Prince", 400, "Tolkien", 1976));
        bookSet.add(new Book("The Hound of the Baskervilles", 750, "Tolkien", 1976));
        bookSet.add(new Book("1984", 300, "Tolkien", 1976));
        bookSet.add(new Book("Animal Farm", 180, "Tolkien", 1976));

    }

}
