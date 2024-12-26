public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("John Smith", "john.smith@example.com", 'm');
        System.out.println(author);  // Test toString()

        author.setEmail("new.email@example.com");  // Test setter
        System.out.println("Name is: " + author.getName());     // Test getter
        System.out.println("Email is: " + author.getEmail());   // Test getter
        System.out.println("Gender is: " + author.getGender()); // Test getter
    }
}
