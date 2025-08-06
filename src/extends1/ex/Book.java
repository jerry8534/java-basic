package extends1.ex;

public class Book extends Item{

    private String author;
    private String isbn;

    public Book(String name, int Price, String author, String isbn) {
        super(name, Price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" - author : " + author + " isbn : " + isbn);
    }
}
