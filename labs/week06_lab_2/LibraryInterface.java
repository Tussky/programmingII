public interface LibraryInterface {
    public boolean addBook(BookInterface newBook);
    public boolean borrowBook(String title);
    public boolean returnBook(String title);
    public void listBooks();
    public void countAvailableBooks();
}
