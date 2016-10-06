package Task12Comparator;


import java.util.Comparator;

public class TitleAuthorComparator implements Comparator<Books> {

    @Override
    public int compare(Books o1, Books o2) {

        if (!o1.getTitle().equals(o2.getTitle())) {
            return o1.getTitle().compareToIgnoreCase(o2.getTitle());
        }
        if (!o1.getAuthor().equals(o2.getAuthor())) {
            return o1.getAuthor().compareToIgnoreCase(o2.getAuthor());
        }
        return 0;
    }
}
