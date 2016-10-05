package Task12Comparator;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
public class Books {

    private String title;
    private String author;
    private int price;


    public Books(int price, String author, String title) {
        this.price = price;
        this.author = author;
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor() {
        this.author = author;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle() {
        this.title = title;
    }

}
