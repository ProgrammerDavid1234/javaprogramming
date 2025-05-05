public class BookStoreNew{
    private String title;
    private String author;
    private Double price;

    public BookStoreNew(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
}
    public void keepTrack(){
    System.out.println("The title of the book is" + title);
    System.out.println("The author of the book is " + author);
    System.out.println("The price of the book is " + price);
    }
    public static void main(String[] args) {
        BookStoreNew book1 = new BookStoreNew("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        book1.keepTrack();
        BookStoreNew book2 = new BookStoreNew("To Kill a Mockingbird", "Eminem", 12.99);
        book2.keepTrack();
    } 

}