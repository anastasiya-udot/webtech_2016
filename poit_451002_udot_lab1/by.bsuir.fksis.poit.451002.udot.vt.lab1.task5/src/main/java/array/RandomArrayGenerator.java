package array;

/**
 * Created by anastasiya on 21.9.16.
 */
public class RandomArrayGenerator {


    private static int MAX_VALUE = 100;
    private static int MAX_DIMENSION = 20;

    private Integer generateValue( int max){
        return   (int)((Math.random() * max * 2 + 1) - max);
    }

    private int getArrayDimension(){
        return Math.abs(generateValue(MAX_DIMENSION));
    }

    public Integer[] fillArray(){
        Integer[] array = new Integer[getArrayDimension()];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateValue(MAX_VALUE);
        }
        return array;
    }
}
