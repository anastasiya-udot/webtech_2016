/**
 * Created by anastasiya on 18.9.16.
 */

import array.RandomArrayGenerator;
import erato.EratoSieve;
import search.SearchUtil;


public class Main {

    public static void main(String[] args){
        Integer[] userArray = (new RandomArrayGenerator()).getArray();
        SearchUtil searchUtil = new SearchUtil();
        EratoSieve erato = new EratoSieve(searchUtil.getMaxAbsValue(userArray));
        searchUtil.searchPrimesInArray(erato.getPrimesInt(), userArray);
    }


}
