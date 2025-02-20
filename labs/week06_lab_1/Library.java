import  java.util.ArrayList;

public class Library {
    private ArrayList<Book> Books = new ArrayList<>();

    public Library(ArrayList books) {
        Books = books;
    } 

    public boolean borrowBook(String title) {
        for (Book book : Books) {
            if (book.getTitle().equals(title)){
                return (book.borrowBook());
            } 
        }
        System.out.println("Book not found!");
        return false;
    }
    
    public boolean returnBook(String title) {
        for (Book book : Books) {
            if (book.getTitle().equals(title)){
                return (book.returnBook());
            }
        }
        System.out.println("Book not found!");
        return false;
    }

    public void listBooks() {
        for (Book book : Books) {
            System.out.println("Title: "+book.getTitle()+", by: "+book.getAuthor());
        }
    }

    public boolean addBook(Book toAdd) {
        Books.add(toAdd);
        System.out.println(toAdd.getTitle() + "was succesffuly added");
        return true;
    }
}
