import array.RandomArrayGenerator;
import obj.NodesArray;
import org.junit.Test;

import static junit.framework.Assert.*;
/**
 * Created by anastasiya on 21.9.16.
 */
public class TestNodesArray {

    private Integer[] array = { -25, 12, 78, 0, 47, 21, 96, 48, 100};

    @Test
    public void testNodesArray(){
        NodesArray nodes = new NodesArray(array);
        nodes.setStates();
        assertEquals(4, nodes.length() - nodes.getMaxStateInArray());
    }
}
