import Task12Comparator.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
@Test
public class TestTask12Comparator {

    Comparator<Books> comp = new PriceComparator();
    Set<Books> booklist = new TreeSet<Books>(comp);

    Books books = new Books(18, "Bulgakov", "Master and Margarita");
    Books books1 = new Books(17, "Orlov", "Altist Danilov");
    Books books2 = new Books(14, "Perumov", "Rozhdenie Maga");
    Books books3 = new Books(14, "Perumov", "Rozhdenie Maga");

    PriceComparator pr = new PriceComparator();
    AuthorComparator acomp = new AuthorComparator();
    TitleComparator tcomp = new TitleComparator();

    public void checkSortPrice() {
        Assert.assertTrue(pr.compare(books, books2) > 0);
        Assert.assertTrue(pr.compare(books1, books2) > 0);
        Assert.assertFalse(pr.compare(books2, books) > 0);
        Assert.assertFalse(pr.compare(books2, books) == 0);
    }

    public void checkAuthor() {
        Assert.assertTrue(acomp.compare(books, books1) < 0);
        Assert.assertTrue(acomp.compare(books1, books2) < 0);
        Assert.assertTrue(acomp.compare(books, books2) < 0);
        Assert.assertTrue(acomp.compare(books2, books3) == 0);
    }

    public void checkTitle() {
        Assert.assertTrue(tcomp.compare(books, books1) > 0);
        Assert.assertTrue(tcomp.compare(books2, books1) > 0);
        Assert.assertTrue(tcomp.compare(books2, books) > 0);
        Assert.assertTrue(tcomp.compare(books, books2) < 0);
        Assert.assertTrue(tcomp.compare(books2, books3) == 0);
    }

    public void priceExample() {
        booklist.add(books);
        booklist.add(books1);
        booklist.add(books2);
        for (Books b : booklist) {
            System.out.println(b.getPrice());
        }
    }

    public void authorExample() {
        Comparator<Books> com = new AuthorComparator();
        Set<Books> booklist = new TreeSet<Books>(com);
        booklist.add(books);
        booklist.add(books1);
        booklist.add(books2);
        for (Books b : booklist) {
            System.out.println(b.getAuthor());
        }
    }

    public void titleExample() {
        Comparator<Books> com = new TitleComparator();
        Set<Books> booklist = new TreeSet<Books>(com);
        booklist.add(books);
        booklist.add(books1);
        booklist.add(books2);
        for (Books b : booklist) {
            System.out.println(b.getTitle());
        }
    }
}
