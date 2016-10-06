package Task12Comparator;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
public class Main {
    public static void main(String[] args) {

        SortBookTwoField a = new SortBookTwoField();
        SortBooksAllField b = new SortBooksAllField();
        SortBooksOneField c = new SortBooksOneField();

        a.getBooksForAuthorTitle();
        a.getBooksForTitleAuthor();
        a.sortAuthorTitle();
        a.sortTitleAuthor();

        b.getBooksForTotalSort();
        b.sortAuthorTitlePrice();

        c.getBooksForTitleSort();
        c.sortTitle();
    }
}
