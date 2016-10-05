import Task12Comparable.BookIsbn;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
@Test
public class TestTask12Comparable {

    BookIsbn isbn = new BookIsbn(1);
    BookIsbn isbn1 = new BookIsbn(123);
    BookIsbn isbn2 = new BookIsbn(12);
    BookIsbn isbn3 = new BookIsbn(56);
    BookIsbn isbn4 = new BookIsbn(15);
    BookIsbn isbn5 = new BookIsbn(15);


    public void checkIsbn(){
        Assert.assertTrue(isbn.compareTo(isbn1) < 0);
        Assert.assertTrue(isbn.compareTo(isbn2) < 0);
        Assert.assertTrue(isbn1.compareTo(isbn2) > 0);
        Assert.assertTrue(isbn1.compareTo(isbn3) > 0);
        Assert.assertTrue(isbn3.compareTo(isbn1) < 0);
        Assert.assertTrue(isbn4.compareTo(isbn5) == 0);
    }

}


