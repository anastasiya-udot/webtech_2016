package array;

import java.util.ArrayList;

/**
 * Created by anastasiya on 21.9.16.
 */
public class ArrayManager {

    private int MAX_VALUE = 100;
    private int MAX_DIMENSION = 50;
    private Integer[] array;

    public Integer[] getArray(){
        return this.array;
    }

    public ArrayManager(){
        this.array = fillArray();
    }

    public void printArray(Integer[] array){
        for(int elemment: array){
            System.out.print(elemment + " ");
        }
    }

    private Integer generateValue( int max){
        return   (int)((Math.random() * max * 2 + 1) - max);
    }

    private int getArrayDimension(){
        return Math.abs(generateValue(MAX_DIMENSION));
    }

    private Integer[] fillArray(){
        Integer[] array = new Integer[getArrayDimension()];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateValue(MAX_VALUE);
        }
        return array;
    }
}
