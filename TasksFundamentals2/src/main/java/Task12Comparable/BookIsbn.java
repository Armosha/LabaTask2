package Task12Comparable;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
public class BookIsbn implements Comparable<BookIsbn> {

    private String title;
    private String author;
    private int price;
    private int isbn;


    public BookIsbn(int isbn, int price, String author, String title) {
        this.isbn = isbn;
        this.price = price;
        this.author = author;
        this.title = title;
    }


    public BookIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(BookIsbn anotherBook) {
        int anotherBookIsbn = anotherBook.getIsbn();
        return this.isbn - anotherBookIsbn;
    }

}
