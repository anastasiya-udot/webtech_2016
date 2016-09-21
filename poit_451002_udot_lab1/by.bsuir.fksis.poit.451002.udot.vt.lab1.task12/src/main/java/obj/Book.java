package obj;

import java.util.Comparator;
/**
 * Created by anastasiya on 21.9.16.
 */
public class Book implements Cloneable, Comparable<Book>{

    private String author;
    private String title;
    private int price;
    private static int edition;
    private int isbn;

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public int getIsbn() {
        return this.isbn;
    }

    @Override
    public int compareTo(Book book){
        return (this.isbn - book.isbn);
    }


    @Override
    public Book clone() {
        try {
            return (Book)super.clone();
        }
        catch( CloneNotSupportedException ex ) {
            throw new InternalError();
        }
    }

    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }

    public int getPrice(){
        return this.price;
    }


    public Book(String author, String title, int price){
        this.author = author;
        this.title = title;
        this.price = price;
        this.isbn = 0;
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
        Book book = (Book) object;
        return checkProperies(this, book);
    }

    private boolean checkProperies(Book book1, Book book2){
        return ((book1.getTitle() == book2.getTitle()) &&
                (book1.getAuthor() == book2.getAuthor()) &&
                (book1.getPrice() == book2.getPrice()));
    }

    @Override
    public int hashCode()
    {
        int author, title, price;
        author = this.getAuthor().toLowerCase().hashCode();
        title = this.getTitle().toLowerCase().hashCode();
        price = this.getPrice();
        return  author + title + price;
    }

    @Override
    public String toString(){
        return this.getTitle() + ", " + this.getAuthor() + " " + this.getPrice() + "$";
    }


}
