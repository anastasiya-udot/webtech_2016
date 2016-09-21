package util;

import java.util.ArrayList;

/**
 * Created by anastasiya on 20.9.16.
 */
public class AnalyzerUtil{

    private Integer[] seqA, seqB;

    public ArrayList<Integer> getSequenceIndices(Integer[] seqA, Integer[] seqB){
        this.seqA = seqA;
        this.seqB = seqB;
        return findIntervals();
    }


    private ArrayList<Integer> findIntervals(){
        int indexB = 0;
        ArrayList<Integer> indices = new ArrayList<Integer>();
        for(int indexA = 0; indexA < seqA.length - 1; indexA++){
            int leftBound = seqA[indexA];
            int rightBound = seqA[indexA + 1];
            try {
                while (seqB[indexB] < leftBound) indexB++;
                boolean switcher = true;
                while ((seqB[indexB] >= leftBound) && (seqB[indexB] <= rightBound)) {
                    if (switcher) {
                        indices.add(indexA + 1);
                        switcher = false;
                    }
                    indexB++;
                }
            }
            catch( Exception e){
                indexA = seqA.length - 1;
            }
        }
        return indices;
    }


}
