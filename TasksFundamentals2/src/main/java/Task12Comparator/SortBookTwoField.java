package Task12Comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
public class SortBookTwoField {

    Comparator<Books> bcomp1 = new TitleAuthorComparator();
    Comparator<Books> bcomp2 = new AuthorTitleComparator();

    Set<Books> booklist1 = new TreeSet<Books>(bcomp1);
    Set<Books> booklist2 = new TreeSet<Books>(bcomp2);

    public Set<Books> getBooksForTitleAuthor() {
        booklist1.add(new Books(48, "Brawn", "Da Vinci Code"));
        booklist1.add(new Books(34, "Jerome K. Jerome", "Three mens in the boat"));
        booklist1.add(new Books(3, "Andersen", "Fairytail"));
        booklist1.add(new Books(42, "Jerome K. Jerome", "Three mens in the boat"));
        booklist1.add(new Books(18, "Strugatskie", "Monday is beginning on Saturday"));
        booklist1.add(new Books(42, "Herbert George Wells", "The Time Mashine"));
        booklist1.add(new Books(5, "Stephenie Meyer", "Twilight"));
        return booklist1;
    }

    public Set<Books> getBooksForAuthorTitle() {
        booklist2.add(new Books(48, "Brawn", "Da Vinci Code"));
        booklist2.add(new Books(34, "Jerome K. Jerome", "Three mens in the boat"));
        booklist2.add(new Books(3, "Andersen", "Fairytail"));
        booklist2.add(new Books(42, "Jerome K. Jerome", "Three mens in the boat"));
        booklist2.add(new Books(18, "Strugatskie", "Monday is beginning on Saturday"));
        booklist2.add(new Books(42, "Herbert George Wells", "The Time Mashine"));
        booklist2.add(new Books(5, "Stephenie Meyer", "Twilight"));
        return booklist2;
    }

    public void sortTitleAuthor() {
        System.out.println("Sort by TitleAuthor: " + "\n");
        for (Books a : booklist1) {
            System.out.print(a.getTitle() + ", " + a.getAuthor());
            System.out.print(" " + "\n");
        }
        System.out.print("========" + "\n");
    }

    public void sortAuthorTitle() {
        System.out.println("Sort by AuthorTitle: " + "\n");
        for (Books a : booklist2) {
            System.out.print(a.getAuthor() + ", " + a.getTitle());
            System.out.print(" " + "\n");
        }
        System.out.print("========" + "\n");

    }
}
