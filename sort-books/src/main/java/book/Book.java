package book;

public class Book implements Comparable {
    private final String bookName;
    private final int numberOfPages;
    private final String authorName;
    private final int releaseYear;

    public Book(String bookName, int numberOfPages, String authorName, int releaseYear) {
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
        this.authorName = authorName;
        this.releaseYear = releaseYear;
    }

    public String getBookName() {
        return bookName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getReleaseDate() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Book name : " + bookName
                + " number of pages " + numberOfPages
                + "author name " + authorName
                + "release date " + releaseYear;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
