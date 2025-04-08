public class Book{
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }


    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public boolean borrowBook(){
        if (this.isBorrowed == false){
            isBorrowed = true;
            System.out.println("Book: "+ this.getTitle()+" has been borrowed.");
            return true;
        } else {
            System.out.println("Book: "+ this.getTitle()+ " is already borrowed!");
            return false;
        }
    }

    public boolean returnBook(){
        if (this.isBorrowed == true){
            isBorrowed = false;
            System.out.println("Book: "+ this.getTitle()+" has been returned.");
            return true;
        }
        else {
            System.out.println("Book not borrowed... Cannot be returned.");
            return false;
        }
    }

    @Override
    public String toString(){
        return "Title: " + this.getTitle() + ", Author: " + this.getAuthor() + ", Borrowed: " + this.isBorrowed;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }
    
}