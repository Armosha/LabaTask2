package Task12Comparator;

import java.util.Comparator;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */

public class AuthorComparator implements Comparator<Books> {

    @Override
    public int compare(Books ob1, Books ob2) {

        return ob1.getAuthor().compareToIgnoreCase(ob2.getAuthor());
    }
}
