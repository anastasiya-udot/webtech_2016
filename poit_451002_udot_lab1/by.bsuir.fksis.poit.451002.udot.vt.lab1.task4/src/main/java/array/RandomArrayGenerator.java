package array;

import java.util.Arrays;

/**
 * Created by anastasiya on 21.9.16.
 */
public class RandomArrayGenerator {

    private int MAX_VALUE = 100;
    private int MAX_DIMENSION = 100;

    public Integer[] getArray(){
        return fillArray(getArrayDimension());
    }

    private Integer generateValue( int max){
        // Random rand = new Random(System.currentTimeMillis());
        return   (int)((Math.random() * max * 2 + 1) - max);
    }

    private int getArrayDimension(){
        return Math.abs(generateValue(MAX_DIMENSION));
    }

    private Integer[] fillArray(int dimension){
        Integer[] array = new Integer[dimension];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateValue(MAX_VALUE);
        }
        return array;
    }

}
