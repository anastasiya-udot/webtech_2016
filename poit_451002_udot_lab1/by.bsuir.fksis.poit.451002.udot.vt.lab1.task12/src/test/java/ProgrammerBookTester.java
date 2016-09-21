import obj.Book;
import obj.ProgrammerBook;
import org.junit.Test;
import static junit.framework.Assert.*;
/**
 * Created by anastasiya on 21.9.16.
 */
public class ProgrammerBookTester {

    @Test
    public void testProgrammerBookHash(){
        ProgrammerBook prBook1 = new ProgrammerBook("Smb", "Smth", 100, "english", 3);
        ProgrammerBook prBook2 = new ProgrammerBook("Smb", "Smth", 100, "english", 3);
        assertEquals(prBook1.hashCode(), prBook2.hashCode());
        assertEquals("smb".hashCode() + "smth".hashCode() + 50 + "english".hashCode() + 3, prBook1.hashCode());
    }

    @Test
    public void testProgrammerBookEquals(){
        ProgrammerBook prBook1 = new ProgrammerBook("Smb", "Smth", 100, "english", 3);
        ProgrammerBook prBook2 = new ProgrammerBook("Smb", "Smth", 100, "english", 3);;
        assertTrue(prBook1.equals(prBook2));
    }
}
