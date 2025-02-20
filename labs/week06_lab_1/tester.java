public class tester {
    public static void main(String[] args) {
        Book adventures = new Book("Bob's adventure", "Bob", false);
        System.out.println(adventures.getTitle());
        System.out.println(adventures);
        System.out.println(adventures.borrowBook());
        System.out.println(adventures.returnBook());
    }
}
