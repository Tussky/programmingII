import java.util.ArrayList;

public class tester {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", true);
        Book book2 = new Book("1984", "George Orwell", false);
        Book book3 = new Book("Pride and Prejudice", "Jane Austen");
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", true);
        Book book5 = new Book("Moby-Dick", "Herman Melville");
        Book book6 = new Book("War and Peace", "Leo Tolstoy", false);
        Book book7 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book8 = new Book("Brave New World", "Aldous Huxley", true);
        Book book9 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book book10 = new Book("Crime and Punishment", "Fyodor Dostoevsky", false);


        ArrayList booksForLibrary = new ArrayList<>();
        booksForLibrary.add(book1);

        Library AlexandrianLib = new Library(booksForLibrary);

        // Adding books to library
        AlexandrianLib.addBook(book1);
        AlexandrianLib.addBook(book2);
        AlexandrianLib.addBook(book3);
        AlexandrianLib.addBook(book4);
        AlexandrianLib.addBook(book5);
        AlexandrianLib.addBook(book6);
        AlexandrianLib.addBook(book7);
        AlexandrianLib.addBook(book8);
        AlexandrianLib.addBook(book9);
        AlexandrianLib.addBook(book10);

        // Adding a book
        AlexandrianLib.borrowBook("War and Peace");
        // Borrowing a borrowed book
        AlexandrianLib.borrowBook("War and Peace");
        // Returning Borrowed book
        AlexandrianLib.returnBook("War and Peace");

        // Listing all Books in Lib
        AlexandrianLib.listBooks();

        

    }
}
