package Task12Comparator;

import java.util.Comparator;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */

public class TitleComparator implements Comparator<Books> {

    @Override
    public int compare(Books o1, Books o2) {
        return o1.getTitle().compareToIgnoreCase(o2.getTitle());
    }
}