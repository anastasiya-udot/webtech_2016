
import obj.Book;
import org.junit.Test;
import static junit.framework.Assert.*;
/**
 * Created by anastasiya on 21.9.16.
 */
public class BookTester {

    @Test
    public void testBookHash(){
        Book book1 = new Book("Smb", "Smth", 50);
        Book book2 = new Book("Smb", "Smth", 50);
        assertEquals(book1.hashCode(), book2.hashCode());
        assertEquals("smb".hashCode() + "smth".hashCode() + 50, book1.hashCode());
    }

    @Test
    public void testBookEquals(){
        Book book1 = new Book("Smb", "Smth", 50);
        Book book2 = new Book("Smb", "Smth", 50);
        assertEquals(true, book1.equals(book2));
    }

    @Test
    public void testBookClone(){
        Book book1 = new Book("Smb", "Smth", 50);
        Book book2 = book1.clone();
        assertFalse(book1 == book2);
        assertTrue(book1.getAuthor() == book2.getAuthor());
    }



}
