package erato;

import java.util.Arrays;
import java.util.ArrayList;
/**
 * Created by anastasiya on 18.9.16.
 */
public class EratoSieve {

    private boolean[] primesBoolean;
    private ArrayList<Integer> primesInt;
    private int sieveDimension;

    private void setSieveDimension(int dimension){
        this.sieveDimension = dimension;
    }

    public ArrayList<Integer> getPrimesInt(){
        return primesInt;
    }

    private void setPrimesInt(){
        primesInt = new ArrayList<Integer>();
        for( int count = 0; count < primesBoolean.length; count++){
            if (primesBoolean[count]){
                primesInt.add(count);
            }
        }
    }

    public EratoSieve(int maxValue){
        setSieveDimension(maxValue);
        primesBoolean = new boolean[sieveDimension + 1];
        fillSieve();
        setPrimesInt();
    }


    private void fillSieve(){
        Arrays.fill(primesBoolean,true);
        primesBoolean[0] = false;
        primesBoolean[1] = false;
        for (int count1 = 2; count1 < primesBoolean.length; count1++ ){
            if (primesBoolean[count1]){
                for (int count2 = 2; count1 * count2 < primesBoolean.length; count2++){
                    primesBoolean[count1 * count2] = false;
                }
            }
        }
    }

}
