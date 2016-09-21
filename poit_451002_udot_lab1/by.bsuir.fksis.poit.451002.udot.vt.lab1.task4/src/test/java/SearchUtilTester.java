import erato.EratoSieve;
import org.junit.Test;
import search.SearchUtil;
import java.util.ArrayList;
import static junit.framework.Assert.*;
/**
 * Created by anastasiya on 21.9.16.
 */
public class SearchUtilTester {

    private Integer[] randomArray = {- 53, 23, 79, -120, 0, 100, 41};

    private ArrayList<Integer> getIndices(){
        ArrayList<Integer> indices = new ArrayList<Integer>();
        indices.add(0);
        indices.add(1);
        indices.add(2);
        indices.add(6);
        return indices;
    }


    @Test
    public void testSearchUtilMaxAbsValue(){
        SearchUtil searchUtil = new SearchUtil();
        assertEquals(120, searchUtil.getMaxAbsValue(randomArray));
    }

    @Test
    public void testSearchValuePrimesInArray(){
        SearchUtil searchUtil = new SearchUtil();
        EratoSieve erato = new EratoSieve(searchUtil.getMaxAbsValue(randomArray));
        ArrayList<Integer> primesIndices = searchUtil.searchPrimesInArray(erato.getPrimesInt(), randomArray);
        assertTrue(primesIndices.equals(getIndices()));
    }
}
