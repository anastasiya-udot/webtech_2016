package search;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by anastasiya on 21.9.16.
 */
public class SearchUtil {

    public ArrayList<Integer> searchPrimesInArray(ArrayList<Integer> primes, Integer[] array){
        ArrayList<Integer> primesIndices = new ArrayList<Integer>();
        for( Integer counter = 0; counter < array.length; counter++){
            if (primes.indexOf(Math.abs(array[counter])) != -1){
                System.out.println("[" + counter + "] => " + array[counter]);
                primesIndices.add(counter);
            }
        }
        infer(primesIndices);
        return primesIndices;
    }

    private void infer(ArrayList<Integer> primes){
        if (primes.size() == 0) {
            System.out.println("No primes");
        } else {
            System.out.println("All primes have been found");
        }
    }

    public int getMaxAbsValue(Integer[] array){
        Integer[] copyarray = new Integer[array.length];
        System.arraycopy(array, 0, copyarray, 0, array.length);
        Arrays.sort(copyarray);
        int lastValue = Math.abs(copyarray[copyarray.length - 1]);
        int firstValue = Math.abs(copyarray[0]);
        return firstValue <= lastValue ? lastValue : firstValue;
    }
}
