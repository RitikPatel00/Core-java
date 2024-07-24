package assignment3.booksAndAuthors;

public class BookTest {
    public static void main(String[] args) {
        // Test Author class
        Author author1 = new Author("John Doe", "john.doe@example.com", 'm');
        System.out.println("Author: " + author1);

        // Test Book class
        Book book1 = new Book("Java for Beginners", author1, 29.99, 100);
        System.out.println("Book: " + book1);

        // Test getters and setters
        System.out.println("Book name: " + book1.getName());
        System.out.println("Author name: " + book1.getAuthor().getName());
        System.out.println("Book price: " + book1.getPrice());
        System.out.println("Book quantity: " + book1.getQty());

        book1.setPrice(24.99);
        book1.setQty(50);
        System.out.println("Updated book: " + book1);

       
    }
}
