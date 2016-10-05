package Task12Comparator;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
public class Main {
    public static void main(String[] args) {
        BooksSort b = new BooksSort();
        b.putBooks();
        b.sortBooksTitle();
        b.sortBooksAuthor();
        b.sortAuthorTitle();
        b.sortTitleAuthor();
        b.sortBooksAuthorTitlePrice();
        b.sortPrice();
    }
}
