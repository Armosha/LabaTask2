import Task13.Book;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class TestTask13Book {

    Book book1 = new Book();
    Book book2 = new Book();

    public void checkEquals() {

        book1.setAuthor("Jerome Klapka Jerome");
        book1.setTitle("Three Men in a Boat");
        book1.setPrice(16);
        book2.setAuthor("Стругацкий");
        book2.setTitle("Понедельник начинается в субботу");
        book2.setPrice(16);

        Assert.assertFalse(book1.equals(book2));
        Assert.assertFalse(book1.hashCode() == book2.hashCode());

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book1.equals(book2));
        System.out.println(book2.hashCode());
        System.out.println(book1.hashCode());

    }
}
