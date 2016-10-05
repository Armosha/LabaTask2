import Task13.ProgrammerBook;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestTask13 {

    ProgrammerBook b = new ProgrammerBook();
    ProgrammerBook b1 = new ProgrammerBook();
    ProgrammerBook b2 = new ProgrammerBook();

    public void checkProgrammerBookEquals() {

        b.setLanguage("English");
        b.setLevel(5);
        b1.setLanguage("English");
        b1.setLevel(5);
        b2.setLanguage("English");
        b2.setLevel(2);

        Assert.assertTrue(b.equals(b1));
        Assert.assertFalse(b2.equals(b1));
        Assert.assertTrue(b1.hashCode() == b.hashCode());
        Assert.assertFalse(b1.hashCode() == b2.hashCode());


        System.out.println("Hashcode B: " + b.hashCode());
        System.out.println("Hashcode B1: " + b1.hashCode());
        System.out.println("Hashcode B2: " + b2.hashCode());
        System.out.println(b.toString());
        System.out.println(b2.toString());

    }
}