import util.ExpressionUtil;
import org.junit.Test;

import static junit.framework.Assert.*;
/**
 * Created by anastasiya on 21.9.16.
 */
public class ExpressionUtilTester {

    @Test
    public void testExpressionResult() {
        ExpressionUtil expression = new ExpressionUtil();

        expression.setValueX(0.0);
        expression.setValueY(0.0);
        assertEquals( expression.execute(), 0.5);

        expression.setValueX(0.1);
        expression.setValueY(0.1);
        assertEquals(expression.execute(), 0.5949901913392871);
    }

}
