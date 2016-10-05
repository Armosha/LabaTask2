package Task13;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */

public class Book implements Cloneable {
    private String title;
    private String author;
    private int price;
    private static int edition;


    public Book() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Book book = (Book) obj;
        if (this.price != book.getPrice()) {
            return false;
        }
        if (null == this.author) {
            return (this.author == book.getAuthor());
        } else if (!this.author.equals(book.getAuthor())) {
            return false;
        }
        if (null == this.title) {
            return (this.title == book.getTitle());
        } else {
            if (!this.title.equals(book.getTitle())) {
                return false;
            }
        }
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.author == null) ? 0 : author.hashCode());
        result = prime * result + ((this.title == null) ? 0 : title.hashCode());
        result = prime * result + getPrice();

        return result;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str = str.append(title)
                .append(", ")
                .append(author)
                .append(", ")
                .append(price)
                .append(", ");
        return str.toString();
    }


    @Override
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }
}

