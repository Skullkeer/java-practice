package q6;

public class Book {

    private String title = "";
    private String author = "";

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.printf("\n%s by %s\n", this.title, this.author);
    }

    public static void main() {
        Book book1 = new Book("Lord of the Rings", "J R R Tolkien");
        Book book2 = new Book("Game of Thrones", "George R R Martin");
        Book book3 = new Book("Poo Diddy", "Jade Ernst Russel");

        Book[] books = {book1, book2, book3};

        for (int i = 0; i < books.length; i++) {
            books[i].display();

        }

    }

}
