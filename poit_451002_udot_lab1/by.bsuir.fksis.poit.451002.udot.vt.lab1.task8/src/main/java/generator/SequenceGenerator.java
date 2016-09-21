package generator;

/**
 * Created by anastasiya on 20.9.16.
 */
public class SequenceGenerator {

    private int MAX_DIMENSION = 30;

    public Integer[] getSequence(int step){
       return fillArray(getArrayDimension(), step);
    }

    private Integer generateValue( int max){
        return   (int)((Math.random() * max  + 1));
    }

    private int getArrayDimension(){
        return Math.abs(generateValue(MAX_DIMENSION));
    }

    private Integer[] fillArray(int dimension, int step){
        Integer[] array = new Integer[dimension];
        array[0] = generateValue(step);
        for (int i = 1; i < array.length; i++) {
            array[i] = generateValue(step) + array[i - 1];
        }
        return array;
    }
}
