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

    TitleComparator tcomp = new TitleComparator();
    TitleAuthorComparator tacomp = new TitleAuthorComparator();
    AuthorTitleComparator atcomp = new AuthorTitleComparator();
    AuthorTitlePriceComparator allcomp = new AuthorTitlePriceComparator();

    Books books = new Books(18, "Bulgakov", "Master and Margarita");
    Books books1 = new Books(17, "Orlov", "Altist Danilov");
    Books books2 = new Books(14, "Perumov", "Rozhdenie Maga");
    Books books3 = new Books(14, "Perumov", "Rozhdenie Maga");


    public void checkTitle() {
        Assert.assertTrue(tcomp.compare(books, books1) > 0);
        Assert.assertTrue(tcomp.compare(books2, books1) > 0);
        Assert.assertTrue(tcomp.compare(books2, books) > 0);
        Assert.assertTrue(tcomp.compare(books, books2) < 0);
        Assert.assertTrue(tcomp.compare(books2, books3) == 0);
    }

    public void checkSortTitleAuthor() {
        Assert.assertTrue(tacomp.compare(books, books2) < 0);
        Assert.assertTrue(tacomp.compare(books1, books2) < 0);
        Assert.assertFalse(tacomp.compare(books2, books) < 0);
        Assert.assertFalse(tacomp.compare(books2, books) == 0);
    }

    public void checkAuthorTitle() {
        Assert.assertTrue(atcomp.compare(books, books1) < 0);
        Assert.assertTrue(atcomp.compare(books1, books2) < 0);
        Assert.assertTrue(atcomp.compare(books, books2) < 0);
        Assert.assertTrue(atcomp.compare(books2, books3) == 0);
    }

    public void checkAuthorTitlePrice() {
        Assert.assertTrue(allcomp.compare(books, books1) < 0);
        Assert.assertTrue(allcomp.compare(books1, books2) < 0);
        Assert.assertTrue(allcomp.compare(books, books2) < 0);
        Assert.assertTrue(allcomp.compare(books2, books3) == 0);
    }


    public void titleExample() {
        Comparator<Books> com = new TitleComparator();
        Set<Books> booklist = new TreeSet<Books>(com);
        booklist.add(books);
        booklist.add(books1);
        booklist.add(books2);
        booklist.add(books3);
        for (Books b : booklist) {
            System.out.println(b.getTitle());
        }

        System.out.println();
    }

    public void authorTitleExample() {
        Comparator<Books> com = new AuthorTitleComparator();
        Set<Books> booklist = new TreeSet<Books>(com);
        booklist.add(books);
        booklist.add(books1);
        booklist.add(books2);
        for (Books b : booklist) {
            System.out.println(b.getAuthor() + ", " + b.getTitle());
        }
        System.out.println();

    }

    public void titleAuthorExample() {
        Comparator<Books> com = new TitleAuthorComparator();
        Set<Books> booklist = new TreeSet<Books>(com);
        booklist.add(books);
        booklist.add(books1);
        booklist.add(books2);
        booklist.add(books3);
        for (Books b : booklist) {
            System.out.println(b.getTitle() + ", " + b.getAuthor());
        }
        System.out.println();
    }

    public void titleAuthorPriceExample() {
        Comparator<Books> com = new AuthorTitlePriceComparator();
        Set<Books> booklist = new TreeSet<Books>(com);
        booklist.add(books);
        booklist.add(books1);
        booklist.add(books2);
        booklist.add(books3);
        for (Books b : booklist) {
            System.out.println(b.getAuthor() + ", " + b.getTitle() + ", " + b.getPrice());
        }
    }
}
