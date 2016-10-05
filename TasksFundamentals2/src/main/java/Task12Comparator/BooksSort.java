package Task12Comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
public class BooksSort {

    Comparator<Books> bcomp = new AuthorComparator()
            .thenComparing(new TitleComparator())
            .thenComparing(new PriceComparator());

    Set<Books> booklist = new TreeSet<Books>(bcomp);

    public Set<Books> putBooks() {
        booklist.add(new Books(48, "Brawn", "Da Vinci Code"));
        booklist.add(new Books(34, "Jerome K. Jerome", "Three mens in the boat"));
        booklist.add(new Books(3, "Andersen", "Fairytail"));
        booklist.add(new Books(42, "Jerome K. Jerome", "Three mens in the boat"));
        booklist.add(new Books(18, "Strugatskie", "Monday is beginning on Saturday"));
        booklist.add(new Books(42, "Herbert George Wells", "The Time Mashine"));
        booklist.add(new Books(5, "Stephenie Meyer", "Twilight"));
        return booklist;
    }

    public void sortBooksAuthor() {
        System.out.println("Sort by author: " + "\n");
        for (Books a : booklist) {
            System.out.print(a.getAuthor() + ", ");
            System.out.print(" " + "\n");
        }
        System.out.print("========" + "\n");
    }

    public void sortBooksTitle() {
        System.out.println("Sort by title: " + "\n");
        for (Books a : booklist) {
            System.out.print(a.getTitle() + ", ");
            System.out.print(" " + "\n");
        }
        System.out.print("========" + "\n");

    }

    public void sortAuthorTitle() {
        System.out.println("Sort by AuthorTitle: " + "\n");
        for (Books a : booklist) {
            System.out.print(a.getAuthor() + ", " + a.getTitle());
            System.out.print(" " + "\n");
        }
        System.out.print("========" + "\n");

    }

    public void sortTitleAuthor() {
        System.out.println("Sort by TitleAuthor: " + "\n");
        for (Books a : booklist) {
            System.out.print(a.getTitle() + ", " + a.getAuthor());
            System.out.print(" " + "\n");
        }
        System.out.print("========" + "\n");
    }

    public void sortBooksAuthorTitlePrice() {
        System.out.println("Sort by PriceAuthorTitle: " + "\n");
        for (Books a : booklist) {
            System.out.print(a.getAuthor() + ", " + a.getTitle() + ", " + a.getPrice());
            System.out.print(" " + "\n");
        }
        System.out.print("========" + "\n");

    }

    public void sortPrice() {
        System.out.println("Sort by Price: " + "\n");
        for (Books a : booklist) {
            System.out.print(a.getPrice());
            System.out.print(" " + "\n");
        }
        System.out.print("========" + "\n");
    }
}

