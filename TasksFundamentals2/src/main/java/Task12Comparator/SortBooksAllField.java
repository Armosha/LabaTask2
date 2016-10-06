package Task12Comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
public class SortBooksAllField {

    Comparator<Books> bcom3 = new AuthorTitlePriceComparator();
    Set<Books> booklist3 = new TreeSet<Books>(bcom3);

    public Set<Books> getBooksForTotalSort() {
        booklist3.add(new Books(48, "Brawn", "Da Vinci Code"));
        booklist3.add(new Books(34, "Jerome K. Jerome", "Three mens in the boat"));
        booklist3.add(new Books(3, "Andersen", "Fairytail"));
        booklist3.add(new Books(42, "Jerome K. Jerome", "Three mens in the boat"));
        booklist3.add(new Books(18, "Strugatskie", "Monday is beginning on Saturday"));
        booklist3.add(new Books(42, "Herbert George Wells", "The Time Mashine"));
        booklist3.add(new Books(5, "Stephenie Meyer", "Twilight"));
        return booklist3;
    }

    public void sortAuthorTitlePrice() {
        System.out.println("Sort by AuthorTitlePrice: " + "\n");
        for (Books a : booklist3) {
            System.out.print(a.getAuthor() + ", " + a.getTitle() + ", " + a.getPrice());
            System.out.print(" " + "\n");
        }
        System.out.print("========" + "\n");
    }

}

