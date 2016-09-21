import org.junit.Test;
import util.AnalyzerUtil;

import java.util.Arrays;

import static junit.framework.Assert.*;
/**
 * Created by anastasiya on 21.9.16.
 */
public class AnalyzerUtilTester {

    private Integer[] seqA = {7, 8, 23, 24, 33, 37, 51, 58 };
    private Integer[] seqB = {5, 7, 10, 14, 18, 19, 21, 25, 26, 31, 35, 36, 41, 45, 48, 50, 54};
    private Integer[] result = {1, 2, 4, 5, 6, 7 };

    @Test
    public void testAnalyzerUtil(){
        AnalyzerUtil analyzerUtil = new AnalyzerUtil();
        assertTrue(analyzerUtil.getSequenceIndices(seqA, seqB).equals(Arrays.asList(result)));
    }
}
