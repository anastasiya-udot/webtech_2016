import obj.MatrixManager;
/**
 * Created by anastasiya on 19.9.16.
 */
public class Main {

    static int MAX_VALUE = 100;
    static int MAX_DIMENSION = 20;
    private static Integer[] originalArray = {1, 2 , 3, 4};

    public static void main(String[] args){
       // Integer[] originalArray = fillArray(getArrayDimension());
        MatrixManager matrixManager = new MatrixManager(originalArray);
        matrixManager.printMatrix();
    }

    private static Integer generateValue( int max){
        return (int)((Math.random() * max * 2 + 1) - max);
    }

    private static int getArrayDimension(){
        return Math.abs(generateValue(MAX_DIMENSION));
    }

    private static Integer[] fillArray(int dimension){
        Integer[] array = new Integer[dimension];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateValue(MAX_VALUE);
        }
        return array;
    }
}
