public class TestBook {
    public static void main(String[] args) {
        // Construct an author instance
        Author author = new Author("Jane Doe", "janedoe@example.com", 'f');
        System.out.println(author);  // Author's toString()

        // Construct a book instance
        Book book1 = new Book("Introduction to Programming", author, 19.95, 99);
        System.out.println(book1);  // Book's toString()

        // Test Getters and Setters
        book1.setPrice(29.95);
        book1.setQty(28);
        System.out.println("Name is: " + book1.getName());
        System.out.println("Price is: " + book1.getPrice());
        System.out.println("Qty is: " + book1.getQty());
        System.out.println("Author is: " + book1.getAuthor());
        System.out.println("Author's name is: " + book1.getAuthorName());
        System.out.println("Author's email is: " + book1.getAuthorEmail());
        System.out.println("Author's gender is: " + book1.getAuthorGender());

        // Use an anonymous instance of Author to construct a Book instance
        Book book2 = new Book("Advanced Programming",
                new Author("Alex Lee", "alexlee@example.com", 'm'), 29.95);
        System.out.println(book2);  // Book's toString()
    }
}
