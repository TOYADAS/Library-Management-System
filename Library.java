import java.util.*;

public class Library {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public void issueBook(String bookId) {
        Book book = books.get(bookId);
        if (book != null && !book.isIssued()) {
            book.issue();
            System.out.println("Book issued: " + book.getTitle());
        } else {
            System.out.println("Book unavailable or already issued.");
        }
    }

    public void returnBook(String bookId) {
        Book book = books.get(bookId);
        if (book != null && book.isIssued()) {
            book.returnBook();
            System.out.println("Book returned: " + book.getTitle());
        } else {
            System.out.println("Invalid return attempt.");
        }
    }

    public void showAllBooks() {
        for (Book book : books.values()) {
            book.display();
        }
    }
}
