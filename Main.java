import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Sample books
        library.addBook(new Book("B101", "Clean Code"));
        library.addBook(new Book("B102", "Effective Java"));
        library.addBook(new Book("B103", "The Pragmatic Programmer"));

        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show all books");
            System.out.println("2. Issue a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear newline

            switch (choice) {
                case 1 -> library.showAllBooks();
                case 2 -> {
                    System.out.print("Enter Book ID to issue: ");
                    String id = sc.nextLine();
                    library.issueBook(id);
                }
                case 3 -> {
                    System.out.print("Enter Book ID to return: ");
                    String id = sc.nextLine();
                    library.returnBook(id);
                }
                case 4 -> {
                    exit = true;
                    System.out.println("Thank you for using the library system. Goodbye!");
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}