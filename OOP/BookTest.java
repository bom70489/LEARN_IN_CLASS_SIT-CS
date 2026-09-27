public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "J.K. Rowling", 500);

        book.borrowBook();
        System.out.println("Available: " + book.isAvailable());

        book.borrowBook();  // should NOT borrow again
        book.borrowBook();  // should NOT borrow again
        book.borrowBook();  // should NOT borrow again

        book.returnBook();
        System.out.println("Available: " + book.isAvailable());
    }
}
