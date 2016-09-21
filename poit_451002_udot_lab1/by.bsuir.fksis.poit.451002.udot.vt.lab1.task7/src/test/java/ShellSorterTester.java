import org.junit.Test;
import sort.ShellSorter;

import java.util.Arrays;

import static junit.framework.Assert.*;
/**
 * Created by anastasiya on 21.9.16.
 */
public class ShellSorterTester {

    private Integer[] randomArray = { 12, 78, 0, -15, 45};
    private Integer[] sortedArray = { -15, 0, 12, 45, 78};

    @Test
    public void testShellSorter(){
        (new ShellSorter()).sort(randomArray);
        assertTrue(Arrays.asList(sortedArray).equals(Arrays.asList(randomArray)));
    }
}
