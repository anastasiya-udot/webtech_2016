import obj.Book;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.*;
/**
 * Created by anastasiya on 21.9.16.
 */
public class ComparableTester {

    private static int MAX_ISBN = 40;

    private Book[] generateBooks(){
        Book[] books = {new Book("a", "b", 100),
                        new Book("z", "k", 50),
                        new Book("n", "s", 80),
                        new Book("h", "y", 120),
                        new Book("a", "w", 300),
                        new Book("a", "w", 150),
                        new Book("s", "a", 80),
                        new Book("a", "w", 110)};
        return books;
    }

    private void generateIsbn(Book[] books){
        for(Book book: books){
            book.setIsbn((int)(Math.random()  * MAX_ISBN + 1));
        }
    }

    @Test
    public void testComparable(){
        Book[] books = generateBooks();
        generateIsbn(books);
        Arrays.sort(books);
    }
}
