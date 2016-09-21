import io.Table;
import org.junit.Test;
import function.Function;
import java.util.ArrayList;

import static junit.framework.Assert.*;
/**
 * Created by anastasiya on 21.9.16.
 */
public class FunctionTester {

    @Test
    public void testFunction(){
        Function func = new Function();
        Table table = new Table();
        func.setA(45.0);
        func.setB(-45.0);
        func.setH(90.0);
        func.startCalculation(table);

        ArrayList<Double> yValues = new ArrayList<Double>();
        yValues.add(-1.0);
        yValues.add(1.0);

        assertTrue(yValues.equals(table.getFuncValues()));
    }
}
