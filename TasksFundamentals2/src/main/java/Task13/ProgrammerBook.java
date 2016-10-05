package Task13;

/**
 * Created by Iryna_Filipava1 on 10/3/2016.
 */
public class ProgrammerBook extends Book {

    public ProgrammerBook(){

    }

    private String language;
    private int level;
    private String title;
    private String author;
    private int price;

    public void setTitle(String title){
        super.setTitle(title);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) {
            return false;
        }
        ProgrammerBook b = (ProgrammerBook) obj;
        if (this.level != b.getLevel()) {
            return false;
        }
        if (null == this.language) {
            return (this.language == b.getLanguage());
        } else if (!this.language.equals(b.getLanguage())) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str = str.append(language)
                .append(", ")
                .append(level);
        return str.toString();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.language == null) ? 0 : language.hashCode());
        result = prime * result + getLevel();
        result = super.hashCode() * 31 + result;
        return result;

    }
}

