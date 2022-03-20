package book;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Book> bookSet = new HashSet<>();

        bookSet.add(new Book("Lord of the Rings", 600, "JRR Tolkien", 1976));
        bookSet.add(new Book("Little Prince", 400, "Antoine de Saint-Exupéry", 1976));
        bookSet.add(new Book("The Hound of the Baskervilles", 750, "Arthur Conan Doyle", 1976));
        bookSet.add(new Book("1984", 300, "George Orwell", 1976));
        bookSet.add(new Book("Animal Farm", 180, "George Orwell", 1976));

        // Print Before sort
        System.out.println("Before sorting elements in alphabetical order : "
                + bookSet);

        TreeSet<Book> bookTreeSet = new TreeSet<>(bookSet);

        // Print after sorting
        System.out.println("After sorting elements in alphabetical order : "
                + bookTreeSet);

    }

}
