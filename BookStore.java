public class BookStore {
    private String title;
    private String author;
    private Double price;

    public BookStore(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void keepTrack() {
        System.out.println("The title of the book is " + title);
        System.out.println("The author of the book is " + author);
        System.out.println("The price of the book is $" + price);
    }

    public static void main(String[] args) {
        BookStore book1 = new BookStore("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        book1.keepTrack();
        
        BookStore book2 = new BookStore("To Kill a Mockingbird", "Eminem", 12.99);
        book2.keepTrack();
        
        // BookStore book3 = new BookStore("Far Away From Home", "Spiderman", 15.99);
        // book3.keepTrack();
        
        // BookStore book4 = new BookStore("X", "Jane Austen", 9.99);
        // book4.keepTrack();
    }
}
