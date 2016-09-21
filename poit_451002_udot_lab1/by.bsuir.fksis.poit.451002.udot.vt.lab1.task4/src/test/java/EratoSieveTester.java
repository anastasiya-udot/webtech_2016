import erato.EratoSieve;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.*;
/**
 * Created by anastasiya on 21.9.16.
 */
public class EratoSieveTester {

    private ArrayList<Integer> getPrimes(){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        return primes;
    }
    @Test
    public void testEratoSieve(){
        EratoSieve erato = new EratoSieve(10);
        assertTrue(erato.getPrimesInt().equals(getPrimes()));
    }

}
