public class TestBookAdvanced {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("John Doe", "johndoe@example.com", 'm');
        authors[1] = new Author("Alex Lee", "alexlee@example.com", 'm');

        // Declare and allocate a Book instance
        BookAdvanced programmingBook = new BookAdvanced("Introduction to Programming", authors, 19.99, 99);

        // Test toString()
        System.out.println(programmingBook);

        // Test Getters and Setters
        programmingBook.setPrice(29.99);
        programmingBook.setQty(50);
        System.out.println("Book name: " + programmingBook.getName());
        System.out.println("Book price: " + programmingBook.getPrice());
        System.out.println("Book quantity: " + programmingBook.getQty());

        // Test retrieving authors
        System.out.println("Authors of the book:");
        for (Author author : programmingBook.getAuthors()) {
            System.out.println(author); // Author's toString()
        }
    }
}
