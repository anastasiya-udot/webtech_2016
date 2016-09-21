package comparartor;

import obj.Book;
import java.util.Comparator;

/**
 * Created by anastasiya on 21.9.16.
 */
public class BookTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2){
        return book1.getTitle().compareTo(book2.getTitle());
    }

}
