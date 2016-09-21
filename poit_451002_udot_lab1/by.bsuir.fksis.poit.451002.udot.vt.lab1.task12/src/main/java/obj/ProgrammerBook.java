package obj;

import obj.Book;

/**
 * Created by anastasiya on 21.9.16.
 */
public class ProgrammerBook extends Book implements Cloneable {

    private String language;
    private int level;

    public String getLanguage(){
        return this.language;
    }

    public int getLevel(){
        return this.level;
    }

    public ProgrammerBook(String author, String title, int price, String lang, int level){
        super(author, title, price);
        this.language = lang;
        this.level = level;
    }

    @Override
    public boolean equals(Object object) {
        if(object == null)
        {
            return false;
        }
        if (object == this)
        {
            return true;
        }
        if (getClass() != object.getClass())
        {
            return false;
        }
        ProgrammerBook book = (ProgrammerBook) object;
        return checkProperies(this, book);
    }

    private boolean checkProperies(ProgrammerBook book1, ProgrammerBook book2){
        return ((book1.getTitle() == book2.getTitle()) &&
                (book1.getAuthor() == book2.getAuthor()) &&
                (book1.getPrice() == book2.getPrice()) &&
                (book1.getLanguage() == book2.getLanguage()) &&
                (book1.getLevel() == book2.getLevel()));
    }


    @Override
    public int hashCode()
    {
        int author, title, price, lang, level;
        author = this.getAuthor().toLowerCase().hashCode();
        title = this.getTitle().toLowerCase().hashCode();
        price = this.getPrice();
        lang = this.getLanguage().toLowerCase().hashCode();
        level = this.getLevel();
        return  author + title + price + lang + level;
    }

    @Override
    public String toString(){
        String bookProperties = this.getTitle() + ", " + this.getAuthor() + " " + this.getPrice() + "$ ";
        return bookProperties + "(" + this.getLanguage() + ") level " + this.getLevel();
    }


}
