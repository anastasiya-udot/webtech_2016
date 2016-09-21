import obj.MatrixManager;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.*;
/**
 * Created by anastasiya on 21.9.16.
 */
public class MatrixTester {

    private Integer[] originalArray = {1, 2 , 3, 4};
    private Integer[][] resultMatrix = {{1, 2 , 3, 4},
                                        {2, 3, 4, 1},
                                        {3, 4, 1, 2},
                                        {4, 1, 2, 3}};

    @Test
    public void testMatrixGenerator(){
        MatrixManager matrixManager = new MatrixManager(originalArray);
        Integer[][] matrix = matrixManager.getMatrix();
        for (int counter = 0; counter < 4; counter++)
            assertTrue(Arrays.asList(matrix[counter]).equals(Arrays.asList(resultMatrix[counter])));
    }
}
