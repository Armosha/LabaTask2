package Task12Comparable;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookSort {

    List<BookIsbn> list = new ArrayList<BookIsbn>();

    public List<BookIsbn> getListofBook() {
        list.add(new BookIsbn(1, 45, "Brawn", "Da Vinci Code"));
        list.add(new BookIsbn(45, 34, "Jerome K. Jerome", "Three mens in the boat"));
        list.add(new BookIsbn(3, 45, "Jerom", "Three mens in the boat"));
        list.add(new BookIsbn(12, 3, "Andersen", "Fairy tail"));
        list.add(new BookIsbn(5, 3, "Andersen", "Fairy tail"));
        return list;
    }

    public void sortListIsbn() {
        Collections.sort(list);
        for (BookIsbn a : list) {
            System.out.println(a.getIsbn() + " " + a.getPrice() + " " + a.getAuthor() + " " + a.getTitle() + "\n");
        }

    }

}
